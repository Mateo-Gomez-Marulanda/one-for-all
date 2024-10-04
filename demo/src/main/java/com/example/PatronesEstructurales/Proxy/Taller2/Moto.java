package com.example.PatronesEstructurales.Proxy.Taller2;

import com.example.PatronesEstructurales.Proxy.Taller2.SubProxy.GPS;
import com.example.PatronesEstructurales.Proxy.Taller2.SubProxy.GPSProxy;
import com.example.PatronesEstructurales.Proxy.Taller2.SubProxy.RealGPS;

public class Moto implements IVehiculo{
       private boolean isRunning = false;
       private GPS gps;

    public Moto(){
        gps = new GPSProxy(new RealGPS(), this);
    }

    @Override
    public void encender(){
        System.out.println("encendiendo");
    }

    @Override
    public void apagar(){
        System.out.println("apagando");
    }

    @Override
    public GPS getGps(){
        return gps;
    }

    public boolean isRunning(){
        return isRunning;
    }
}
