package ServiceLayer.ServiceTicket;

import DAOLayer.DAOTicket;
import DAOLayer.HibernateUtil;
import DAOLayer.IDAOTicket;
import ModelLayer.Entity.Ticket;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "ServiceLayer.ServiceTicket.ITicketModel")
public class TicketModel implements ITicketModel{

    private Ticket ticket;
    private IDAOTicket daoTicket;

    {
        ticket = new Ticket();
        daoTicket = new DAOTicket();
    }

    public TicketModel() {
    }

    public void addTicket(Ticket newTicket) {
        daoTicket.addTicket(newTicket);
    }

    public Ticket readTicket(int id) {
        return daoTicket.getByIdTicket(id);
    }

    public List<Ticket> getListTicket() {
        return daoTicket.getAllTicket();
    }

    public void updateTicket(Ticket updateTicket) {
        daoTicket.updateTicket(updateTicket);
    }

    public void deleteTicket(Ticket deleteTicket) {
        daoTicket.diactivedTicket(deleteTicket);
    }
}
