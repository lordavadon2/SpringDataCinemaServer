package DAOLayer;

import ModelLayer.Entity.Movie;

import java.util.List;

public interface IDAOMovie {
    void addMovie(Movie newMovie);

    Movie getByIdMovie(int id);

    List<Movie> getAllMovie();

    void updateMovie(Movie changedMovie);

    void diactivedMovie (Movie removedMovie);
}
