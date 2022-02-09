package local.rps.narudzba;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import local.rps.artikl.Artikl;
import local.rps.korisnik.KorisnikRepository;


@Service
public class NarudzbaService {
	

	@Autowired NarudzbaRepository narudzbaRepository;
	
	public NarudzbaService() {
		super();
	}

	public Optional<Narudzba> getNarudzbaByID(int id) {
		return  narudzbaRepository.findById(id);
	}

	
	public void sendOrder(Narudzba o) {
		narudzbaRepository.save(o);
	}
	
	public  List<Narudzba> getOrders(){
		return	narudzbaRepository.findAll();
		 
	}
	
	
	
//	public void acceptOrderByID(int id) {
	//	 orders.stream().filter(t->(t.getId()==id)).setStatus("Accepted");
		//}
	
	public void deleteOrderByID(int id) {
		narudzbaRepository.deleteById(id);
	}
	
	
}
