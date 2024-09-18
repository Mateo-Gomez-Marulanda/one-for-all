package com.example.PatronesEstructurales.Adapter.taller0;

public class Main {
    public static void main(String[] args) {
        Enchufe120V enchufe = new Enchufe120V();

        Voltage240V adaptador = new AdaptadorEnchufe(enchufe);

        Dispositivo240V dispositivo = new Dispositivo240V();

        Cliente cliente = new Cliente(dispositivo);

        cliente.usarDispositivo(adaptador.obtenerVoltage());
    }
}
