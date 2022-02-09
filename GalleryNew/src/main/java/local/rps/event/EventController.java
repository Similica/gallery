package local.rps.event;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

	@Autowired
	EventService eventService;
	
	@RequestMapping("/events")
	public List <Event> getEvents(){
		return eventService.getAllEvents();
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/events")
		public void addEvent(@RequestBody Event i) {
			eventService.addEvent(i);
		}
	
	@RequestMapping(method = RequestMethod.GET , value = "/events/{id}")
	public Optional<Event> getEvent(@PathVariable int id) {
		return eventService.getEventByID(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/events")
	public void updateEvent( @RequestBody Event i) {
		eventService.updateEvent(i);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value = "/events/{id}")
	public void deleteEventByID(@PathVariable int id) {
		eventService.deleteEventByID(id);
	}
	
}
	
