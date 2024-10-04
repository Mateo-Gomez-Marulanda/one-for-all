package com.example.PatronesEstructurales.Adapter.taller3;

abstract class Device{

    public abstract void charge();
}

class Phone extends Device{

    public void chargerWithUSBC(){
        System.out.println("el tipo de cargador es: USB-C " );
    } 

    @Override 
    public void charge(){
        chargerWithUSBC();
    }
}

class Laptop extends Device{

    public void chargerWithLightning(){
        System.out.println("el tipo de cargador es: Lightning");
    }

    @Override
    public void charge(){
        chargerWithLightning();
    }
}

class ChargerAdapter{
    private Device device;

    public ChargerAdapter(Device device) {
        this.device = device;
    }

    public void chargeDevice(){
        device.charge();
    }
}

public class Main {
    public static void main(String[] args) {
        Device phone = new Phone();
        Device laptop =  new Laptop();

        ChargerAdapter adapter = new ChargerAdapter(laptop);

        
    }
}
