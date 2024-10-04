package com.example.PatronesEstructurales.Composite.taller2;
import java.util.List;
import java.util.ArrayList;

interface FileSystemComponent{
    double getSize();
    
}

class File implements FileSystemComponent{
    private String name;
    private double size;
    
    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public double getSize(){
        return size;
    }
}

class Directory implements FileSystemComponent{
    private String name;
    private double size;
    private List<FileSystemComponent> archivos = new ArrayList<>();

    public Directory(String name, double size) {
        this.name = name;
        this.size = size;
    }

    
    public void addFile(FileSystemComponent archivo){
        archivos.add(archivo);
    }

    @Override
    public double getSize(){
        return size;
    }

    public double getTotalSizw(){
        int totalSize = 0;
        for (FileSystemComponent archivo : archivos) {
            totalSize += archivo.getSize();
        }
        return totalSize;
    }
    
}

public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("tarea1", 34.9);
        FileSystemComponent file2  = new File("tarea2", 24.0);

        Directory directory = new Directory("Tareas", 12.0);
        directory.getSize();
        directory.addFile(file1);
        directory.addFile(file2);

        System.out.println(directory);

    }
}
