package com.PatronesDeDiseño.PatronesComportamentales.ChainOfResponsability.taller3;
// preparcial 1/11/2024

abstract class SupportHandler {
    protected SupportHandler handler;

    public void setHandler(SupportHandler handler) {
        this.handler = handler;
    }

    public void soporteTecnico(String soporte) {
        if (soporte != null) {
            handler.soporteTecnico(soporte);
        }
    }
}

class SoporteBasico extends SupportHandler {
    @Override
    public void soporteTecnico(String soporte) {
        if (soporte.toLowerCase().equals("soporte simple")) {
            System.out.println("aplicando soporte simple");
        } else {
            super.soporteTecnico(soporte);
        }
    }
}

class SoporteTecnicoAvanzado extends SupportHandler {
    @Override
    public void soporteTecnico(String soporte) {
        if (soporte.toLowerCase().equals("soporte tecnico")) {
            System.out.println("aplicando soporte tecnico avanzado");
        } else {
            super.soporteTecnico(soporte);
        }
    }
}

class GerenteSoporte extends SupportHandler {
    @Override
    public void soporteTecnico(String soporte) {
        if (soporte.toLowerCase().equals("gerente de soporte")) {
            System.out.println("llamdo al gerente de soporte");
        } else {
            System.out.println("Error: tipo de soporte no reconocido");
        }
    }
}

public class Main {

    private static SupportHandler getChain(){
        SupportHandler soporteSimple = new SoporteBasico();
        SupportHandler soporteTenico = new SoporteTecnicoAvanzado();
        SupportHandler gerenteSoporte = new GerenteSoporte();

        soporteSimple.setHandler(soporteTenico);
        soporteTenico.setHandler(gerenteSoporte);
        return soporteSimple;
    }
    public static void main(String[] args) {
        SupportHandler chain = getChain();
        chain.soporteTecnico("soporte SIMPLE");
    }
}
