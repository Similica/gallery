package local.rps.collabrequest;


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
public class CollabRequestController {

	@Autowired
	CollabRequestService collabRequestService;
	
	@RequestMapping("/collabs")
	public List <CollabRequest> getCollabs(){
		return collabRequestService.getCollabs();
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/collabs")
		public void sendCollabRequest(@RequestBody CollabRequest i) {
		collabRequestService.sendCollabRequest(i);
		}
	
	@RequestMapping(method = RequestMethod.GET , value = "/collabs/{i}")
	public Optional <CollabRequest> getCR(@PathVariable int i) {
		return collabRequestService.getCR(i);
	}
	
//	@RequestMapping(method = RequestMethod.PUT , value = "/collabs/{i}")
//	public void acceptcollabRequest(@PathVariable int i) {
	//	collabRequestService.acceptcollabRequest(i);
//	}
	
	@RequestMapping(method = RequestMethod.DELETE , value = "/collabs/{i}")
	public void deleteCollabRequest(@PathVariable int i) {
		collabRequestService.deleteCollabRequest(i);
	}
	
	
	
}