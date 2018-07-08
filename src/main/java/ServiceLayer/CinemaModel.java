package ServiceLayer;

import ModelLayer.Entity.Cinema;
import ModelLayer.Entity.Grade;
import ModelLayer.Entity.Place;

public class CinemaModel {

    private Cinema cinema;
    private Grade grade;
    private Place place;

    public CinemaModel(Cinema cinema, Grade grade, Place place) {
        this.cinema = cinema;
        this.grade = grade;
        this.place = place;
    }

    void addCinema(Cinema newCinema){
        
    }
}
