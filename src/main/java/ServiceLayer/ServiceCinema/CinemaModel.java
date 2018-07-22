package ServiceLayer.ServiceCinema;

import DAOLayer.*;
import ModelLayer.Entity.Cinema;
import ModelLayer.Entity.Grade;
import ModelLayer.Entity.Place;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "ServiceLayer.ServiceCinema.ICinemaModel")
public class CinemaModel implements ICinemaModel{

    private Cinema cinema;
    private Grade grade;
    private Place place;
    private IDAOCinema daoCinema;
    private IDAOPlace daoPlace;
    private IDAOGrade daoGrade;

    {
        cinema = new Cinema();
        place = new Place();
        grade = new Grade();
        daoCinema = new DAOCinema();
        daoPlace = new DAOPlace();
        daoGrade = new DAOGrade();
    }


    public CinemaModel() {
    }

    public void addCinema(Cinema newCinema){
        daoCinema.addCinema(newCinema);
    }

    public List<Cinema> getListCinema() {
        return daoCinema.getAllCinema();
    }

    public void updateCinema(Cinema updateCinema) {
        daoCinema.updateCinema(updateCinema);
    }

    public void deleteCinema(Cinema deleteCinema) {
        daoCinema.diactivedCinema(deleteCinema);
    }
}
