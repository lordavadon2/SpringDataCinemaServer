package ModelLayer.Entity;

public class Movie {

    private int idMovie;
    private String nameMovie;
    private boolean active;

    public Movie() {
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "idMovie=" + idMovie +
                ", nameMovie='" + nameMovie + '\'' +
                ", active=" + active +
                '}';
    }
}
