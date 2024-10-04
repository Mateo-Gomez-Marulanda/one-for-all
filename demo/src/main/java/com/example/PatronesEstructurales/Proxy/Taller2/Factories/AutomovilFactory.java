package com.example.PatronesEstructurales.Proxy.Taller2.Factories;

import com.example.PatronesEstructurales.Proxy.Taller2.Auto;
import com.example.PatronesEstructurales.Proxy.Taller2.IVehiculo;

public class AutomovilFactory implements VehiculoFactory{
    public IVehiculo crearVehiculo(){
        return new Auto();
    }

    
}
