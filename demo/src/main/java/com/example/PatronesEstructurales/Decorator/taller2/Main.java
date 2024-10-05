package com.example.PatronesEstructurales.Decorator.taller2;
//taller 04/10/2024

interface Notifier {
    String sendNotification(String notificacion);
}

class SimpleNotifier implements Notifier {
    @Override
    public String sendNotification(String notification) {
        return notification;
    }
}

abstract class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public abstract String sendNotification(String notification);
}

class EmailNotifier extends NotifierDecorator {
    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String sendNotification(String notification) {
        return notification + " Sending notification by email";
    }
}

class SMSNotifier extends NotifierDecorator {
    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String sendNotification(String notification) {
        return notification + " Sending notification by SMS";
    }
}

class PushNotifier extends NotifierDecorator {
    public PushNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String sendNotification(String notification) {
        return notification + " Sending notification by push";
    }
}

public class Main {
    public static void main(String[] args) {
        String notification = "hola como estas";

        Notifier notifier = new SimpleNotifier();

        notifier = new EmailNotifier(notifier);
        System.out.println(notifier.sendNotification(notification));

        notifier = new SMSNotifier(notifier);
        System.out.println(notifier.sendNotification(notification));

        notifier = new PushNotifier(notifier);
        System.out.println(notifier.sendNotification(notification));
    }
}
