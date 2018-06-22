package DAOLayer;

import ModelLayer.Entity.Movie;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class DAOMovie extends SessionUtil implements IDAOMovie {
    public void addMovie(Movie newMovie) {
        openTransactionSession();
        Session session = getSession();
        session.save(newMovie);
        closeTransactionSesstion();
    }

    public Movie getByIdMovie(int id) {
        openTransactionSession();
        String sql = "SELECT * FROM cinemadb.movie WHERE ID = :id";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Movie.class);
        query.setParameter("id", id);
        Movie address = (Movie) query.getSingleResult();
        closeTransactionSesstion();
        return address;
    }

    public List<Movie> getAllMovie() {
        openTransactionSession();
        String sql = "SELECT * FROM cinemadb.movie";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Movie.class);
        List<Movie> addressList = query.list();
        closeTransactionSesstion();
        return addressList;
    }

    public void updateMovie(Movie changedMovie) {
        openTransactionSession();
        Session session = getSession();
        session.update(changedMovie);
        closeTransactionSesstion();
    }

    public void diactivedMovie(Movie removedMovie) {
        removedMovie.setActive(false);
        updateMovie(removedMovie);
    }
}
