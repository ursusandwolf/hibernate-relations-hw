package mate.academy.hibernate.relations.service.impl;

import mate.academy.hibernate.relations.model.Movie;
import mate.academy.hibernate.relations.service.MovieService;

public class MovieServiceImpl extends AbstractService<Movie> implements MovieService {
    @Override
    public Movie add(Movie movie) {
        return add(movie.getId(), movie);
    }
}
