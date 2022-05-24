package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import repositories.ProductRepository;

public class Main {

	public static void main(String[] args) {
		try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
			ProductRepository pr = c.getBean(ProductRepository.class);
			pr.addProduct("beer");
		}
	}

}
