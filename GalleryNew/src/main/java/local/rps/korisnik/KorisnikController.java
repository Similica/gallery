package local.rps.korisnik;

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
public class KorisnikController {

	@Autowired
	KorisnikService korisnikService;
	
	@RequestMapping("/users")
	public List<Korisnik> getUsers(){
		return korisnikService.getAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/users")
		public void addUser(@RequestBody Korisnik i) {
			korisnikService.addUser(i);
		}
	
	@RequestMapping(method = RequestMethod.GET , value = "/users/{id}")
	public Optional<Korisnik> getUser(@PathVariable int id) {
		return korisnikService.getUserByID(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/users")
	public void updateUser( @RequestBody Korisnik i) {
		korisnikService.updateUser(i);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value = "/users/{id}")
	public void deleteUserByID(@PathVariable int id) {
		
	}

}
