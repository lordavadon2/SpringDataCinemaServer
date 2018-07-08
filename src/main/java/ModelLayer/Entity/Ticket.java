package ModelLayer.Entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ticket")
public class Ticket implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTicket")
    @NotNull
    private int idTicket;
    @OneToOne
    @JoinColumn(name = "placeTicket")
    @NotNull
    private Place placeTicket;
    @OneToOne
    @JoinColumn(name = "priceTicket")
    @NotNull
    private Price priceTicket;
    @Column(name = "orderTicket")
    @NotNull
    private int OrderTicket;
    @Column(name = "sitPlaceTicket")
    @NotNull
    private int sitPlaceTicket;
    @Column(name = "activeTicket")
    @NotNull
    private boolean active;

    public Ticket() {
    }

    public Ticket(Place placeTicket, Price priceTicket, int orderTicket, int sitPlaceTicket) {
        this.placeTicket = placeTicket;
        this.priceTicket = priceTicket;
        OrderTicket = orderTicket;
        this.sitPlaceTicket = sitPlaceTicket;
        this.active = true;
    }

    public Ticket(int idTicket, Place placeTicket, Price priceTicket, int orderTicket, int sitPlaceTicket, boolean active) {
        this.idTicket = idTicket;
        this.placeTicket = placeTicket;
        this.priceTicket = priceTicket;
        OrderTicket = orderTicket;
        this.sitPlaceTicket = sitPlaceTicket;
        this.active = active;
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

    public int getSitPlaceTicket() {
        return sitPlaceTicket;
    }

    public void setSitPlaceTicket(int sitPlaceTicket) {
        this.sitPlaceTicket = sitPlaceTicket;
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
                ", sitPlaceTicket=" + sitPlaceTicket +
                ", active=" + active +
                '}';
    }
}
