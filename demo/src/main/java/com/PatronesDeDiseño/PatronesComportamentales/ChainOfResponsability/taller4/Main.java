package com.PatronesDeDiseño.PatronesComportamentales.ChainOfResponsability.taller4;

import java.util.ArrayList;
import java.util.List;

//PAtron command

interface ComandoEditar {
    void execute();

    void undo();
}

class CommandoCopiar implements ComandoEditar {
    private Documento documento;
    private String textoCopiado;

    public CommandoCopiar(Documento documento) {
        this.documento = documento;
    }

    @Override
    public void execute() {
        textoCopiado = documento.getTextoSeleccionado();
        System.out.println("texto copiado : " + textoCopiado);
    }

    @Override
    public void undo() {
        System.out.println("operacion de copia deshecha");
    }
}

class ComandoPegar implements ComandoEditar {
    private Documento documento;
    private String textoAPegar;

    public ComandoPegar(Documento documento, String textoAPegar) {
        this.documento = documento;
        this.textoAPegar = textoAPegar;
    }

    @Override
    public void execute() {
        documento.insertarTexto(textoAPegar);
        System.out.println("texto pegado : " + textoAPegar);
    }

    @Override
    public void undo() {
        documento.removerTexto(textoAPegar.length());
        System.out.println("operacion de pegar deshecha");
    }
}

// PATRON OBSERVER

interface Observer {
    void update(String mesnaje);
}

class DocumentoPrevio implements Observer {
    @Override
    public void update(String mensaje) {
        System.out.println("vista previo actualizada: " + mensaje);
    }
}

class Documento {

    private StringBuilder contenido = new StringBuilder();
    private List<Observer> observers = new ArrayList<>();

    public void agregarObserver(Observer observer) {
        observers.add(observer);
    }

    public void eliminarObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificar(String mensaje) {
        for (Observer observer : observers) {
            observer.update(mensaje);
        }
    }

    public void insertarTexto(String texto) {
        contenido.append(texto);
        notificar("texto insertado: " + texto);
    }

    public void removerTexto(int length) {
        int inicio = contenido.length() - length;
        if (inicio >= 0) {
            contenido.delete(inicio, inicio + length);
            notificar("texto eliminado");
        }
    }

    public String getContenido() {
        return contenido.toString();
    }

    public String getTextoSeleccionado() {
        return "texto seleccionado";
    }
}

// CADENA DE RESPOSABILIDAD

abstract class ManejadorEditor {
    protected ManejadorEditor manejador;

    public abstract void manejar(ComandoEditar comando);

    public void setManejador(ManejadorEditor manejador) {
        this.manejador = manejador;
    }
}

class ManejadorCopiar extends ManejadorEditor {
    @Override
    public void manejar(ComandoEditar comando) {
        if (comando instanceof CommandoCopiar) {
            comando.execute();
        } else if (manejador != null) {
            manejador.manejar(comando);
        }
    }
}

class ManejadorPegar extends ManejadorEditor {
    @Override
    public void manejar(ComandoEditar comando) {
        if (comando instanceof ComandoPegar) {
            comando.execute();
        } else if (manejador != null) {
            manejador.manejar(comando);
        }
    }
}

class Editor {
    private ManejadorEditor manejador;

    public Editor(ManejadorEditor manejador) {
        this.manejador = manejador;
    }

    public void procesar(ComandoEditar comando) {
        manejador.manejar(comando);
    }
}

public class Main {
    public static void main(String[] args) {
        // crear documento
        Documento documento = new Documento();

        DocumentoPrevio documentoPrevio = new DocumentoPrevio();

        documento.agregarObserver(documentoPrevio);

        // crear comandos
        ComandoPegar comandoPegar = new ComandoPegar(documento, "waza");
        CommandoCopiar commandoCopiar = new CommandoCopiar(documento);

        // configurar cadena de manejadores
        ManejadorPegar manejadorPegar = new ManejadorPegar();
        ManejadorCopiar manejadorCopiar = new ManejadorCopiar();

        manejadorCopiar.setManejador(manejadorPegar);

        // crear editor
        Editor editor = new Editor(manejadorCopiar);

        // ejucutar
        editor.procesar(comandoPegar);
        editor.procesar(commandoCopiar);

    }
}