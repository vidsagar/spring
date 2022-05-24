package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import repositories.ProductRepository;

@Component
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	//@Transactional actually means that an aspect exists here and point cut happens
	@Transactional
	//rolls back RuntimeExceptiosn but does not rollback checked exceptions
	//behavior can be changed by specifying when to rollback
	//Example: @Transactional (rollbackFor = Exception.class)
	public void addOneProduct() {
		productRepository.addProduct("Beer");
		try {//in this case, exception is caught and the transaction (aspect)
			//does not know about it. 
			throw new RuntimeException(":(");
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		
		
	}
}
