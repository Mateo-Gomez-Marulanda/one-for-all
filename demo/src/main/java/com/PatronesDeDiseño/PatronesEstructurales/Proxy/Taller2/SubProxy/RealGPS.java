package com.PatronesDeDiseño.PatronesEstructurales.Proxy.Taller2.SubProxy;

public class RealGPS implements GPS{
    @Override
    public void obtenerUbicacion(){
        System.out.println("mostrando ubacion");
    }
}
