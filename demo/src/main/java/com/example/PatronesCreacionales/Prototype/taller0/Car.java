package com.example.PatronesCreacionales.Prototype.taller0;

public class Car implements ICar{
    private String model;
    private String color;
    private Engine engine;

    public Car(String model, String color, Engine engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car clonar() {
        return new Car(this.model, this.color, this.engine);
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", color=" + color + ", engine=" + engine + "]";
    }

}
