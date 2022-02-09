package local.rps.event;
import javax.persistence.*;

@Entity
public class Event {
	@Id
	public int id;
	public String opening;
	public String closing;
	public int openingHour;
	public String name;
	public String artist;
	public String description;
	
	/*
	{ 
	 "id" : 5 ,
	 "opening" : "13/2" ,
	 "closing" : "13/3" ,
	 "openingHour": 20  ,
	 "name" : "Pejzazi" ,
	 "artist" : "Renato Rakic"  ,
	 "description": "dsc"
	 }
	 */
	public Event() {
		
	}
	public Event(int id, String opening, String closing, int openingHour, String name, String artist,
			String description) {
		super();
		this.id = id;
		this.opening = opening;
		this.closing = closing;
		this.openingHour = openingHour;
		this.name = name;
		this.artist = artist;
		this.description = description;
	}
	

}
