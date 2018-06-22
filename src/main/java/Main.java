import DAOLayer.*;
import DAOLayer.HibernateUtil;
import ModelLayer.Entity.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
 //       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        IDAOCinema cinema = new DAOCinema();
        IDAOGrade grade = new DAOGrade();
        IDAOPlace place = new DAOPlace();
        IDAOMovie movie = new DAOMovie();
        IDAOSession session = new DAOSession();
        IDAOPrice price = new DAOPrice();
        IDAOTicket ticket = new DAOTicket();

        Cinema entityCinema = new Cinema();
        Grade entityGrade = new Grade();
        Place entityPlace = new Place();
        Movie entityMovie = new Movie();
        Session entitySession = new Session();
        Price entityPrice = new Price();
        Ticket entityTicket = new Ticket();


        entityCinema.setNameCinema("Байда");
        entityGrade.setNameGrade("Low");
        entityPlace.setCinema(entityCinema);
        entityPlace.setGrade(entityGrade);
        entityPlace.setRowPlace(1);
        entityPlace.setSitPlace(1);
        entityMovie.setNameMovie("Превому игроку приготовится");
        Timestamp timestamp = new Timestamp(2018-1900, 6-1, 12, 12, 30, 0, 0);
        entitySession.setDateSession(timestamp);
//        Time time = new Time(10,30,33);
//        entitySession.setTimeSession(time);
        entitySession.setMovie(entityMovie);
        entityPrice.setCostPrice(70);
        entityPrice.setGrade(entityGrade);
        entityPrice.setSession(entitySession);
        entityTicket.setOrderTicket(2135790);
        entityTicket.setPlaceTicket(entityPlace);
        entityTicket.setPriceTicket(entityPrice);

        cinema.addCinema(entityCinema);
        grade.addGrade(entityGrade);
        place.addPlace(entityPlace);
        movie.addMovie(entityMovie);
        session.addSession(entitySession);
        price.addPrice(entityPrice);
        ticket.addTicket(entityTicket);


//        entityCinema.setNameCinema("Довженко");
//        entityGrade.setNameGrade("Middle");
//        entityMovie.setNameMovie("Геошторм");
//        entityPlace.setRowPlace(2);
//        entityPlace.setSitPlace(3);
//        entityPrice.setCostPrice(60);
//        Timestamp timestamp = new Timestamp(2018-1900, 6-1, 12, 12, 30, 0, 0);
//        entitySession.setDateSession(timestamp);
//        entityTicket.setOrderTicket(54324863);
//
//        cinema.updateCinema(entityCinema);
//        grade.updatedGrade(entityGrade);
//        movie.updateMovie(entityMovie);
//        place.updatedPlace(entityPlace);
//        price.updatePrice(entityPrice);
//        session.updateSession(entitySession);
//        ticket.updateTicket(entityTicket);

        List<Cinema> cinemas = cinema.getAllCinema();
        List<Grade> grades = grade.getAlldGrade();
        List<Place> places = place.getAlldPlace();
        List<Movie> movies= movie.getAllMovie();
        List<Session> sessions = session.getAllSession();
        List<Price> prices = price.getAllPrice();
        List<Ticket> tickets = ticket.getAllTicket();

        for (Cinema cin: cinemas) {
            System.out.println(cin.toString());
        }
        for (Grade gra: grades) {
            System.out.println(gra.toString());
        }
        for (Place pla: places) {
            System.out.println(pla.toString());
        }
        for (Movie mov: movies) {
            System.out.println(mov.toString());
        }
        for (Session sess: sessions) {
            System.out.println(sess.toString());
        }
        for (Price pri: prices) {
            System.out.println(pri.toString());
        }
        for (Ticket tick: tickets) {
            System.out.println(tick.toString());
        }


        HibernateUtil.shutdown();

    }
}
