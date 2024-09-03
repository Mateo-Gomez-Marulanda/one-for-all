package com.example.AbstracFactory.taller1;

import com.example.AbstracFactory.taller1.factories.*;
import com.example.AbstracFactory.taller1.factories.SamsungFactory;

public class Main {
    public static void main(String[] args) {
       

        
        SamsungFactory samsungSmartPhone = new SmartPhoneBuilder()
        .setModel(null)
        .setOS(null)
        .setRam(null)
        .setResolucion(null)
        .setStorage(null)
        .buildSamsungBuilder();
    
        


    }

}
