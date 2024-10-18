package com.example.PatronesEstructurales.Proxy.Taller2;

import com.example.PatronesEstructurales.Proxy.Taller2.Factories.AutomovilFactory;
import com.example.PatronesEstructurales.Proxy.Taller2.Factories.VehiculoFactory;

public class Main {
    public static void main(String[] args) {
        VehiculoFactory factory = new AutomovilFactory();
        IVehiculo auto = factory.crearVehiculo();

        auto.encender();
        auto.isRunning();


    }
}