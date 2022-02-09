package local.rps.artist;
import javax.persistence.*;

import local.rps.collabrequest.CollabRequest;
import local.rps.korisnik.Korisnik;

@Entity
public class Artist extends Korisnik {

	public String bio;


	public Artist(int userID, String name, String surname,
			String email, String address, String city, int postcode,
			String country, String bio) {
		super(userID, name, surname, email, address, city, postcode, country);
		this.bio = bio;
	}
	
	@ManyToOne 
	private CollabRequest collabRequest;

}
