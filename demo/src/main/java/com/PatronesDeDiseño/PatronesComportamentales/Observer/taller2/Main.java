package com.PatronesDeDiseño.PatronesComportamentales.Observer.taller2;
//preparcial 1/11/2024

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(double precio);
}

class Pantalla implements Observer {
    @Override
    public void update(double precio) {
        System.out.println("Mostrando en pantalla: el precio de la accion esta actualmente en: " + precio);
    }
}

class SistemaAlerta implements Observer {
    @Override
    public void update(double precio) {
        System.out.println("Alerta: el precio de la accion esta actualmente en: " + precio);
    }
}

class SeguiminetoPrecios {
    private double precio;
    private List<Observer> observers = new ArrayList<>();

    public void agregarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificar() {
        for (Observer observer : observers) {
            observer.update(precio);
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        notificar();
    }
}

public class Main {
    public static void main(String[] args) {
        Observer pantalla = new Pantalla();
        SeguiminetoPrecios seguiminetoPrecios = new SeguiminetoPrecios();
        seguiminetoPrecios.agregarObserver(pantalla);
        pantalla.update(232);
        seguiminetoPrecios.setPrecio(23);


    }
}
