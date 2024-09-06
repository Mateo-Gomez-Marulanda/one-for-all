package com.example.PatronesCreacionales.AbstracFactory.taller2;

import com.example.PatronesCreacionales.AbstracFactory.taller2.Factories.IDeviceFactory;
import com.example.PatronesCreacionales.AbstracFactory.taller2.Factories.LaptopFactory;
import com.example.PatronesCreacionales.AbstracFactory.taller2.Factories.SmartphoneFactory;
import com.example.PatronesCreacionales.AbstracFactory.taller2.Factories.TabletFactory;

//preparcial de programacion 2 unidad 1

public class Main {
    public static void main(String[] args) {

        //implementacion del Factory method
        IDeviceFactory tabletFactory = new TabletFactory();
        IDeviceFactory smartphoneFactory = new SmartphoneFactory();
        IDeviceFactory laptopFactory = new LaptopFactory();

        //implementacion del builder
        IElectronicDevice tablet = tabletFactory.createProduct();
        System.out.println(tablet);

        IElectronicDevice smartphone = smartphoneFactory.createProduct();
        System.out.println(smartphone);

        IElectronicDevice laptop = laptopFactory.createProduct();
        System.out.println(laptop);

        //implementacion del prototype

        IElectronicDevice tablet2 = tablet.clonar();
        System.out.println(tablet2);

        IElectronicDevice smartphone2 = smartphone.clonar();
        System.out.println(smartphone2);

        IElectronicDevice laptop2 = laptop.clonar();
        System.out.println(laptop2);

    }
}
