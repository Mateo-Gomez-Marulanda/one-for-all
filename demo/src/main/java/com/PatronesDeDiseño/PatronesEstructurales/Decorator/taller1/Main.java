package com.PatronesDeDiseño.PatronesEstructurales.Decorator.taller1;

//taller 25/09/2024

abstract class EditorTexto {
    public abstract String procesarTexto(String texto);
}

class TextoSimple extends EditorTexto {
    @Override
    public String procesarTexto(String texto) {
        return texto;
    }
}

abstract class DecoratorTexto extends EditorTexto {
    protected EditorTexto editorTextotexto;

    public DecoratorTexto(EditorTexto editorTexto) {
        this.editorTextotexto = editorTexto;
    }

    @Override
    public abstract String procesarTexto(String texto);

}

class ConversionMayusculas extends DecoratorTexto {
    public ConversionMayusculas(EditorTexto editorTexto) {
        super(editorTexto);
    }

    @Override
    public String procesarTexto(String texto) {
        return texto.toUpperCase();
    }
}

class CorreccionOrtografia extends DecoratorTexto {
    public CorreccionOrtografia(EditorTexto editorTexto) {
        super(editorTexto);
    }

    @Override
    public String procesarTexto(String texto) {
        return texto + ": texto con Correcion Ortografica";
    }
}


public class Main {
    public static void main(String[] args) {

        String texto = "hola mundo";

        EditorTexto editorTexto = new TextoSimple();

        editorTexto = new ConversionMayusculas(editorTexto);
        System.out.println(editorTexto.procesarTexto(texto));
       
        // inprimir cantidad letras
        System.out.println(texto.length());

        editorTexto = new CorreccionOrtografia(editorTexto);
        System.out.println(editorTexto.procesarTexto(texto));
    }
}
