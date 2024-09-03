package com.example.AbstracFactory.taller1.builder;

import com.example.AbstracFactory.taller1.GenericSmartphone;
import com.example.AbstracFactory.taller1.SamsungSmartphone;

public class SmartphoneBuilder {

    private String model;
    private String storage;
    private String ram;
    private String os;
    private String resolucion;

    public SmartphoneBuilder setModel(String model) {
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

    public void call() {
        System.out.println("calling");
    }

    public SamsungSmartphone buildSamsungSmartphone() {
        return new SamsungSmartphone(this.model, this.storage, this.ram, this.os, this.resolucion);
    }

    public GenericSmartphone buildGenericSmartphone() {
        return new GenericSmartphone(this.model, this.storage, this.ram, this.os, this.resolucion);
    }


}
