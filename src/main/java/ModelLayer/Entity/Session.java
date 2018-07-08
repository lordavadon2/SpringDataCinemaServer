package ModelLayer.Entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "session")
public class Session implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSession")
    @NotNull
    private int idSession;
    @Column(name = "dateSession")
    @NotNull
    private String dateSession;
    @Column(name = "timeSession")
    @NotNull
    private String timeSession;
    @OneToOne
    @JoinColumn(name = "cinemaID")
    @NotNull
    private Cinema cinemaSession;
    @OneToOne
    @JoinColumn(name = "movieID")
    @NotNull
    private Movie movieSession;
    @Column(name = "activeSession")
    @NotNull
    private boolean active;

    public Session() {
    }

    public Session(String dateSession, String timeSession, Cinema cinemaSession, Movie movieSession) {
        this.dateSession = dateSession;
        this.timeSession = timeSession;
        this.cinemaSession = cinemaSession;
        this.movieSession = movieSession;
        this.active = true;
    }

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public String getDateSession() {
        return dateSession;
    }

    public void setDateSession(String dateSession) {
        this.dateSession = dateSession;
    }

    public String getTimeSession() {
        return timeSession;
    }

    public void setTimeSession(String timeSession) {
        this.timeSession = timeSession;
    }

    public Cinema getCinemaSession() {
        return cinemaSession;
    }

    public void setCinemaSession(Cinema cinemaSession) {
        this.cinemaSession = cinemaSession;
    }

    public Movie getMovieSession() {
        return movieSession;
    }

    public void setMovieSession(Movie movieSession) {
        this.movieSession = movieSession;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Session{" +
                "idSession=" + idSession +
                ", dateSession='" + dateSession + '\'' +
                ", timeSession='" + timeSession + '\'' +
                ", cinemaSession=" + cinemaSession +
                ", movieSession=" + movieSession +
                ", active=" + active +
                '}';
    }
}
