package com.example.AbstracFactory.taller1;

public class SamsungFactory implements IDeviceFactory {
    
    public ISmartWatch createSmartWatch() {
        return new SamsungSmartWatch();
    }

    public ISmartphone createSmartphone() {
        return new SamsungSmartphone();
    }
}
