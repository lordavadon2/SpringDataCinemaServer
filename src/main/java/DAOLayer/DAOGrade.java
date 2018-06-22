package DAOLayer;


import ModelLayer.Entity.Grade;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class DAOGrade extends SessionUtil implements IDAOGrade {

    public void addGrade(Grade newGrade) {
        openTransactionSession();
        Session session = getSession();
        session.save(newGrade);
        closeTransactionSesstion();
    }

    public Grade getByIdGrade(int id) {
        openTransactionSession();
        String sql = "SELECT * FROM cinemadb.grade WHERE ID = :id";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Grade.class);
        query.setParameter("id", id);
        Grade address = (Grade) query.getSingleResult();
        closeTransactionSesstion();
        return address;
    }

    public List<Grade> getAlldGrade() {
        openTransactionSession();
        String sql = "SELECT * FROM cinemadb.grade";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Grade.class);
        List<Grade> addressList = query.list();
        closeTransactionSesstion();
        return addressList;
    }

    public void updatedGrade(Grade changedGrade) {
        openTransactionSession();
        Session session = getSession();
        session.update(changedGrade);
        closeTransactionSesstion();
    }

    public void diactivedGrade(Grade removedGrade) {
        removedGrade.setActive(false);
        updatedGrade(removedGrade);
    }
}
