package com.example.Prototype.taller0;

public class Engine implements IEngine{

    private int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Engine clonar() {

        return new Engine(this.horsePower);
    }
}
