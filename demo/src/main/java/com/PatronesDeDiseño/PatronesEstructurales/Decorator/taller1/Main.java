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
    protected EditorTexto editorTexto;

    public DecoratorTexto(EditorTexto editorTexto) {
        this.editorTexto = editorTexto;
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
        return editorTexto.procesarTexto(texto).toUpperCase();
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
        System.out.println(editorTexto.procesarTexto(texto));

        EditorTexto textoMayusculas = new ConversionMayusculas(new TextoSimple());
        System.out.println(textoMayusculas.procesarTexto(texto));

        EditorTexto correccionTexto = new CorreccionOrtografia(new TextoSimple());
        System.out.println(correccionTexto.procesarTexto(texto));

        EditorTexto textoCompleto = new ConversionMayusculas(new CorreccionOrtografia(new TextoSimple()));

        System.out.println(textoCompleto.procesarTexto(texto));
    }
}
