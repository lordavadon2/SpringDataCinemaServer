package ModelLayer.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cinema")
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCinema")
    private int idCinema;
    @Column(name = "nameCinema" )
    private String nameCinema;
    @Column(name = "activeCinema")
    private boolean active;
    @OneToMany(mappedBy = "cinemaPlace")
    private Set<Place> cinemaPlaces;
    @OneToMany(mappedBy = "cinemaSession")
    private Set<Session> cinemaSessions;

    public Cinema() {
        this.active = true;
    }

    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    public String getNameCinema() {
        return nameCinema;
    }

    public void setNameCinema(String nameCinema) {
        this.nameCinema = nameCinema;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Set<Place> getCinemaPlaces() {
        return cinemaPlaces;
    }

    public void setCinemaPlaces(Set<Place> cinemaPlaces) {
        this.cinemaPlaces = cinemaPlaces;
    }

    public Set<Session> getCinemaSessions() {
        return cinemaSessions;
    }

    public void setCinemaSessions(Set<Session> cinemaSessions) {
        this.cinemaSessions = cinemaSessions;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "idCinema=" + idCinema +
                ", nameCinema='" + nameCinema + '\'' +
                ", active=" + active +
                '}';
    }
}
