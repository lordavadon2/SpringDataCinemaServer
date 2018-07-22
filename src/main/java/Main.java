import DAOLayer.HibernateUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args)throws Exception{
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        String fxmlFile = "/fxml/mainFX.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
        primaryStage.setTitle("Cinema Server");
//        Image ico = new Image("resources/images/server.png");
//        primaryStage.getIcons().add(ico);
        primaryStage.setMinHeight(100);
        primaryStage.setMaxHeight(100);
        primaryStage.setMinWidth(500);
        primaryStage.setMaxWidth(500);
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        HibernateUtil.shutdown();
    }
}

//        Cinema entityCinema = new Cinema();
//        Grade entityGrade = new Grade();
//        Place entityPlace = new Place();
//        Movie entityMovie = new Movie();
//        Session entitySession = new Session();
//        Price entityPrice = new Price();
//        Ticket entityTicket = new Ticket();
//
//
//        entityCinema.setNameCinema("Байда");
//        entityGrade.setNameGrade("Low");
//        entityPlace.setCinema(entityCinema);
//        entityPlace.setGrade(entityGrade);
//        entityPlace.setRowPlace(1);
//        entityPlace.setSitPlace(1);
//        entityMovie.setNameMovie("Превому игроку приготовится");
//        Timestamp timestamp = new Timestamp(2018-1900, 6-1, 12, 12, 30, 0, 0);
//        entitySession.setDateSession(timestamp);
////        Time time = new Time(10,30,33);
////        entitySession.setTimeSession(time);
//        entitySession.setMovie(entityMovie);
//        entityPrice.setCostPrice(70);
//        entityPrice.setGrade(entityGrade);
//        entityPrice.setSession(entitySession);
//        entityTicket.setOrderTicket(2135790);
//        entityTicket.setPlaceTicket(entityPlace);
//        entityTicket.setPriceTicket(entityPrice);
//
//        cinema.addCinema(entityCinema);
//        grade.addGrade(entityGrade);
//        place.addPlace(entityPlace);
//        movie.addMovie(entityMovie);
//        session.addSession(entitySession);
//        price.addPrice(entityPrice);
//        ticket.addTicket(entityTicket);
//
//
////        entityCinema.setNameCinema("Довженко");
////        entityGrade.setNameGrade("Middle");
////        entityMovie.setNameMovie("Геошторм");
////        entityPlace.setRowPlace(2);
////        entityPlace.setSitPlace(3);
////        entityPrice.setCostPrice(60);
////        Timestamp timestamp = new Timestamp(2018-1900, 6-1, 12, 12, 30, 0, 0);
////        entitySession.setDateSession(timestamp);
////        entityTicket.setOrderTicket(54324863);
////
////        cinema.updateCinema(entityCinema);
////        grade.updatedGrade(entityGrade);
////        movie.updateMovie(entityMovie);
////        place.updatedPlace(entityPlace);
////        price.updatePrice(entityPrice);
////        session.updateSession(entitySession);
////        ticket.updateTicket(entityTicket);
//
//        List<Cinema> cinemas = cinema.getAllCinema();
//        List<Grade> grades = grade.getAlldGrade();
//        List<Place> places = place.getAlldPlace();
//        List<Movie> movies= movie.getAllMovie();
//        List<Session> sessions = session.getAllSession();
//        List<Price> prices = price.getAllPrice();
//        List<Ticket> tickets = ticket.getAllTicket();
//
//        for (Cinema cin: cinemas) {
//            System.out.println(cin.toString());
//        }
//        for (Grade gra: grades) {
//            System.out.println(gra.toString());
//        }
//        for (Place pla: places) {
//            System.out.println(pla.toString());
//        }
//        for (Movie mov: movies) {
//            System.out.println(mov.toString());
//        }
//        for (Session sess: sessions) {
//            System.out.println(sess.toString());
//        }
//        for (Price pri: prices) {
//            System.out.println(pri.toString());
//        }
//        for (Ticket tick: tickets) {
//            System.out.println(tick.toString());
//        }



