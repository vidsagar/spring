package repositories;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

//Repository works with database
@Repository
public class ProductRepository 
{	
	public void add() {
		System.out.println("a new product was added");
	}
}
