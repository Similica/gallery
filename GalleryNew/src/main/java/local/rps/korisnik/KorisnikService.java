package local.rps.korisnik;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service 
public class KorisnikService {
	
	@Autowired KorisnikRepository korisnikRepository;

	public KorisnikService() {
		super();
	}
	
	public List <Korisnik>  getAllUsers(){
		return korisnikRepository.findAll();
	}
	
	public void addUser(Korisnik i) {
		korisnikRepository.save(i);
	}
	
	public Optional<Korisnik> getUserByID(int id) {
		return  korisnikRepository.findById(id);
	}
	
	public void updateUser( Korisnik i) {
		korisnikRepository.save(i);
	}
	
	public void deleteUserByID(int id) {
		korisnikRepository.deleteById(id);
	}
	
}