//    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//    IDAOCinema cinema = new DAOCinema();
//    IDAOGrade grade = new DAOGrade();
//    IDAOPlace place = new DAOPlace();
//    IDAOMovie movie = new DAOMovie();
//    IDAOSession session = new DAOSession();
//    IDAOPrice price = new DAOPrice();
//    IDAOTicket ticket = new DAOTicket();
//
//    Grade grade1 = new Grade("Low");
//    Grade grade2 = new Grade("Middle");
//    Grade grade3 = new Grade("High");
//    Cinema cinema1 = new Cinema("Байда");
//    Movie movies1 = new Movie("Первому игроку приготовится");
//    Movie movies2 = new Movie("Геошторм");
//    Movie movies3 = new Movie("Стар Трек");
//    Session session1 = new Session(new Timestamp(2018-1900, 6-1, 12, 12, 30, 0, 0),
//            cinema1, movies1);
//    Session session2 = new Session(new Timestamp(2018-1900, 6-1, 12, 10, 00, 0, 0),
//            cinema1, movies2);
//    Session session3 = new Session(new Timestamp(2018-1900, 6-1, 12, 15, 00, 0, 0),
//            cinema1, movies3);
//    Price[] prices = new Price[9];
//    List<Place> places = new ArrayList<Place>();
//
//       prices[0] = new Price(session1, grade1, 60);
//               prices[1] = new Price(session1, grade2, 70);
//               prices[2] = new Price(session1, grade3, 80);
//               prices[3] = new Price(session2, grade1, 60);
//               prices[4] = new Price(session2, grade2, 70);
//               prices[5] = new Price(session2, grade3, 80);
//               prices[6] = new Price(session3, grade1, 60);
//               prices[7] = new Price(session3, grade2, 70);
//               prices[8] = new Price(session3, grade3, 80);
//
//               for (int i = 1; i <16; i++) {
//        for (int j = 1; j < 16; j++) {
//        if (i < 6) {
//        places.add(new Place(i, j, cinema1, grade1));
//        }
//        else if (i < 11){
//        places.add(new Place(i, j, cinema1, grade3));
//        }
//        else {
//        places.add(new Place(i, j, cinema1, grade2));
//        }
//        }
//        }
//
//        Ticket ticket1 = new Ticket(places.get(10), prices[0], 456832, 123);
//        Ticket ticket2 = new Ticket(places.get(11), prices[0], 456542, 124);
//        Ticket ticket3 = new Ticket(places.get(12), prices[0], 484832, 125);
//
//        cinema.addCinema(cinema1);
//        grade.addGrade(grade1);
//        grade.addGrade(grade2);
//        grade.addGrade(grade3);
//        movie.addMovie(movies1);
//        movie.addMovie(movies2);
//        movie.addMovie(movies3);
//        session.addSession(session1);
//        session.addSession(session2);
//        session.addSession(session3);
//
//        for (Price pr: prices) {
//        price.addPrice(pr);
//        }
//
//        for (Place plc: places) {
//        place.addPlace(plc);
//        }
//
//        ticket.addTicket(ticket1);
//        ticket.addTicket(ticket2);
//        ticket.addTicket(ticket3);
//
//        List<Cinema> getCinemas = cinema.getAllCinema();
//        List<Grade> getGrades = grade.getAlldGrade();
//        List<Place> getPlaces = place.getAlldPlace();
//        List<Movie> getMovies= movie.getAllMovie();
//        List<Session> getSessions = session.getAllSession();
//        List<Price> getPrices = price.getAllPrice();
//        List<Ticket> getTickets = ticket.getAllTicket();
//
//        for (Cinema cin: getCinemas) {
//        System.out.println(cin.toString());
//        }
//        for (Grade gra: getGrades) {
//        System.out.println(gra.toString());
//        }
//        for (Place pla: getPlaces) {
//        System.out.println(pla.toString());
//        }
//        for (Movie mov: getMovies) {
//        System.out.println(mov.toString());
//        }
//        for (Session sess: getSessions) {
//        System.out.println(sess.toString());
//        }
//        for (Price pri: getPrices) {
//        System.out.println(pri.toString());
//        }
//        for (Ticket tick: getTickets) {
//        System.out.println(tick.toString());
//        }
//
//        HibernateUtil.shutdown();