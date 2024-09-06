package com.example.PatronesCreacionales.Builder.taller3;

public class Smartphone {
    
    private String model;
    private String storage;
    private String ram;
    private String os ;
    private String resolucion;
    
    public Smartphone(String model, String storage, String ram, String os, String resolucion) {
        this.model = model;
        this.storage = storage;
        this.ram = ram;
        this.os = os;
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Smartphone [model=" + model + ", storage=" + storage + ", ram=" + ram + ", OS=" + os + ", resolucion="
                + resolucion + "]";
    }

    

    
    
}
