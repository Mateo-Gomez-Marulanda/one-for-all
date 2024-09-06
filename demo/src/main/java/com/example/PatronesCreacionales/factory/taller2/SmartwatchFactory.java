package com.example.PatronesCreacionales.factory.taller2;

import java.time.LocalDateTime;

public class SmartwatchFactory implements WatchFactory {

    public void showTime() {
        System.out.println(LocalDateTime.now());
    }
}
