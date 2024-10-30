package com.PatronesDeDiseño.PatronesComportamentales.Observer.Taller0;

import java.util.ArrayList;
import java.util.List;

//Ejemplo clase del 18/10/2024

//se crea clase sujeto el cual tiene referencia a una lista de observadores
class EstacionClima {
    private List<Observer> observers = new ArrayList<>(); //atributo para vincular los sujetos y observer
    
    private int temperatura;

    public void agregarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificar() {
        for (Observer observer : observers) {
            observer.update(temperatura);
        }
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        notificar();

    }
}

//se crea interfaz observer con un metodo comun 
interface Observer {
    void update(int temperatura);
}

//se implementa al interfaz observer
class Display implements Observer{
    @Override
    public void update(int temperatura){
        System.out.println("la temperatura es: " + temperatura);
    }
}

public class Main {
    public static void main(String[] args) {
        Observer display = new Display();
        EstacionClima estacion = new EstacionClima();

        estacion.agregarObserver(display);
        display.update(23);
        estacion.setTemperatura(34);
    }
}
