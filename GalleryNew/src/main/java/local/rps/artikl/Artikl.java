package local.rps.artikl;

import javax.persistence.Entity;



import javax.persistence.*;

@Entity
public class Artikl {
	
	@Id
	private int id;
	private int userID;
	public String name;
	public String description;
	public String dimensions;
	public String material;
	public String technique;
	public String color;
	public String type;
	public int price;
	public String collection;
	public String status;
	

	/*	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
*/
	public Artikl()
	{
		
	}	
	public Artikl(int id, int userID, String name, String description, String dimensions, String material,
			String technique, String color, String type, int price, String collection, String status) {
		super();
		this.id = id;
		this.userID=userID;
		this.name = name;
		this.description = description;
		this.dimensions = dimensions;
		this.material = material;
		this.technique = technique;
		this.color = color;
		this.type = type;
		this.price = price;
		this.collection = collection;
		 status= "Novo";
	}
/*	
	@ManyToOne 
	private Korpa cart;

	
public Korpa getCart() {
		return cart;
	}

public void setCart(Korpa cart) {
	this.cart = cart;
}
*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


}

