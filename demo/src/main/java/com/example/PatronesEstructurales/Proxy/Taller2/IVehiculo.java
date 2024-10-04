package com.example.PatronesEstructurales.Proxy.Taller2;

import com.example.PatronesEstructurales.Proxy.Taller2.SubProxy.GPS;

public interface IVehiculo {
    void encender();
    void apagar();
    GPS getGps();
}
