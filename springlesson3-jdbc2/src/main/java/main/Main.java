package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import demo.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var c = new AnnotationConfigApplicationContext(ProjectConfig.class)){
			Person p = c.getBean(Person.class);
			p.sayHello("Bill");
		}
	}
}
