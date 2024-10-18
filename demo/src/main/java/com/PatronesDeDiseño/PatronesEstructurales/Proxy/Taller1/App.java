package com.PatronesDeDiseño.PatronesEstructurales.Proxy.Taller1;

interface DataBase {
    void query(String sql);
}

class RealDataBase implements DataBase {
    @Override
    public void query(String sql) {
        System.out.println("accediento base de datos");
    }
}

class Proxy implements DataBase {
    private RealDataBase dataBase;

    public Proxy() {
    }

    @Override
    public void query(String sql) {
        if (dataBase == null) {
            dataBase = new RealDataBase();
        }
        dataBase.query(sql);
    }
}

public class App {
    public static void main(String[] args) {
        DataBase dataBase = new Proxy();
        dataBase.query("users carpet");
    }
}