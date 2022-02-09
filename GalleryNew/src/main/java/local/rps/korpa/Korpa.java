package local.rps.korpa;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
 import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import local.rps.artikl.Artikl;
import local.rps.korisnik.Korisnik;



@Entity
public class Korpa {
	
	//@OneToMany 
//	private List <Artikl> lista;
	
	public Korpa() {
		// TODO Auto-generated constructor stub
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Id
	private int userID;
	private double price;
	
//@OneToOne 
//	private Korisnik user;
	

	
}