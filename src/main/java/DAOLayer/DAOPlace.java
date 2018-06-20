package DAOLayer;

import Hibernate.SessionUtil;
import ModelLayer.Entity.Place;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class DAOPlace extends SessionUtil implements IDAOPlace {

    public void addPlace(Place newPlace) {
        openTransactionSession();
        Session session = getSession();
        session.save(newPlace);
        closeTransactionSesstion();
    }

    public void addListPlace(List<Place> listPlace) {
        for (Place place:listPlace) {
            addPlace(place);
        }
    }

    public Place getByIdPlace(int id) {
        openTransactionSession();
        String sql = "SELECT * FROM ADDRESS WHERE ID = :id";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Place.class);
        query.setParameter("id", id);
        Place address = (Place) query.getSingleResult();
        closeTransactionSesstion();
        return address;
    }

    public List<Place> getAlldPlace() {
        openTransactionSession();
        String sql = "SELECT * FROM cinemadb";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Place.class);
        List<Place> addressList = query.list();
        closeTransactionSesstion();
        return addressList;
    }

    public void updatedPlace(Place changedPlace) {
        openTransactionSession();
        Session session = getSession();
        session.update(changedPlace);
        closeTransactionSesstion();
    }

    public void diactivedPlace(Place removedPlace) {

    }
}
