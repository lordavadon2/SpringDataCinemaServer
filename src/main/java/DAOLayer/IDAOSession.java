package DAOLayer;

import ModelLayer.Entity.Session;

import java.util.List;

public interface IDAOSession {
    void addSession(Session newSession);

    Session getByIdSession(int id);

    List<Session> getAllSession();

    void updateSession(Session changedSession);

    void diactivedSession (Session removedSession);
}
