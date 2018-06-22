package ModelLayer.Entity;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTicket")
    private int idTicket;
    @OneToOne
    @JoinColumn(name = "placeTicket")
    private Place placeTicket;
    @OneToOne
    @JoinColumn(name = "priceTicket")
    private Price priceTicket;
    @Column(name = "orderTicket")
    private int OrderTicket;
    @Column(name = "activeTicket")
    private boolean active;

    public Ticket() {
        this.active = true;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public Place getPlaceTicket() {
        return placeTicket;
    }

    public void setPlaceTicket(Place placeTicket) {
        this.placeTicket = placeTicket;
    }

    public Price getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(Price priceTicket) {
        this.priceTicket = priceTicket;
    }

    public int getOrderTicket() {
        return OrderTicket;
    }

    public void setOrderTicket(int orderTicket) {
        OrderTicket = orderTicket;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "idTicket=" + idTicket +
                ", placeTicket=" + placeTicket +
                ", priceTicket=" + priceTicket +
                ", OrderTicket=" + OrderTicket +
                ", active=" + active +
                '}';
    }
}
