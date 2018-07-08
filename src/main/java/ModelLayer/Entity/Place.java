package ModelLayer.Entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "place")
public class Place implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPlace")
    @NotNull
    private int idPlace;
    @Column(name = "rowPlace")
    @NotNull
    private int rowPlace;
    @Column(name = "sitPlace")
    @NotNull
    private int sitPlace;
    @OneToOne
    @JoinColumn(name = "cinemaID")
    @NotNull
    private Cinema cinemaPlace;
    @OneToOne
    @JoinColumn(name = "gradeID")
    @NotNull
    private Grade gradePlace;
    @Column(name = "activePlace")
    @NotNull
    private boolean active;

    public Place() {
    }

    public Place(int rowPlace, int sitPlace, Cinema cinemaPlace, Grade gradePlace) {
        this.rowPlace = rowPlace;
        this.sitPlace = sitPlace;
        this.cinemaPlace = cinemaPlace;
        this.gradePlace = gradePlace;
        this.active = true;
    }

    public int getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(int idPlace) {
        this.idPlace = idPlace;
    }

    public int getRowPlace() {
        return rowPlace;
    }

    public void setRowPlace(int rowPlace) {
        this.rowPlace = rowPlace;
    }

    public int getSitPlace() {
        return sitPlace;
    }

    public void setSitPlace(int sitPlace) {
        this.sitPlace = sitPlace;
    }

    public Cinema getCinema() {
        return cinemaPlace;
    }

    public void setCinema(Cinema cinemaPlace) {
        this.cinemaPlace = cinemaPlace;
    }

    public Grade getGrade() {
        return gradePlace;
    }

    public void setGrade(Grade gradePlace) {
        this.gradePlace = gradePlace;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Place{" +
                "idPlace=" + idPlace +
                ", rowPlace=" + rowPlace +
                ", sitPlace=" + sitPlace +
                ", cinema=" + cinemaPlace +
                ", grade=" + gradePlace +
                ", active=" + active +
                '}';
    }
}
