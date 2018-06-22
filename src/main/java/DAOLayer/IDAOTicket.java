package DAOLayer;

import ModelLayer.Entity.Ticket;

import java.util.List;

public interface IDAOTicket {
    void addTicket(Ticket newTicket);

    Ticket getByIdTicket(int id);

    List<Ticket> getAllTicket();

    void updateTicket(Ticket changedTicket);

    void diactivedTicket (Ticket removedTicket);
}
