package ModelLayer.Entity;

import java.sql.Date;
import java.sql.Time;

public class Session {

    private int idSession;
    private Date dateSession;
    private Time timeSession;
    private Movie movie;

    public Session() {
    }

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public Date getDateSession() {
        return dateSession;
    }

    public void setDateSession(Date dateSession) {
        this.dateSession = dateSession;
    }

    public Time getTimeSession() {
        return timeSession;
    }

    public void setTimeSession(Time timeSession) {
        this.timeSession = timeSession;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Session{" +
                "idSession=" + idSession +
                ", dateSession=" + dateSession +
                ", timeSession=" + timeSession +
                ", movie=" + movie +
                '}';
    }
}
