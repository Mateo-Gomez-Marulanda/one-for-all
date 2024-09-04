package com.example.AbstracFactory.taller2.builder;

import java.util.List;

import com.example.AbstracFactory.taller2.products.Laptop;
import com.example.AbstracFactory.taller2.products.Smartphone;
import com.example.AbstracFactory.taller2.products.Tablet;

public class DeviceBuilder {
    
    private String cpu;
    private String ram;
    private String storage;
    private String os;
    private List<String> aplications;
    
    public DeviceBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public DeviceBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public DeviceBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public DeviceBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public DeviceBuilder setAplications(List<String> aplications) {
        this.aplications = aplications;
        return this;
    }

    public Tablet buildTablet(){
        return new Tablet(this.cpu, this.ram, this.storage, this.os, this.aplications);
    }

    public Laptop buildLaptop(){
        return new Laptop(this.cpu, this.ram, this.storage, this.os, this.aplications);
    }
    
    public Smartphone buildSmartphone(){
        return new Smartphone(this.cpu, this.ram, this.storage, this.os, this.aplications);
    }

}
