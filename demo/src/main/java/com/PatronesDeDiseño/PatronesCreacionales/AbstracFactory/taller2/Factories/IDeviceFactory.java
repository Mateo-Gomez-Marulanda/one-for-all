package com.PatronesDeDiseño.PatronesCreacionales.AbstracFactory.taller2.Factories;

import com.PatronesDeDiseño.PatronesCreacionales.AbstracFactory.taller2.IElectronicDevice;


public interface IDeviceFactory {

   IElectronicDevice createProduct();

}