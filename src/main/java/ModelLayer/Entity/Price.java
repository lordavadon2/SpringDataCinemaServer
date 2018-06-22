package ModelLayer.Entity;

import javax.persistence.*;

@Entity
@Table(name = "price")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPrice")
    private int idPrice;
    @OneToOne
    @JoinColumn(name = "sessionPrice")
    private Session session;
    @OneToOne
    @JoinColumn(name = "gradePrice")
    private Grade grade;
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
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
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
        return "Price{" +
                "idPrice=" + idPrice +
                ", costPrice='" + costPrice + '\'' +
                ", session=" + session +
                ", grade=" + grade +
                ", active=" + active +
                '}';
    }
}
