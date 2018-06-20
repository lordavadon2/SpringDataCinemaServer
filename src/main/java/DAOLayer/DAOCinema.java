package DAOLayer;

import Hibernate.SessionUtil;
import ModelLayer.Entity.Cinema;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class DAOCinema extends SessionUtil implements IDAOCinema {

    public void addCinema(Cinema newCinema) {
        openTransactionSession();
        Session session = getSession();
        session.save(newCinema);
        closeTransactionSesstion();
    }

    public Cinema getByIdCinema(int id) {
        openTransactionSession();
        String sql = "SELECT * FROM cinemadb WHERE ID = :id";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Cinema.class);
        query.setParameter("id", id);
        Cinema address = (Cinema) query.getSingleResult();
        closeTransactionSesstion();
        return address;
    }

    public List<Cinema> getAllCinema() {
        openTransactionSession();
        String sql = "SELECT * FROM cinemadb";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Cinema.class);
        List<Cinema> addressList = query.list();
        closeTransactionSesstion();
        return addressList;
    }

    public void updateCinema(Cinema changedCinema) {
        openTransactionSession();
        Session session = getSession();
        session.update(changedCinema);
        closeTransactionSesstion();
    }

    public void diactivedCinema(Cinema removedCinema) {

    }
}
