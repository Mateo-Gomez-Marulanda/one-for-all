package com.PatronesDeDiseño.PatronesEstructurales.Bridge.taller4;

//pregunta 3 del parcial 2 

interface Control {
    void encender();
}

class ControlRomoto implements Control{
    @Override
    public void encender(){
        System.out.println("encendiendo luz mediante control remoto");
    }
}

class AppControl implements Control{
    @Override
    public void encender(){
        System.out.println("encendiando luz mediante control de app");
    }
}

abstract class Luces {
    protected Control control;

    public Luces(Control control) {
        this.control = control;
    }

    public void iliminar(){
        control.encender();
    }
}

class LamparaMesa extends Luces{
    public LamparaMesa (Control control){
        super(control);
    }

    @Override
    public void iliminar( ){
        control.encender();
    }
}

class LucesAmbientales extends Luces{
    public LucesAmbientales (Control control){
        super(control);
    }

    @Override
    public void iliminar(){
        control.encender();
    }
}

class LucesLed extends Luces{
    public LucesLed (Control control){
        super(control);
    }

    @Override
    public void iliminar(){
        control.encender();
    }
}

public class Main {
    public static void main(String[] args) {
      Control controlRemoto = new ControlRomoto();

      Luces luzAmbiental = new LucesAmbientales(controlRemoto);
      luzAmbiental.iliminar();
    }
}
