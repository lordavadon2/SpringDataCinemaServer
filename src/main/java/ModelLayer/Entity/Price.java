package ModelLayer.Entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "price")
public class Price implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPrice")
    @NotNull
    private int idPrice;
    @OneToOne
    @JoinColumn(name = "sessionID")
    @NotNull
    private Session sessionPrice;
    @OneToOne
    @JoinColumn(name = "gradeID")
    @NotNull
    private Grade gradePrice;
    @Column(name = "costPrice")
    @NotNull
    private int costPrice;
    @Column(name = "activePrice")
    @NotNull
    private boolean active;

    public Price(){
    }

    public Price(Session sessionPrice, Grade gradePrice, int costPrice) {
        this.sessionPrice = sessionPrice;
        this.gradePrice = gradePrice;
        this.costPrice = costPrice;
        this.active = true;
    }

    public int getIdPrice() {
        return idPrice;
    }

    public void setIdPrice(int idPrice) {
        this.idPrice = idPrice;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public Session getSession() {
        return sessionPrice;
    }

    public void setSession(Session sessionPrice) {
        this.sessionPrice = sessionPrice;
    }

    public Grade getGrade() {
        return gradePrice;
    }

    public void setGrade(Grade gradePrice) {
        this.gradePrice = gradePrice;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Price{" +
                "idPrice=" + idPrice +
                ", costPrice='" + costPrice + '\'' +
                ", session=" + sessionPrice +
                ", grade=" + gradePrice +
                ", active=" + active +
                '}';
    }
}
