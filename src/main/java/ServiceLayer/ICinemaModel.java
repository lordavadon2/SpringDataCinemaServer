package ServiceLayer;

import ModelLayer.Entity.Ticket;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface ICinemaModel {

    void addTicket(Ticket newTicket);

    Ticket read (int id);

    List<Ticket> getListTicket();

    void updateTicket(Ticket updateTicket);

    void deleteTicket(Ticket deleteTicket);
}
