package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.MyBean;
import config.ProjectConfig;

public class Main {
	int x = 50;

	public static void main(String[] args) {
		/*
		 * the context needs to be configured either using XML files or Annotations. 
		 * Here we do through Annotations.
		 * 
		 * annotation is important. a configuration class must be provided to spring it
		 * will be annotated using @configuration
		 */
		
		//This is the implementation of interface named application context
		//that configures the context using annotations.
		try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
			//this is calling bean by type: MyBean b1 = context.getBean(MyBean.class);
			//only way to identify bean here is by the class type
			//when calling by type, you'll have to annotate saying primary

			
			//We can call the bean by name instead:
			//MyBean b1 = context.getBean("myBean1",MyBean.class);
			
			//Beans can also be labeled in  the annotation in the config itself
			//MyBean b1 = context.getBean(MyBean.class);
			//Doing so means changing the name to label
			MyBean b1 = context.getBean(MyBean.class, "String");
			System.out.println(b1.getText());
		}
	}
}

//So far I learned how to place beans inside springs context 