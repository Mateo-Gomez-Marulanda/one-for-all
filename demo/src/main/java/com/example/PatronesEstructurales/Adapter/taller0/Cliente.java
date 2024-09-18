package com.example.PatronesEstructurales.Adapter.taller0;

public class Cliente {
    private Dispositivo240V dispositivo;

    public Cliente(Dispositivo240V dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void usarDispositivo(int voltage){
        dispositivo.encender(voltage);
    }

}