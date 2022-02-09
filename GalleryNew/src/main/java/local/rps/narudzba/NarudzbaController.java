package local.rps.narudzba;
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
public class NarudzbaController {
	
	@Autowired
	NarudzbaService narudzbaService;
	
	@RequestMapping(method=RequestMethod.POST , value= "/orders")
	public void sendOrder(@RequestBody Narudzba o) {
		narudzbaService.sendOrder(o);
	}
	
	@RequestMapping(method=RequestMethod.GET , value= "/orders")
	public List <Narudzba> getOrders(){
		return narudzbaService.getOrders();
	}
	
	@RequestMapping(method=RequestMethod.GET , value= "/orders/{id}")
	public Optional<Narudzba> getOrderByID(@PathVariable int id){
		return narudzbaService.getNarudzbaByID(id);
	}
	
//	@RequestMapping(method=RequestMethod.PUT , value= "/orders/{id}")
	//public void acceptNarudzbaByID(@PathVariable int id) {
	 //narudzbaService.acceptNarudzbaByID(id);
	//}
	
	@RequestMapping(method=RequestMethod.DELETE , value= "/orders/{id}")
		public void deleteOrderByID(@PathVariable int id) {
		narudzbaService.deleteOrderByID(id);
	}
}
