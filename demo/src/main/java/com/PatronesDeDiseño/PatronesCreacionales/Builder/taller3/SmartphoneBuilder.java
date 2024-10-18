package com.PatronesDeDiseño.PatronesCreacionales.Builder.taller3;

class SmartphoneBuilder {
    
    private String model;
    private String storage;
    private String ram;
    private String os ;
    private String resolucion;
    
    public SmartphoneBuilder setModel(String model){
        this.model = model;
        return this;
    }

    public SmartphoneBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public SmartphoneBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public SmartphoneBuilder setOS(String os) {
        this.os = os;
        return this;
    }

    public SmartphoneBuilder setResolucion(String resolucion) {
        this.resolucion = resolucion;
        return this;
    }

    public Smartphone build(){
        return new Smartphone(this.model, this.storage, this.ram, this.os , this.resolucion); 
    }
    
}