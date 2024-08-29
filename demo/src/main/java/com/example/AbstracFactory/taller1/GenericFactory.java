package com.example.AbstracFactory.taller1;

public class GenericFactory implements IDeviceFactory {
    
    public ISmartWatch createSmartWatch() {
        return new GenericSmartWatch();
    }

    public ISmartphone createSmartphone() {
        return new GenericSmartphone();
    }
}
