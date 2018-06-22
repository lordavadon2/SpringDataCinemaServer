package DAOLayer;

import ModelLayer.Entity.Price;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class DAOPrice extends SessionUtil implements IDAOPrice{
    public void addPrice(Price newPrice) {
        openTransactionSession();
        Session session = getSession();
        session.save(newPrice);
        closeTransactionSesstion();
    }

    public Price getByIdPrice(int id) {
        openTransactionSession();
        String sql = "SELECT * FROM cinemadb.price WHERE ID = :id";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Price.class);
        query.setParameter("id", id);
        Price address = (Price) query.getSingleResult();
        closeTransactionSesstion();
        return address;
    }

    public List<Price> getAllPrice() {
        openTransactionSession();
        String sql = "SELECT * FROM cinemadb.price";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Price.class);
        List<Price> addressList = query.list();
        closeTransactionSesstion();
        return addressList;
    }

    public void updatePrice(Price changedPrice) {
        openTransactionSession();
        Session session = getSession();
        session.update(changedPrice);
        closeTransactionSesstion();
    }

    public void diactivedPrice(Price removedPrice) {
        removedPrice.setActive(false);
        updatePrice(removedPrice);
    }
}
