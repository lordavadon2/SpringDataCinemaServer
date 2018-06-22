package ModelLayer.Entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name = "session")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSession")
    private int idSession;
//    @Column(name = "dateSession")
//    private Date dateSession;
//    @Column(name = "timeSession")
//    private Time timeSession;
    @Column(name = "dateSession")
    private Timestamp dateSession;
    @OneToOne
    @JoinColumn(name = "movieSession")
    private Movie movie;
    @Column(name = "activeSession")
    private boolean active;

    public Session() {
        this.active = true;
    }

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

//    public Date getDateSession() {
//        return dateSession;
//    }
//
//    public void setDateSession(Date dateSession) {
//        this.dateSession = dateSession;
//    }
//
//    public Time getTimeSession() {
//        return timeSession;
//    }
//
//    public void setTimeSession(Time timeSession) {
//        this.timeSession = timeSession;
//    }


    public Timestamp getDateSession() {
        return dateSession;
    }

    public void setDateSession(Timestamp dateSession) {
        this.dateSession = dateSession;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
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
                ", dateSession=" + dateSession +
//                ", timeSession=" + timeSession +
                ", movie=" + movie +
                ", active=" + active +
                '}';
    }
}
