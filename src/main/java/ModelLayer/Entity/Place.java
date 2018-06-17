package ModelLayer.Entity;

public class Place {

    private int idPlace;
    private int rowPlace;
    private int sitPlace;
    private Cinema cinema;
    private Grade grade;

    public Place() {
    }

    public int getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(int idPlace) {
        this.idPlace = idPlace;
    }

    public int getRowPlace() {
        return rowPlace;
    }

    public void setRowPlace(int rowPlace) {
        this.rowPlace = rowPlace;
    }

    public int getSitPlace() {
        return sitPlace;
    }

    public void setSitPlace(int sitPlace) {
        this.sitPlace = sitPlace;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Place{" +
                "idPlace=" + idPlace +
                ", rowPlace=" + rowPlace +
                ", sitPlace=" + sitPlace +
                ", cinema=" + cinema +
                ", grade=" + grade +
                '}';
    }
}
