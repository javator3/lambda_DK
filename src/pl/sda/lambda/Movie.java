package pl.sda.lambda;

import java.time.LocalDate;
import java.util.List;

public class Movie {
    private String title;
    private String director;
    private LocalDate localDatel;
    private double price;
    private List<String> actorList;

    public Movie(String title, String director, LocalDate localDatel, double price, List<String> actorList) {
        this.title = title;
        this.director = director;
        this.localDatel = localDatel;
        this.price = price;
        this.actorList = actorList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getLocalDatel() {
        return localDatel;
    }

    public void setLocalDatel(LocalDate localDatel) {
        this.localDatel = localDatel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getActorList() {
        return actorList;
    }

    public void setActorList(List<String> actorList) {
        this.actorList = actorList;
    }
}
