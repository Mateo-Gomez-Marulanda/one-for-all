
package com.PatronesDeDiseño.PatronesEstructurales.Proxy.taller3;
//taller 04/10/2024

interface File {
    void open();
}

class RealFile implements File {
    private String file;

    public RealFile(String file) {
        this.file = file;
    }

    @Override
    public void open() {
        System.out.println("abriendo archivo " + file);
    }
}

class FileProxy implements File {
    private RealFile realFile;
    private boolean permiso;
    private String file;

    public FileProxy(boolean permiso, String file) {
        this.permiso = permiso;
        this.file = file;
    }

    @Override
    public void open() {
        if (permiso == false) {
            System.out.println("acceso denegado");
            return;
        }

        if (realFile == null) {
            realFile = new RealFile(file);
        }
        realFile.open();
    }
}

public class Main {
    public static void main(String[] args) {

        File proxy = new FileProxy(true, "archivo importa");
        proxy.open();

        File proxy1 = new FileProxy(false, "archivo ");
        proxy1.open();
    }
}

