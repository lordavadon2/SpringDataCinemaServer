package ModelLayer.Entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "movie")
public class Movie implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCinema")
    @NotNull
    private int idMovie;
    @Column(name = "nameMovie")
    @NotNull
    private String nameMovie;
    @Column(name = "activeMovie")
    @NotNull
    private boolean active;

    public Movie() {
    }

    public Movie(String nameMovie) {
        this.nameMovie = nameMovie;
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

    @Override
    public String toString() {
        return "Movie{" +
                "idMovie=" + idMovie +
                ", nameMovie='" + nameMovie + '\'' +
                ", active=" + active +
                '}';
    }
}
