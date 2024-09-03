package com.example.factory.taller3;

public class SamsungFactory implements IDeviceFactory {
    
    public ISmartWatch createSmartWatch() {
        return new SamsungSmartWatch();
    }

    public ISmartphone createSmartphone() {
        return new SamsungSmartphone();
    }
}
