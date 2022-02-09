package local.rps.artikl;

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
public class ArtiklController {

	@Autowired
	ArtiklService artiklService;
	
	@RequestMapping("/shop")
	public List<Artikl> getItems(){
		return artiklService.getAllItems();
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/shop")
		public void addItem(@RequestBody Artikl i) {
			artiklService.addItem(i);
		}
	
	@RequestMapping(method = RequestMethod.GET , value = "/shop/{id}")
	public Optional<Artikl> getItem(@PathVariable int id) {
		return artiklService.getItemByID(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/shop")
	public void updateItem( @RequestBody Artikl i) {
		artiklService.updateItem(i);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value = "/shop/{id}")
	public void deleteItemByID(@PathVariable int id) {
		artiklService.deleteCountryByID(id);
	}
	/*
	@RequestMapping(method = RequestMethod.GET , value = "/shop/type/{c}")
	public ArrayList <Item> filterByType(@PathVariable String c) {
		return artiklService.filterByType(c);
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "/shop/color/{c}")
	public ArrayList <Item> filterByColor(@PathVariable String c) {
		return artiklService.filterByColor(c);
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "/shop/collection/{c}")
	public ArrayList <Item> filterByCollection(@PathVariable String c) {
		return artiklService.collection(c);
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "/shop/material/{c}")
	public ArrayList <Item> filterByMaterial(@PathVariable String c) {
		return artiklService.filterByMaterial(c);
	}
	

	@RequestMapping(method = RequestMethod.GET , value = "/shop/price/{m}/{M}")
	public List<Artikl> filterByPrice(@PathVariable int m, @PathVariable int M) {
		return artiklService.filterByPrice(m,M);
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "/shop/sale")
	public List<Artikl> getDiscountedItems() {
		return artiklService.getDiscountedItems();
	}
	*/
}