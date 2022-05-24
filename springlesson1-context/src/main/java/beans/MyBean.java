package beans;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component //this is a stereotype annotation. Some others: Service, Controller, Repository
//a bean is actually a class whose instances will be placed in spring's context
public class MyBean {
	// can have whatever i want here
	// we want instances of this class(MyBean) to be in the context of spring
	private String text;
	
	@PostConstruct //when using component scan, use this to instantiate object
	//this instructs spring that it has to call this method immediately after the creation of the component 
	private void init() {
		this.text = "H E L L O";
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	public MyBean(String text) {
		System.out.println(text);
	}
}
