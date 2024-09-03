package com.example.factory.taller3;

public class Main {
    public static void main(String[] args) {
        

        IDeviceFactory samsungFactory = new SamsungFactory();
        IDeviceFactory genericFactory = new GenericFactory();

        ISmartWatch samsungSmartWatch = samsungFactory.createSmartWatch();
        ISmartphone samsungSmartphone = samsungFactory.createSmartphone();

        ISmartWatch genericSmartWatch = genericFactory.createSmartWatch();
        ISmartphone genericSmartphone = genericFactory.createSmartphone();

        samsungSmartWatch.showTime();
        samsungSmartphone.call();
 
        genericSmartWatch.showTime();
        genericSmartphone.call();

    }

}
