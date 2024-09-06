package com.example.PatronesCreacionales.factory.taller3;

import java.time.LocalDateTime;

public class GenericSmartWatch implements ISmartWatch {
    public void showTime(){
        System.out.println( LocalDateTime.now() );
    }
}
