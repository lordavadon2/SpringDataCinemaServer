package ServiceLayer.ServiceTicket;

import ModelLayer.Entity.Ticket;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface ITicketModel {
    @WebMethod
    void addTicket(Ticket newTicket);
    @WebMethod
    Ticket readTicket (int id);
    @WebMethod
    List<Ticket> getListTicket();
    @WebMethod
    void updateTicket(Ticket updateTicket);
    @WebMethod
    void deleteTicket(Ticket deleteTicket);
}
