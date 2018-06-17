package ModelLayer.Entity;

public class Price {

    private int idPrice;
    private String costPrice;
    private Session session;
    private Grade grade;

    public Price() {
    }

    public int getIdPrice() {
        return idPrice;
    }

    public void setIdPrice(int idPrice) {
        this.idPrice = idPrice;
    }

    public String getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(String costPrice) {
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

    @Override
    public String toString() {
        return "Price{" +
                "idPrice=" + idPrice +
                ", costPrice='" + costPrice + '\'' +
                ", session=" + session +
                ", grade=" + grade +
                '}';
    }
}
