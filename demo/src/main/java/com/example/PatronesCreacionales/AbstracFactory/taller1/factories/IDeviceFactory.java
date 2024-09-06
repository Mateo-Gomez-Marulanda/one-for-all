package com.example.PatronesCreacionales.AbstracFactory.taller1.factories;

import com.example.PatronesCreacionales.AbstracFactory.taller1.ISmartWatch;
import com.example.PatronesCreacionales.AbstracFactory.taller1.ISmartphone;

public interface IDeviceFactory {
   
    ISmartphone createSmartphone();
    ISmartWatch createSmartWatch();
}
