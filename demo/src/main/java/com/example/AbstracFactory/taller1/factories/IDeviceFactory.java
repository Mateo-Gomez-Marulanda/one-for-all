package com.example.AbstracFactory.taller1.factories;

import com.example.AbstracFactory.taller1.ISmartWatch;
import com.example.AbstracFactory.taller1.ISmartphone;

public interface IDeviceFactory {
   
    ISmartphone createSmartphone();
    ISmartWatch createSmartWatch();
}
