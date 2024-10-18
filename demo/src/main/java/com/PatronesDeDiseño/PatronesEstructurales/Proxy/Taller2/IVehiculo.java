package com.PatronesDeDiseño.PatronesEstructurales.Proxy.Taller2;

import com.PatronesDeDiseño.PatronesEstructurales.Proxy.Taller2.SubProxy.GPS;

public interface IVehiculo {
    void encender();
    void apagar();
    GPS getGps();
}
