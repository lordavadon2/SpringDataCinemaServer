package ModelLayer.Entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "cinema")
public class Cinema implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCinema")
    @NotNull
    private int idCinema;
    @Column(name = "nameCinema" )
    @NotNull
    private String nameCinema;
    @Column(name = "activeCinema")
    @NotNull
    private boolean active;

    public Cinema() {
    }

    public Cinema(String nameCinema) {
        this.nameCinema = nameCinema;
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

    @Override
    public String toString() {
        return "Cinema{" +
                "idCinema=" + idCinema +
                ", nameCinema='" + nameCinema + '\'' +
                ", active=" + active +
                '}';
    }
}
