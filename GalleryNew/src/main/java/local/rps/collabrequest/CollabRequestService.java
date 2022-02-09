package local.rps.collabrequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CollabRequestService {
	
	public CollabRequestService() {
	//	super();
	//	collabs=new ArrayList <CollabRequest>();
	//	collabs.add( new CollabRequest("Nausnice","fima masa","cijena stojecih nausnica bi bila 20km, a visecih 30km"));
	}
 
	@Autowired
	CollabRequestRepository collabRequestRepository;
	
	public List <CollabRequest> getCollabs(){
		return collabRequestRepository.findAll();
	}
	
	public void sendCollabRequest(CollabRequest o) {
		collabRequestRepository.save(o);
	}
	
	public Optional<CollabRequest> getCR(int r) {
		return collabRequestRepository.findById(r);
	}
	
//	public void acceptcollabRequest(int id) {
	//	collabRequestRepository.getOne(id).setStatus("Accepted");
	//}
	
	public void deleteCollabRequest(int r) {
		collabRequestRepository.deleteById(r);
	}
	
	
}
