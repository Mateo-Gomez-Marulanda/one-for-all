package com.PatronesDeDiseño.PatronesEstructurales.Adapter.taller0;

public class Dispositivo240V {
    public void encender(int voltage){
        
        if(voltage == 240){
            System.out.println("dispositivo funciona con " + voltage +"V");
        }else{
            System.out.println("voltage incorrecto se necesitan 240V");
        }
    }
}
