package com.example.PatronesCreacionales.factory.taller3;

import java.time.LocalDateTime;

public class SamsungSmartWatch implements ISmartWatch {
    public void showTime(){
        System.out.println(LocalDateTime.now());
    }
}
