package com.example.PatronesCreacionales.AbstracFactory.taller1;

public class SamsungSmartphone implements ISmartphone {

    private String model;
    private String storage;
    private String ram;
    private String os;
    private String resolucion;

    public SamsungSmartphone(String model, String storage, String ram, String os, String resolucion) {
        this.model = model;
        this.storage = storage;
        this.ram = ram;
        this.os = os;
        this.resolucion = resolucion;
    }

    public void call() {
        System.out.println("calling");
    }

    public SamsungSmartphone clonar(){
        return new SamsungSmartphone(this.model, this.storage, this.ram, this.os, this.resolucion);
    }

    @Override
    public String toString() {
        return "Samsung Smartphone [model=" + model + ", storage=" + storage + ", ram=" + ram + ", OS=" + os + ", resolucion="
                + resolucion + "]";
    }
}
