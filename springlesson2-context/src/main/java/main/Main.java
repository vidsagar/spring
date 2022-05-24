package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import services.ProductDeliveryService;

public class Main {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
			ProductDeliveryService service = context.getBean(ProductDeliveryService.class);
			service.addMoreProducts();
		}
	}

}
