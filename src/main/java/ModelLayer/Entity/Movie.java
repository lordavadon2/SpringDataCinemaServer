package ModelLayer.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCinema")
    private int idMovie;
    @Column(name = "nameMovie")
    private String nameMovie;
    @Column(name = "activeMovie")
    private boolean active;
    @OneToMany(mappedBy = "movieSession")
    private Set<Session> movieSession;

    public Movie() {
        this.active = true;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Set<Session> getMovieSession() {
        return movieSession;
    }

    public void setMovieSession(Set<Session> movieSession) {
        this.movieSession = movieSession;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "idMovie=" + idMovie +
                ", nameMovie='" + nameMovie + '\'' +
                ", active=" + active +
                '}';
    }
}
