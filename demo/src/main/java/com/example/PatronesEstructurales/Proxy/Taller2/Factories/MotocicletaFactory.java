package com.example.PatronesEstructurales.Proxy.Taller2.Factories;


import com.example.PatronesEstructurales.Proxy.Taller2.IVehiculo;
import com.example.PatronesEstructurales.Proxy.Taller2.Moto;


public class MotocicletaFactory implements VehiculoFactory{
    public IVehiculo crearVehiculo(){
        return new Moto();
    }}
 