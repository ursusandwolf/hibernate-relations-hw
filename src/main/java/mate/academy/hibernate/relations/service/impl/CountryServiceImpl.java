package mate.academy.hibernate.relations.service.impl;

import mate.academy.hibernate.relations.model.Country;
import mate.academy.hibernate.relations.service.CountryService;

public class CountryServiceImpl extends AbstractService<Country> implements CountryService {
    @Override
    public Country add(Country country) {
        return add(country.getId(), country);
    }
}
