package ModelLayer.Entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "session")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSession")
    private int idSession;
    @Column(name = "dateSession")
    private Timestamp dateSession;
    @ManyToOne
    @JoinColumn(name = "cinemaID")
    private Cinema cinemaSession;
    @ManyToOne
    @JoinColumn(name = "movieID")
    private Movie movieSession;
    @Column(name = "activeSession")
    private boolean active;
    @OneToMany(mappedBy = "sessionPrice")
    private Set<Price> sessionPrice;

    public Session() {
        this.active = true;
    }

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public Timestamp getDateSession() {
        return dateSession;
    }

    public void setDateSession(Timestamp dateSession) {
        this.dateSession = dateSession;
    }

    public Cinema getCinema() {
        return cinemaSession;
    }

    public void setCinema(Cinema cinemaSession) {
        this.cinemaSession = cinemaSession;
    }

    public Movie getMovie() {
        return movieSession;
    }

    public void setMovie(Movie movieSession) {
        this.movieSession = movieSession;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Set<Price> getSessionPrice() {
        return sessionPrice;
    }

    public void setSessionPrice(Set<Price> sessionPrice) {
        this.sessionPrice = sessionPrice;
    }

    @Override
    public String toString() {
        return "Session{" +
                "idSession=" + idSession +
                ", dateSession=" + dateSession +
                ", cinema=" + cinemaSession +
                ", movie=" + movieSession +
                ", active=" + active +
                '}';
    }
}
