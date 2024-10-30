package com.PatronesDeDiseño.Otros;

class Fulanito {
    private String rol;

    public Fulanito(String rol) {
        this.rol = rol;
    }

    public void verificarRol() {

        String verificarRol = rol.toUpperCase();

        if (verificarRol == "EMPLEADO") {
            System.out.println("usted es un empleado");
        } else if (verificarRol == "JEFE") {
            System.out.println("usted es el jefe");
        } else {
            throw new IllegalArgumentException("\"Error: rol no indentificado\""); 
        }

    }
}

public class Decicion {
    public static void main(String[] args) {
        Fulanito fulano = new Fulanito("EMPLEADO");

        fulano.verificarRol();

    }
}
