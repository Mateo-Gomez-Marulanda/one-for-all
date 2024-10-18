package com.PatronesDeDiseño.PatronesEstructurales.Bridge.taller2.taller2Version1;


//taller 5 18/08/2024

//fabrica general
interface GUIThemeFactory {
    void aplicarTema();
}

// fabricas concretas
class DarkThemeFactory implements GUIThemeFactory {
    public void aplicarTema() {
        System.out.println("renderizando elemento grafico con tema oscuro");
    }


}

class LightThemeFactory implements GUIThemeFactory {
    public void aplicarTema() {
        System.out.println("renderizando elemento grafico con tema claro");
    }
}

// clase abstracta para generalizar los elementos graficos(boton y caja de
// texto)
abstract class GraficElement {
    protected GUIThemeFactory theme;

    public GraficElement(GUIThemeFactory theme) {
        this.theme = theme;
    }

     void paint(){
        theme.aplicarTema();
    }
}

class Buttom extends GraficElement {
    public Buttom(GUIThemeFactory theme) {
        super(theme);
    }

    @Override
    public  void paint() {
        theme.aplicarTema();
    }
}

class Checkbox extends GraficElement {
    public Checkbox(GUIThemeFactory theme) {
        super(theme);
    }

    @Override
    public void paint() {
        theme.aplicarTema();
    }
}

public class Application {
    public static void main(String[] args) {
        //implementacion de las fabricas de temas

        GUIThemeFactory darkTheme = new DarkThemeFactory();
    
        GUIThemeFactory lightTheme = new LightThemeFactory();
    

        GraficElement buttom = new Buttom(darkTheme);
        GraficElement checkBox = new Checkbox(darkTheme);
        
        GraficElement buttom2 = new Buttom(lightTheme);
        GraficElement checkBox2 = new Checkbox(lightTheme);

        buttom.paint();
        checkBox.paint();

        buttom2.paint();
        checkBox2.paint();
    }
}
    