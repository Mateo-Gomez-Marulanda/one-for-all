package com.example.PatronesCreacionales.Builder.taller2;

public class Car {

    private String model;
    private String engine;
    private String transmission;
    private int wheels;
    private String color;
    private boolean airConditioning;

    public Car(String model, String engine, String transmission, int wheels, String color, boolean airConditioning) {

        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.color = color;
        this.airConditioning = airConditioning;
    }

    @Override
    public String toString() {
        return "Car [model= " + model +
                ", engine= " + engine +
                ", transmission= " + transmission +
                ", wheels= " + wheels +
                ", color= " + color +
                ", airConditioning= " + airConditioning + " ]";
    }

}
