package com.example.PatronesEstructurales.Adapter.taller0;

public class AdaptadorEnchufe implements Voltage240V {

    private Enchufe120V enchufe;

    public AdaptadorEnchufe(Enchufe120V enchufe) {
        this.enchufe = enchufe;
    }

    @Override
    public int obtenerVoltage(){
        return enchufe.obtenerVoltage()*2;
    }

}


