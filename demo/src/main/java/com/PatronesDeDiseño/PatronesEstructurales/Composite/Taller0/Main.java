package com.PatronesDeDiseño.PatronesEstructurales.Composite.Taller0;

import java.util.List;
import java.util.ArrayList;

interface Componente {
    int obtenerTamanio();

    String obtenerNombre();
}

class Archivo implements Componente {
    private String nombre;
    private int tamanio;

    public Archivo(String nombre, int tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    @Override
    public int obtenerTamanio() {
        return tamanio;
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }
}

class Carpeta implements Componente {
    private List<Componente> componentes = new ArrayList<>();
    private String nombre;

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregarComponente(Componente componente) {
        componentes.add(componente);
    }

    @Override
    public int obtenerTamanio() {
        int tamanioTotal = 0;
        for (Componente componente : componentes) {
            tamanioTotal += componente.obtenerTamanio();
        }
        return tamanioTotal;
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }
}

public class Main {
    public static void main(String[] args) {
        Componente archivo1 = new Archivo("tarea", 234);
        Componente archivo2 = new Archivo("archivo", 321);

        Carpeta carpeta1 = new Carpeta("cosas");
        carpeta1.agregarComponente(archivo2);
        carpeta1.agregarComponente(archivo1);

        Carpeta subCarpeta = new Carpeta("subcarpeta");
        subCarpeta.agregarComponente(carpeta1);
        subCarpeta.obtenerTamanio();

        System.out.println(subCarpeta.obtenerTamanio());
    };
}
