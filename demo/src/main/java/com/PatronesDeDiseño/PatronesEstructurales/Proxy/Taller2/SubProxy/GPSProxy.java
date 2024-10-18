package com.PatronesDeDiseño.PatronesEstructurales.Proxy.Taller2.SubProxy;

import com.PatronesDeDiseño.PatronesEstructurales.Proxy.Taller2.IVehiculo;

public class GPSProxy implements GPS{
    private RealGPS realGPS;
    private IVehiculo vehiculo;

    public GPSProxy(RealGPS realGPS, IVehiculo vehiculo){
        this.realGPS = realGPS;
        this.vehiculo = vehiculo;
    }
    
    public void setVehiculo(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void obtenerUbicacion(){
        if(vehiculo != null && vehiculo instanceof Auto && Auto.isRunning()){
            realGPS.obtenerUbicacion();
        } else if (vehiculo != null && vehiculo instanceof Moto && Moto.isRunning()){
            realGPS.obtenerUbicacion();
        } else {
            System.out.println("no se puede acceder al gps porque el vehiculo no stas encedido");
        }
    }
}
