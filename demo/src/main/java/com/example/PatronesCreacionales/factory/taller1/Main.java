package com.example.PatronesCreacionales.factory.taller1;

import com.example.PatronesCreacionales.factory.taller2.PhoneFactory;
import com.example.PatronesCreacionales.factory.taller2.SmartphoneFactory;
import com.example.PatronesCreacionales.factory.taller2.SmartwatchFactory;
import com.example.PatronesCreacionales.factory.taller2.WatchFactory;

public class Main {
    public static void main(String[] args) {

        NotificationFactory SMSfactory = new SMSNotification();
        NotificationFactory EMAILfactory = new EmailNotification();

        SMSfactory.sendNotification();
        EMAILfactory.sendNotification();

        PhoneFactory smartpPhoneFactory = new SmartphoneFactory();
        WatchFactory smartWatchFactory = new SmartwatchFactory();
 
        smartWatchFactory.showTime();
        smartpPhoneFactory.call();

    }

}
