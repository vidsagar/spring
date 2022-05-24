package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import repositories.ProductRepositories;

@Service
public class ProductService{
	@Autowired
	private ProductRepositories productRepository;
	
	 
	
	@Transactional
	public void addTenProducts() {
		for(int i = 0; i<10; i++) {
			productRepository.addProduct("Product " + i);
			if(i==5) throw new RuntimeException("aww baby");
		}
		
	}

//@Component
//public class ProductService {
//	private int id;
//	private String name;
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	@Override
//	public String toString() {
//		return "ProductService [id=" + id + ", name=" + name + "]";
//	}
}
