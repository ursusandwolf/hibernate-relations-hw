package mate.academy.hibernate.relations.service.impl;

import mate.academy.hibernate.relations.model.Actor;
import mate.academy.hibernate.relations.service.ActorService;

public class ActorServiceImpl extends AbstractService<Actor> implements ActorService {
    @Override
    public Actor add(Actor actor) {
        return super.add(actor.getId(), actor);
    }
}
