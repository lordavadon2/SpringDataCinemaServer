package DAOLayer;

import ModelLayer.Entity.Session;
import org.hibernate.query.Query;

import java.util.List;

public class DAOSession extends SessionUtil implements IDAOSession {
    public void addSession(Session newSession) {
        openTransactionSession();
        org.hibernate.Session session = getSession();
        session.save(newSession);
        closeTransactionSesstion();
//        HibernateUtil.shutdown();
    }

    public Session getByIdSession(int id) {
        openTransactionSession();
        String sql = "SELECT * FROM cinemadb.session WHERE ID = :id";
        org.hibernate.Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Session.class);
        query.setParameter("id", id);
        Session address = (Session) query.getSingleResult();
        closeTransactionSesstion();
//        HibernateUtil.shutdown();
        return address;
    }

    public List<Session> getAllSession() {
        openTransactionSession();
        String sql = "SELECT * FROM cinemadb.session";
        org.hibernate.Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Session.class);
        List<Session> addressList = query.list();
        closeTransactionSesstion();
//        HibernateUtil.shutdown();
        return addressList;
    }

    public void updateSession(Session changedSession) {
        openTransactionSession();
        org.hibernate.Session session = getSession();
        session.update(changedSession);
        closeTransactionSesstion();
 //       HibernateUtil.shutdown();
    }

    public void diactivedSession(Session removedSession) {
        removedSession.setActive(false);
        updateSession(removedSession);
    }
}
