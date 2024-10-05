package com.example.PatronesEstructurales.Proxy.taller3;
//taller 04/10/2024

interface File{
    void open();
}

class RealFile implements File{
    private String file;

    public RealFile() {
        this.file = "archivo importante";
    }

    @Override
    public void open(){
        System.out.println("abriendo archivo" + file);
    }
}

class FileProxy implements File{
    private RealFile realFile;
    private boolean permiso;

    public FileProxy(RealFile realFile, boolean permiso) {
        this.realFile = realFile;
        this.permiso = permiso;
    }

    @Override
    public void open(){
        if(realFile == null && permiso==true){
            realFile = new RealFile();
        } else  {
            System.out.println("acceso denegado no tiene permiso");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        RealFile file = new RealFile();
        File proxy = new FileProxy(file, false);
        proxy.open();
    
   

    }
}


