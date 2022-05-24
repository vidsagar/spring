package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import services.HelloService;

public class Main {

	public static void main(String[] args) {
		try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
			HelloService service = c.getBean(HelloService.class);

			String res = service.hello("John");
			System.out.println("Result is "+res);
		}
	}

}
