package local.rps.artikl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service 
public class ArtiklService {
	
	@Autowired ArtiklRepository artiklRepository;

	public ArtiklService() {
		super();
	//	items = new ArrayList <Item> ();
	//items.add(new Item(212,"Ptica",44,"opis","22x100x50","porcelan","","bijela","zidna skulptura",100,"Ptice","Dostupno"));
		
	}

	
	public List <Artikl>  getAllItems(){
		return artiklRepository.findAll();
	}
	
	public void addItem(Artikl i) {
		artiklRepository.save(i);
	}
	
	public Optional<Artikl> getItemByID(int id) {
		return  artiklRepository.findById(id);
	}
	
	public void updateItem( Artikl i) {
		artiklRepository.save(i);
	}
	
	public void deleteCountryByID(int id) {
		artiklRepository.deleteById(id);
	}
	/*	
	public ArrayList <Item>  filterByType(String tip){
		return (ArrayList<Item>)  items.stream().filter(t->(t.type==tip));
		artiklRepository.fil
	}
	
	public ArrayList <Item>  filterByColor(String c){
		return (ArrayList<Item>) items.stream().filter(t->(t.color==c));
	}
	
	public ArrayList <Item>  collection(String c){
		return (ArrayList<Item>) items.stream().filter(t->(t.collection==c));
	}
	
	public ArrayList <Item>  filterByMaterial(String m){
		return (ArrayList<Item>) items.stream().filter(t->(t.material==m));
	}
		
	public   List<Artikl> filterByPrice(int minimum, int maximum){
		  return artiklRepository.filterByPrice(minimum,maximum);
	}
	 public  List <Artikl> getDiscountedItems(){
		 return artiklRepository.getDiscountedItems();
	 }
	 */
}
