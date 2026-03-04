package mate.academy.hibernate.relations.service.impl;

import mate.academy.hibernate.relations.dao.CountryDao;
import mate.academy.hibernate.relations.dao.impl.AbstractDao;
import mate.academy.hibernate.relations.model.Country;
import mate.academy.hibernate.relations.service.CountryService;

public class CountryServiceImpl extends AbstractService<Country> implements CountryService {

    public CountryServiceImpl(CountryDao dao) {
        super((AbstractDao<Country>) dao);
    }
}
