package DAOLayer;

import ModelLayer.Entity.Cinema;

import java.util.List;

public interface IDAOCinema {

    void addCinema(Cinema newCinema);

    Cinema getByIdCinema(int id);

    List<Cinema> getAllCinema();

    void updateCinema(Cinema changedCinema);

    void diactivedCinema (Cinema removedCinema);
}
