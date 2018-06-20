import DAOLayer.*;
import Hibernate.HibernateUtil;
import ModelLayer.Entity.Cinema;
import ModelLayer.Entity.Grade;
import ModelLayer.Entity.Place;
import org.hibernate.SessionFactory;

public class Main {

    public static void main(String[] args) {
 //       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        IDAOCinema cinema = new DAOCinema();
        IDAOGrade grade = new DAOGrade();
        IDAOPlace place = new DAOPlace();

        Cinema entityCinema = new Cinema();
        Grade entityGrade = new Grade();
        Place entityPlace = new Place();


        entityCinema.setNameCinema("Байда");
        entityGrade.setNameGrade("Low");
        entityPlace.setCinema(entityCinema);
        entityPlace.setGrade(entityGrade);
        entityPlace.setRowPlace(1);
        entityPlace.setSitPlace(1);

        cinema.addCinema(entityCinema);
        grade.addGrade(entityGrade);
        place.addPlace(entityPlace);

        HibernateUtil.shutdown();

    }
}
