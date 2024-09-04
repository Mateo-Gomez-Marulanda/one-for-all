package com.example.AbstracFactory.taller2.Factories;

import java.util.List;

import com.example.AbstracFactory.taller2.IElectronicDevice;
import com.example.AbstracFactory.taller2.builder.DeviceBuilder;

public class LaptopFactory implements IDeviceFactory {
    
    public IElectronicDevice createProduct() {
        
        return new DeviceBuilder()
                .setCpu("intel")
                .setRam("4GB")
                .setStorage("512Gb")
                .setAplications(List.of("google","facebook"))
                .setOs("Windows")
                .buildLaptop();

    }

}
