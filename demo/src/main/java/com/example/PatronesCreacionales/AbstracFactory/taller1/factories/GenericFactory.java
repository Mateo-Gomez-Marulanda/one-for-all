package com.example.PatronesCreacionales.AbstracFactory.taller1.factories;

import com.example.PatronesCreacionales.AbstracFactory.taller1.GenericSmartWatch;
import com.example.PatronesCreacionales.AbstracFactory.taller1.ISmartWatch;
import com.example.PatronesCreacionales.AbstracFactory.taller1.ISmartphone;
import com.example.PatronesCreacionales.AbstracFactory.taller1.builder.SmartphoneBuilder;

public class GenericFactory implements IDeviceFactory {
    
    public ISmartWatch createSmartWatch() {
        return new GenericSmartWatch();
    }

    public ISmartphone createSmartphone() {
        return new SmartphoneBuilder()
            .setModel(null)
            .setOS(null)
            .setRam(null)
            .setResolucion(null)
            .setStorage(null)
            .buildGenericSmartphone();
    }
}
