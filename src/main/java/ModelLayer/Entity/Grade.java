package ModelLayer.Entity;

import javax.persistence.*;

@Entity
@Table(name = "grade")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGrade")
    private int idGrade;
    @Column(name = "nameGrade")
    private String nameGrade;
//    @Column(name = "active")
//    private boolean active;

    public Grade() {
    }

    public int getIdGrade() {
        return idGrade;
    }

    public void setIdGrade(int idGrade) {
        this.idGrade = idGrade;
    }

    public String getNameGrade() {
        return nameGrade;
    }

    public void setNameGrade(String nameGrade) {
        this.nameGrade = nameGrade;
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
        return "Grade{" +
                "idGrade=" + idGrade +
                ", nameGrade='" + nameGrade + '\'' +
//                ", active=" + active +
                '}';
    }
}
