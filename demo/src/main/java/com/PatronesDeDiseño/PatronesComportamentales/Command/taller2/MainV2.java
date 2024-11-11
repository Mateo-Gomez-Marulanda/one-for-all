package com.PatronesDeDiseño.PatronesComportamentales.Command.taller2;

import java.util.ArrayList;
import java.util.List;

// patron observer
interface Observer {
    void update(String mensaje);
}

class Usuario implements Observer {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String mensaje) {
        System.out.println("Señor/a " + nombre + " tiene una notificacion: " + mensaje);
    }
}

class CuentaBancaria {
    private double saldo;
    private List<Observer> observers = new ArrayList<>();

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void agregarObserver(Observer observer) {
        observers.add(observer);
    }

    public void elimiarObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificar(String mensaje) {
        for (Observer observer : observers) {
            observer.update(mensaje);
        }
    }

    public void depositar(double monto) {
        saldo += monto;
        notificar("se depositaron: " + monto);
    }

    public void retirar(double monto) {
        saldo -= monto;
        notificar("se retiro: " + monto);
    }

    public double getSaldo() {
        return saldo;
    }
}

// patron command
interface Command {
    void execute();
}

class Transaccion implements Command {

    private CuentaBancaria emisor;
    private CuentaBancaria receptor;
    private double monto;

    public Transaccion(CuentaBancaria emisor, CuentaBancaria receptor, double monto) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.monto = monto;
    }

    @Override
    public void execute() {
        emisor.retirar(monto);
        receptor.depositar(monto);
        System.out.println("transaccion realizada por el valor de: " + monto);

    }
}

// patron cadena de responsavilidad

abstract class Manejador {
    protected Manejador manejador;

    public void setManejador(Manejador manejador) {
        this.manejador = manejador;
    }

    public abstract void nextHanlder(Command command);
}

class VerificarSaldo extends Manejador {

    private CuentaBancaria cuenta;
    private double monto;

    public VerificarSaldo(CuentaBancaria cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void nextHanlder(Command command) {
        if (cuenta.getSaldo() >= monto) {
            manejador.nextHanlder(command);
        } else {
            System.out.println("Error: fundos insuficientes");
        }
    }
}

class VerificacionAuditoria extends Manejador {

    private CuentaBancaria cuenta;

    public VerificacionAuditoria(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void nextHanlder(Command command) {
        if (cuenta != null) {
            System.out.println("auditoria aceptada");
            manejador.nextHanlder(command);
        } else {
            System.out.println("Error: cuenta no encontrada");
        }
    }
}

class Procesador {
    private Manejador manejador;

    public Procesador(Manejador manejador) {
        this.manejador = manejador;
    }

    public void InicializarCadena(Command command) {
        manejador.nextHanlder(command);
        command.execute();
    }
}

public class MainV2 {
    public static void main(String[] args) {

        Observer usuario = new Usuario("pepe ");
        Observer usuario2 = new Usuario("marta");

        CuentaBancaria cuenta = new CuentaBancaria(300);
        cuenta.agregarObserver(usuario);

        CuentaBancaria cuenta2 = new CuentaBancaria(200);
        cuenta2.agregarObserver(usuario2);

        Command command = new Transaccion(cuenta, cuenta2, 200);

        Manejador manejador = new VerificarSaldo(cuenta, 1);

        Procesador procesador = new Procesador(manejador);

        procesador.InicializarCadena(command);

    }
}
  