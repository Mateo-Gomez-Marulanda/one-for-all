package com.PatronesDeDiseño.PatronesEstructurales.Proxy.Taller2;

import com.PatronesDeDiseño.PatronesEstructurales.Proxy.Taller2.SubProxy.GPS;
import com.PatronesDeDiseño.PatronesEstructurales.Proxy.Taller2.SubProxy.GPSProxy;
import com.PatronesDeDiseño.PatronesEstructurales.Proxy.Taller2.SubProxy.RealGPS;

public class Auto implements IVehiculo{
       private boolean isRunning = false;
       private GPS gps;

    public Auto(){
        gps = new GPSProxy(new RealGPS(), this);
    }

    @Override
    public void encender(){
        isRunning = true;
        System.out.println("encendiendo automovil");
    }

    @Override
    public void apagar(){
        isRunning = false;
        System.out.println("apagando automvil");
    }

    @Override
    public GPS getGps(){
        return gps;
    }

    public boolean isRunning(){
        return isRunning;
    }

}
