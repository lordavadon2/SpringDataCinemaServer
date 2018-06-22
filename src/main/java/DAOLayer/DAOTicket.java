package DAOLayer;

import ModelLayer.Entity.Ticket;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class DAOTicket extends SessionUtil implements IDAOTicket {
    public void addTicket(Ticket newTicket) {
        openTransactionSession();
        Session session = getSession();
        session.save(newTicket);
        closeTransactionSesstion();
    }

    public Ticket getByIdTicket(int id) {
        openTransactionSession();
        String sql = "SELECT * FROM cinemadb.ticket WHERE ID = :id";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Ticket.class);
        query.setParameter("id", id);
        Ticket address = (Ticket) query.getSingleResult();
        closeTransactionSesstion();
        return address;
    }

    public List<Ticket> getAllTicket() {
        openTransactionSession();
        String sql = "SELECT * FROM cinemadb.ticket";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Ticket.class);
        List<Ticket> addressList = query.list();
        closeTransactionSesstion();
        return addressList;
    }

    public void updateTicket(Ticket changedTicket) {
        openTransactionSession();
        Session session = getSession();
        session.update(changedTicket);
        closeTransactionSesstion();
    }

    public void diactivedTicket(Ticket removedTicket) {
        removedTicket.setActive(false);
        updateTicket(removedTicket);
    }
}
