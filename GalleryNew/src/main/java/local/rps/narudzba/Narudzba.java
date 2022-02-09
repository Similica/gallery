package local.rps.narudzba;
import javax.persistence.*;

import local.rps.korisnik.Korisnik;

import java.util.ArrayList;

@Entity
public class Narudzba {
/*
 { 
	 "id" : 5 ,
	 "userID" : 1 ,
     "description" : "dsc",
	 "quntity" : 12 ,
	 "due" : "13/6"  ,
	 "status" : "dv"
	 }
 */
	@Id
	private int id;
	private int userID;
	private String description;
	private int quantity;
	private String due;
	private String status;
	
//	@ManyToOne 
//	private Korisnik user;
	
	public Narudzba() {
	
	}
	public Narudzba(int id, int userID, String description, int quantity, String due, String status) {
		super();
		this.id = id;
		this.userID = userID;
		this.description = description;
		this.quantity = quantity;
		this.due = due;
		this.status = status;
		

	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDue() {
		return due;
	}
	public void setDue(String due) {
		this.due = due;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
