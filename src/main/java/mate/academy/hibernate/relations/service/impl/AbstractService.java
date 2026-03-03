package mate.academy.hibernate.relations.service.impl;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractService<T> {
    private Map<Long, T> storage = new HashMap<>();

    public AbstractService(Map<Long, T> storage) {
        this.storage = storage;
    }

    public T add(Long id, T entity) {
        storage.put(id, entity);
        return entity;
    }

    public T get(Long id) {
        return storage.get(id);
    }
}
