package ModelLayer.Entity;

public class Cinema {

    private int idCinema;
    private String nameCinema;

    public Cinema() {
    }

    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    public String getNameCinema() {
        return nameCinema;
    }

    public void setNameCinema(String nameCinema) {
        this.nameCinema = nameCinema;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "idCinema=" + idCinema +
                ", nameCinema='" + nameCinema + '\'' +
                '}';
    }
}
