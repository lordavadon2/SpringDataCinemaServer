package DAOLayer;

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
 //       HibernateUtil.shutdown();
    }

    public void addListPlace(List<Place> listPlace) {
        for (Place place:listPlace) {
            addPlace(place);
        }
    }

    public Place getByIdPlace(int id) {
        openTransactionSession();
        String sql = "SELECT * FROM cinemadb.place WHERE ID = :id";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Place.class);
        query.setParameter("id", id);
        Place address = (Place) query.getSingleResult();
        closeTransactionSesstion();
//        HibernateUtil.shutdown();
        return address;
    }

    public List<Place> getAlldPlace() {
        openTransactionSession();
        String sql = "SELECT * FROM cinemadb.place";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Place.class);
        List<Place> addressList = query.list();
        closeTransactionSesstion();
//        HibernateUtil.shutdown();
        return addressList;
    }

    public void updatedPlace(Place changedPlace) {
        openTransactionSession();
        Session session = getSession();
        session.update(changedPlace);
        closeTransactionSesstion();
//        HibernateUtil.shutdown();
    }

    public void diactivedPlace(Place removedPlace) {
        removedPlace.setActive(false);
        updatedPlace(removedPlace);
    }
}
