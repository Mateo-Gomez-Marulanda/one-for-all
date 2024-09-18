package com.example.PatronesCreacionales.factory.taller1;

public class Main {
    public static void main(String[] args) {

        NotificationFactory SMSfactory = new SMSNotification();
        NotificationFactory EMAILfactory = new EmailNotification();

        SMSfactory.sendNotification();
        EMAILfactory.sendNotification();

    }

}
