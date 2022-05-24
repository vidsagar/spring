package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Beans.Cat;
import Beans.Owner;
import config.ProjectConfig;

public class Main {

	public static void main(String[] args) {
		try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

			//Cat x = c.getBean(Cat.class);

			Owner o = c.getBean(Owner.class);

			//x.setName("l");
			//System.out.println(x);
			System.out.println(o);
		}
	}

}
