package com.example.AbstracFactory.taller1;

import com.example.AbstracFactory.taller1.factories.*;
import com.example.AbstracFactory.taller1.factories.GenericFactory;
import com.example.AbstracFactory.taller1.factories.SamsungFactory;

public class Main {
    public static void main(String[] args) {
      
        //implementacion del factory method
        IDeviceFactory samsungFactory = new SamsungFactory();
        IDeviceFactory genericFactory = new GenericFactory();
        
        // implementacion del builder
        ISmartphone samsungsmartphone = samsungFactory.createSmartphone();
        System.out.println(samsungsmartphone);
        samsungsmartphone.call();

        ISmartphone genericSmartphone = genericFactory.createSmartphone();
        System.out.println(genericSmartphone);
        genericSmartphone.call();

        // implementacion del prototype
       ISmartphone samsungSmartphone2 = samsungsmartphone.clonar(); 
       samsungSmartphone2.call();

       ISmartphone genericSmartphone2 = genericSmartphone.clonar();
        genericSmartphone2.call();
        
        
    
        


    }

}
