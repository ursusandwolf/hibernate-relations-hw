package mate.academy.hibernate.relations.service.impl;

import mate.academy.hibernate.relations.dao.ActorDao;
import mate.academy.hibernate.relations.dao.impl.AbstractDao;
import mate.academy.hibernate.relations.model.Actor;
import mate.academy.hibernate.relations.service.ActorService;

public class ActorServiceImpl extends AbstractService<Actor> implements ActorService {

    public ActorServiceImpl(ActorDao dao) {
        super((AbstractDao<Actor>) dao);
    }
}
