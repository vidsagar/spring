package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import Beans.Cat;

@Configuration
@ComponentScan(basePackages = { "Beans" })
public class ProjectConfig {

//	@Bean
//	public Cat cat() {
//		Cat c = new Cat();
//		c.setName("Tom");
//		return c;
//	}
//			
//	@Bean
//	public Owner owner(Cat cat) {
//		Owner o = new Owner();
//		o.setCat(cat); 
//		/*
//		 * If the parameter object is annotated with @bean, it will
//		 * take try to find that value in the context and inject it
//		 * in the parameter.
//		 */
//		
//		/*
//		 * If we were to call the method cat,
//		 * it wouldn't actually create a new object.
//		 * it does not call the method cat() directly because of @Bean annotation
//		 * since cat is in the context, spring will check if the object(bean) 
//		 * already exists in the context and won't create new one if it does.
//		 */
//		/*
//		 * this is automatic injection by spring
//		 */
//		return o;
//	}
	@Bean
	@Qualifier("cat1")
	public Cat cat1() {
		Cat c = new Cat();
		c.setName("Tom");
		return c;
	}

	@Bean
	@Qualifier("cat2")
	public Cat cat2() {
		Cat c = new Cat();
		c.setName("Leo");
		return c;
	}
}