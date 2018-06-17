package ModelLayer.Entity;

public class Movie {

    private int idMovie;
    private String nameMovie;

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

    @Override
    public String toString() {
        return "Movie{" +
                "idMovie=" + idMovie +
                ", nameMovie='" + nameMovie + '\'' +
                '}';
    }
}
