package com.PatronesDeDiseño.PatronesComportamentales.Command.taller1;

//ejercicio clase 10/30/2024

interface Device {
    void encender();

    void apagar();
}

class Luz implements Device {

    @Override
    public void encender() {
        System.out.println("encendiendo luz");
    }

    @Override
    public void apagar() {
        System.out.println("apagando luz");
    }
}

class Ventilador implements Device {

    @Override
    public void encender() {
        System.out.println("encendiendo ventilador");
    }

    @Override
    public void apagar() {
        System.out.println("apagando ventilador");
    }
}

class Calefaccion implements Device {

    @Override
    public void encender() {
        System.out.println("encendiendo calefaccion");
    }

    @Override
    public void apagar() {
        System.out.println("apagando calefaccion");
    }
}

interface Command {
    void execute();
}

class Encender implements Command {
    private Device device;

    public Encender(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.encender();
    }
}

class Apagar implements Command {
    private Device device;

    public Apagar(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.apagar();
    }
}

class Controlador {
    private Command command;

    public Controlador(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
        presionarBoton();

    }

    public void presionarBoton() {
        command.execute();
    }
}

public class Main {
    public static void main(String[] args) {
        Device ventilador = new Ventilador();
        Device calefaccion = new Calefaccion();

        Command encenderVentilador = new Encender(ventilador);
        Command encenderCalefaccion = new Encender(calefaccion);

        Controlador controlador = new Controlador(encenderVentilador);
        controlador.presionarBoton();
        controlador.setCommand(encenderCalefaccion);
        

    }
}
