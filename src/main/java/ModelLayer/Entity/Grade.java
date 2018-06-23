package ModelLayer.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "grade")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGrade")
    private int idGrade;
    @Column(name = "nameGrade")
    private String nameGrade;
    @Column(name = "activeGrade")
    private boolean active;
    @OneToMany(mappedBy = "gradePlace")
    private Set<Place> gradePlaces;
    @OneToMany(mappedBy = "gradePrice")
    private Set<Price> gradePrices;

    public Grade() {
        this.active = true;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Set<Place> getGradePlaces() {
        return gradePlaces;
    }

    public void setGradePlaces(Set<Place> gradePlaces) {
        this.gradePlaces = gradePlaces;
    }

    public Set<Price> getGradePrices() {
        return gradePrices;
    }

    public void setGradePrices(Set<Price> gradePrices) {
        this.gradePrices = gradePrices;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "idGrade=" + idGrade +
                ", nameGrade='" + nameGrade + '\'' +
                ", active=" + active +
                '}';
    }
}
