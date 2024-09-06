package com.example.PatronesCreacionales.AbstracFactory.taller1;

import java.time.LocalDateTime;

public class SamsungSmartWatch implements ISmartWatch {
    public void showTime(){
        System.out.println(LocalDateTime.now());
    }
}
