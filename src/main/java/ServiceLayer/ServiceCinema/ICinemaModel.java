package ServiceLayer.ServiceCinema;

import ModelLayer.Entity.Cinema;
import ModelLayer.Entity.Ticket;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface ICinemaModel {

    @WebMethod
    void addCinema(Cinema newCinema);
    @WebMethod
    List<Cinema> getListCinema();
    @WebMethod
    void updateCinema(Cinema updateCinema);
    @WebMethod
    void deleteCinema(Cinema deleteCinema);
}
