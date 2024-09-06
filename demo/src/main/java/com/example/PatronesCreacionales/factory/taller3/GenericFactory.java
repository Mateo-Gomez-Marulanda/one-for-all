package com.example.PatronesCreacionales.factory.taller3;

public class GenericFactory implements IDeviceFactory {
    
    public ISmartWatch createSmartWatch() {
        return new GenericSmartWatch();
    }

    public ISmartphone createSmartphone() {
        return new GenericSmartphone();
    }
}
