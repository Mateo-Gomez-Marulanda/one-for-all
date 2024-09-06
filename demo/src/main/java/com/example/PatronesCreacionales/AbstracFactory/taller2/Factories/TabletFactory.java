package com.example.PatronesCreacionales.AbstracFactory.taller2.Factories;

import java.util.List;

import com.example.PatronesCreacionales.AbstracFactory.taller2.IElectronicDevice;
import com.example.PatronesCreacionales.AbstracFactory.taller2.builder.DeviceBuilder;

public class TabletFactory implements IDeviceFactory {

    public IElectronicDevice createProduct() {
        return new DeviceBuilder()
                .setCpu("intel")
                .setRam("2Gb")
                .setStorage("16Gb")
                .setAplications(List.of("google","facebook"))
                .setOs("Android")
                .buildTablet();

    }
}
