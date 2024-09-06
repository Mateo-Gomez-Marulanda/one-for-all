package com.example.PatronesCreacionales.AbstracFactory.taller1.factories;

import com.example.PatronesCreacionales.AbstracFactory.taller1.ISmartWatch;
import com.example.PatronesCreacionales.AbstracFactory.taller1.ISmartphone;
import com.example.PatronesCreacionales.AbstracFactory.taller1.SamsungSmartWatch;
import com.example.PatronesCreacionales.AbstracFactory.taller1.builder.SmartphoneBuilder;

public class SamsungFactory implements IDeviceFactory {

    public ISmartWatch createSmartWatch() {
        return new SamsungSmartWatch();
    }

    public ISmartphone createSmartphone() {
        return new SmartphoneBuilder()
        .setModel("Galaxy j2 prime")
        .setOS("Android")
        .setRam("1Gb")
        .setResolucion("20 Mp")
        .setStorage("8Gb")
        .buildSamsungSmartphone();
    }
}
