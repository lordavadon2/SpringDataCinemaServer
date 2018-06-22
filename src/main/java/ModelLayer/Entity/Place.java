package ModelLayer.Entity;

import javax.persistence.*;

@Entity
@Table(name = "place")
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPlace")
    private int idPlace;
    @Column(name = "rowPlace")
    private int rowPlace;
    @Column(name = "sitPlace")
    private int sitPlace;
    @OneToOne
    @JoinColumn(name = "cinemaPlace")
    private Cinema cinema;
    @OneToOne
    @JoinColumn(name = "gradePlace")
    private Grade grade;
    @Column(name = "activePlace")
    private boolean active;

    public Place() {
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
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
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
                ", cinema=" + cinema +
                ", grade=" + grade +
                ", active=" + active +
                '}';
    }
}
