package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	/*
	 * Different isolation values for Transactional:
	 * DEFAULT ---> read committed
	 * READ_UNCOMMMITTED
	 * READ_COMMITTED
	 * REPEATABLE_READ
	 * SERIALIZABLE
	 * 
	 * The problems:
	 *  - dirty reads
	 *  	Sometimes when reading values from the database, 
	 *  	uncommitted values might be read that will be rolled
	 *  	back leaving the user with wrong data. (can happen when COMMITTED)
	 *  - repeatable reads
	 *  - phantom reads
	 */
	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.MANDATORY)
	public void addTenProduct() {
		for (int i = 1; i<=10; i++)
		{
			productRepository.addProduct("Product " + i);
		}
	}
}
