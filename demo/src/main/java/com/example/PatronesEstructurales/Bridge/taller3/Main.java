package com.example.PatronesEstructurales.Bridge.taller3;
//taller 04/10/2024

interface Device {
    void turnOn();

    void turnOff();
}

class Light implements Device {

    public void turnOn() {
        System.out.println("turning on Light");
    }

    public void turnOff() {
        System.out.println("turning off Light");
    }
}

class Thermostat implements Device {

    public void turnOn() {
        System.out.println("turning on thermostat");
    }

    public void turnOff() {
        System.out.println("turning off thermostat");
    }
}

abstract class Control {
    protected Device device;

    public Control(Device device) {
        this.device = device;
    }

    public abstract void useDevice();
}

class AppControl extends Control {
    public AppControl(Device device) {
        super(device);
    }

    @Override
    public void useDevice() {
        System.out.println("controlling devise by app");
    }
}

class VoiceControl extends Control {
    public VoiceControl(Device device) {
        super(device);
    }

    @Override
    public void useDevice() {
        System.out.println("controlling devise by voice");
    }
}

public class Main {
    public static void main(String[] args) {
        Device light = new Light();
        light.turnOff();

        Device thermostat = new Thermostat();
        thermostat.turnOn();

        Control appControl = new AppControl(light);
        appControl.useDevice();
        System.out.println(appControl);

        Control voiceControl = new VoiceControl(thermostat);
        voiceControl.useDevice();
        System.out.println(voiceControl);
    }
}
