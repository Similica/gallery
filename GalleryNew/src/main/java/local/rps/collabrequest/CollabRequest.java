package local.rps.collabrequest;
import javax.persistence.*;

@Entity
public class CollabRequest {
	
	@Id
	private int id;
	private String type;
	private String material;
	private String suggPrice;
	private String status;
	
	/*
	    { 
	 "id" : 1 ,
     "type" : "zidne skulpture" ,
	 "material" : "porcelan" ,
	 "suggPrice" : "50-55 KM"  ,
	 "status" : "Poslana" 
	 }
	 */
	
	public CollabRequest() {
		
	}

	public CollabRequest(int id,String type, String material, String suggPrice) {
		super();
		this.id=id;
		this.type = type;
		this.material = material;
		this.suggPrice = suggPrice;
	
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSuggPrice() {
		return suggPrice;
	}
	public void setSuggPrice(String suggPrice) {
		this.suggPrice = suggPrice;
	}

}