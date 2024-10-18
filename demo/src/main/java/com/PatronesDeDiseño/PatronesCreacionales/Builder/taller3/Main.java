package com.PatronesDeDiseño.PatronesCreacionales.Builder.taller3;

public class Main {
    public static void main(String[] args) {
        SmartphoneBuilder smartphoneBuilder = new SmartphoneBuilder();
        
        Smartphone samsungSmartphone = smartphoneBuilder.setModel("Samsung")
                                                        .setStorage("64 Gb")
                                                        .setRam("4 Gb")
                                                        .setOS("Android")
                                                        .setResolucion("HD")
                                                        .build();
        
        System.out.println(samsungSmartphone);
    }
}
