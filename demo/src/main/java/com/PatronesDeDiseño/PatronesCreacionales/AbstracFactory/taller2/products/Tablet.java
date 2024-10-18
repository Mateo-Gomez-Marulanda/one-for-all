package com.PatronesDeDiseño.PatronesCreacionales.AbstracFactory.taller2.products;

import java.util.ArrayList;
import java.util.List;

import com.PatronesDeDiseño.PatronesCreacionales.AbstracFactory.taller2.IElectronicDevice;



public class Tablet implements IElectronicDevice {

    private String cpu;
    private String ram;
    private String storage;
    private String os;
    private List<String> aplications;

    public Tablet(String cpu, String ram, String storage, String os, List<String> aplications) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.aplications = new ArrayList<>();
    }

    public Tablet clonar() {
        return new Tablet(this.cpu, this.ram, this.storage, this.os, this.aplications);
    }

    @Override
    public String toString() {
        return "Tablet [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + ", os=" + os + ", aplications="
                + aplications + "]";
    }

}