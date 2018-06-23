package ModelLayer.Entity;

import javax.persistence.*;

@Entity
@Table(name = "price")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPrice")
    private int idPrice;
    @ManyToOne
    @JoinColumn(name = "sessionID")
    private Session sessionPrice;
    @ManyToOne
    @JoinColumn(name = "gradeID")
    private Grade gradePrice;
    @Column(name = "costPrice")
    private int costPrice;
    @Column(name = "activePrice")
    private boolean active;

    public Price() {
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
