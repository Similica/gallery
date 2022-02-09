package local.rps.korisnik;
import java.util.List;

import javax.persistence.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import local.rps.narudzba.Narudzba;

@Entity
public class Korisnik {
	
	@Id
	private int userID;
	private String name;
	private String surname;
	private String email;
	private String address;
	private String city;
	private int postcode;
	private String country;

/*
{ 
	 "userID" : 1 ,
     "name" : "Nevena",
	 "surname" : "Milic" ,
	 "email" : "ddc@gmail.com"  ,
	 "address" : "Plitvicka 5" ,
	 "city" : "Banja Luka" ,
	 "postcode" : 78000 ,
	 "country" : "BiH"
	 }
 */
	

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	public Korisnik() {
		
	}
	
	public Korisnik(int userID, String name, String surname, String email, String address, String city, int postcode,
			String country) {
		
		super();
		this.userID = userID;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.address = address;
		this.city = city;
		this.postcode = postcode;
		this.country = country;
		
	}
	
	

	
}
