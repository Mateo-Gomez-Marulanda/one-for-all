package com.PatronesDeDiseño.PatronesCreacionales.Prototype.taller0;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(500);
        Car car = new Car("2024", "red", engine);
        
        engine.clonar();

        Car car2 = car.clonar();

    System.out.println(car);
    System.out.println(car2);
    }
}

