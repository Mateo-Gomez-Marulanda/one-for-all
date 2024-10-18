package com.PatronesDeDiseño.PatronesCreacionales.AbstracFactory.taller1.factories;

import com.PatronesDeDiseño.PatronesCreacionales.AbstracFactory.taller1.ISmartWatch;
import com.PatronesDeDiseño.PatronesCreacionales.AbstracFactory.taller1.ISmartphone;

public interface IDeviceFactory {
   
    ISmartphone createSmartphone();
    ISmartWatch createSmartWatch();
}
