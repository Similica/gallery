package local.rps.event;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service 
public class EventService {
	
	@Autowired EventRepository eventRepository;

	public EventService() {
		super();
	
	}

	
	public List <Event>  getAllEvents(){
		return eventRepository.findAll();
	}
	
	public void addEvent(Event i) {
		eventRepository.save(i);
	}
	
	public Optional<Event> getEventByID(int id) {
		return  eventRepository.findById(id);
	}
	
	public void updateEvent( Event i) {
		eventRepository.save(i);
	}
	
	public void deleteEventByID(int id) {
		eventRepository.deleteById(id);
	}
	
}
	