package trojan.bite.db.planet.dao;

import org.springframework.data.repository.CrudRepository;

import trojan.bite.db.planet.entity.Event;

public interface IEventDAO extends CrudRepository<Event, Integer> {

}
