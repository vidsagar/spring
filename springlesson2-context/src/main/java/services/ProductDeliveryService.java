package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.ProductRepository;

//Service contains use cases
@Service
public class ProductDeliveryService {
	@Autowired
	private ProductRepository productRepository;

	public void addSomeProducts() {
		productRepository.add();
		productRepository.add();
		productRepository.add();
	}
	
	@Autowired
	private ProductRepository productRepo;
	public void addMoreProducts()
	{
		productRepo.add();
		productRepo.add();
	}
}
