package com.example.factory.taller1;

public class EmailNotification implements NotificationFactory {
    public void sendNotification(){
        System.out.println("Sending an Email notification");
    }
    
}


