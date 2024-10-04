package com.example.PatronesEstructurales.Proxy.Taller0;
//ejemplo proxy 27/09/2024

//se crea interfaz comun
interface Report {
    void displayReport();
}

// se crea clase real
class RealReport implements Report {
    private String reportContent;

    public RealReport() {
        this.reportContent = "Confidencial report Data";

    }

    public void loadFromDataBase() {
        System.out.println("");
    }

    @Override
    public void displayReport() {
        System.out.println("displaying report " + reportContent);
    }

}

// se crea clase proxy
class ReportProxy implements Report {
    private RealReport realReport;

    public ReportProxy(){}
    
    //metodo para saber si el reporte ya existe
    @Override
    public void displayReport(){
        if(realReport == null){
            realReport = new RealReport();
        }
        realReport.displayReport();
    }
}

public class Main {
    public static void main(String[] args) {
        //implementacion de Proxy
        Report report = new ReportProxy();
        System.out.println(report);
    }
}
