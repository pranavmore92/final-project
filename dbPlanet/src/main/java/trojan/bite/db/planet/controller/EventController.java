package trojan.bite.db.planet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trojan.bite.db.planet.dao.IEventDAO;
import trojan.bite.db.planet.entity.Event;

@RestController
@RequestMapping("/dbPlanet")
public class EventController {

	@Autowired
	private IEventDAO eventDAO;
	
	@GetMapping("/getEvent")
	public String getEvents()
	{
		return "This is output of first spring boot app...";
	}
}
