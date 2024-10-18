package com.PatronesDeDiseño.PatronesCreacionales.factory.taller2;

public class Main {
    public static void main(String[] args) {
        PhoneFactory smartpPhoneFactory = new SmartphoneFactory();
        WatchFactory smartWatchFactory = new SmartwatchFactory();

        smartWatchFactory.showTime();
        smartpPhoneFactory.call();
    }
}
