package mate.academy.hibernate.relations.service.impl;

import mate.academy.hibernate.relations.dao.MovieDao;
import mate.academy.hibernate.relations.dao.impl.AbstractDao;
import mate.academy.hibernate.relations.model.Movie;
import mate.academy.hibernate.relations.service.MovieService;

public class MovieServiceImpl extends AbstractService<Movie> implements MovieService {

    public MovieServiceImpl(MovieDao dao) {
        super((AbstractDao<Movie>) dao);
    }
}
