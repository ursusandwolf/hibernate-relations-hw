package mate.academy.hibernate.relations.service.impl;

import mate.academy.hibernate.relations.dao.impl.AbstractDao;

public abstract class AbstractService<T> {
    private AbstractDao<T> dao;

    protected AbstractService(AbstractDao<T> dao) {
        this.dao = dao;
    }

    public T add(T entity) {
        return dao.add(entity);
    }

    public T get(Long id) {
        return dao.get(id).orElse(null);
    }
}
