package ModelLayer.Entity;

import javax.persistence.*;

@Entity
@Table(name = "cinema")
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCinema")
    private int idCinema;
    @Column(name = "nameCinema")
    private String nameCinema;
//    @Column(name = "active")
//    private boolean active;

    public Cinema() {
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

//    public boolean isActive() {
//        return active;
//    }
//
//    public void setActive(boolean active) {
//        this.active = active;
//    }

    @Override
    public String toString() {
        return "Cinema{" +
                "idCinema=" + idCinema +
                ", nameCinema='" + nameCinema + '\'' +
 //               ", active=" + active +
                '}';
    }
}
