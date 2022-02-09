package local.rps.artikl;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

	public  interface ArtiklRepository extends JpaRepository <Artikl, Integer> {

	//	public List <Artikl> findByName(String name);
	//	public List <Artikl> findByUserID(Integer id);
		
 /*   	@Query(value = "SELECT * FROM Artikl i WHERE i.status = POPUST", nativeQuery = true)
	    public  List <Artikl> getDiscountedItems();
	    
		@Query(value = "SELECT * FROM Artikl i WHERE i.price<= ?2 and i.price>= ?1", nativeQuery = true)
		public  List <Artikl> filterByPrice(Integer minimum, Integer maximum);
		*/
}

