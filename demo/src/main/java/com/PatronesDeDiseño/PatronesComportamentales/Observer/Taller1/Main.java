package com.PatronesDeDiseño.PatronesComportamentales.Observer.Taller1;

import java.util.ArrayList;
import java.util.List;

//taller clase 18/10/2024

interface Observer {
    void update(String news);
}

class EmailSuscriber implements Observer {
    @Override
    public void update(String news) {
        System.out.println("EmailSuscriber: nueva noticia: " + news);
    }
}

class SMSSuscriber implements Observer {
    @Override
    public void update(String news) {
        System.out.println("SMSSuscriber: nueva noticia: " + news);
    }
}

class NewsPortal {
    private String news;
    private List<Observer> observers = new ArrayList<>();

    public void agregarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificar() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
        notificar();
    }
}

public class Main {
    public static void main(String[] args) {
        
        NewsPortal newsPortal = new NewsPortal();

        Observer observer = new EmailSuscriber();
        Observer observer2 = new SMSSuscriber();
        newsPortal.agregarObserver(observer2);
        newsPortal.agregarObserver(observer);
        observer.update("fritaron a bala a alias tajada");
        observer2.update("Robaron a un estudiante");

    }
}