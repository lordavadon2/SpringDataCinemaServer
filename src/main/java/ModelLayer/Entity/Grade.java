package ModelLayer.Entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "grade")
public class Grade implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGrade")
    @NotNull
    private int idGrade;
    @Column(name = "nameGrade")
    @NotNull
    private String nameGrade;
    @Column(name = "activeGrade")
    @NotNull
    private boolean active;

    public Grade(){
    }

    public Grade(String nameGrade) {
        this.nameGrade = nameGrade;
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

    @Override
    public String toString() {
        return "Grade{" +
                "idGrade=" + idGrade +
                ", nameGrade='" + nameGrade + '\'' +
                ", active=" + active +
                '}';
    }
}
