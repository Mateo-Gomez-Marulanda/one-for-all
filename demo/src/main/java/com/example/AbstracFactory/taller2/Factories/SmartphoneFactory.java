package com.example.AbstracFactory.taller2.Factories;

import java.util.List;

import com.example.AbstracFactory.taller2.IElectronicDevice;
import com.example.AbstracFactory.taller2.builder.DeviceBuilder;

public class SmartphoneFactory implements IDeviceFactory{
    
    public IElectronicDevice createProduct() {
       
        return new DeviceBuilder()
                .setCpu("snapdragon")
                .setRam("3Gb")
                .setStorage("128Gb")
                .setAplications(List.of("google","facebook"))
                .setOs("Android")
                .buildSmartphone();

    }

}
