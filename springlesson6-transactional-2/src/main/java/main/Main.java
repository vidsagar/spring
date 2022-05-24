/**
 * 
 */
package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import repositories.ProductRepositories;
import services.ProductService;

/**
 * @author Vidya
 */
public class Main {

	public static void main(String[] args) {
		try(var c = new AnnotationConfigApplicationContext(ProjectConfig.class))
		{
			var ps = c.getBean(ProductService.class); 
//			var pr = c.getBean(ProductRepositories.class);
//			pr.getProducts();
			ps.addTenProducts();
		}
	}

}
