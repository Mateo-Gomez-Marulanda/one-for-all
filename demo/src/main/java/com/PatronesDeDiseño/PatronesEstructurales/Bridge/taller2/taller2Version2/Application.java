package com.PatronesDeDiseño.PatronesEstructurales.Bridge.taller2.taller2Version2;

//taller 5 18/08/2024

//fabrica general
abstract class GUIThemeFactory{
    protected GraficElement graficElement;

    public GUIThemeFactory(GraficElement graficElement){
        this.graficElement = graficElement;
    }

    void aplicarTema(){
        graficElement.paint();
    }
}
//fabrica de tema oscuro
class DarkThemeFactory extends GUIThemeFactory{
    public DarkThemeFactory(GraficElement graficElement){
        super(graficElement);
    }

    public void aplicarTema(){
        graficElement.paint();
    }
}
//fabrica dde tema claro
class LightThemeFactory extends GUIThemeFactory{
    public LightThemeFactory(GraficElement graficElement){
        super(graficElement);
    }

    public void aplicarTema(){
        graficElement.paint();
    }
}
// interfaz de elemtos graficos botones y checkboox
interface GraficElement{
    void paint();
}

class Bottom implements GraficElement{
    public void paint(){
        System.out.println("renderizando boton");
    }
}

class Checkbox implements GraficElement{
    public void paint(){
        System.out.println("renderizando checkbox");
    }
}



public class Application {
    public static void main(String[] args) {
        //implementacion de los elementos graficos

        GraficElement buttom = new Bottom();
        GraficElement checkBox = new Checkbox();

        //implementacion de las fabricas de temas
        GUIThemeFactory darkCheckbox = new DarkThemeFactory(checkBox);
        GUIThemeFactory darkButtom = new DarkThemeFactory(buttom);

        darkButtom.aplicarTema();
        darkCheckbox.aplicarTema();

        
    }
}
    