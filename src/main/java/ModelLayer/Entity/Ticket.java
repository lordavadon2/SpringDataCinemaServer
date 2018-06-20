package ModelLayer.Entity;

public class Ticket {

    private int idTicket;
    private Place placeTicket;
    private Price priceTicket;
    private boolean active;

    public Ticket() {
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
                ", active=" + active +
                '}';
    }
}
