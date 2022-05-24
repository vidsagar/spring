package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect //this is not a stereotype annotation
		//this will not create an aspect object 
		//in the context

@Component //this is the component stereotype
		   //annotation and will create an aspect
		   //object in the context
public class HelloServiceAspect {
	//we specify logic that we want to decouple 
	//from our normal business code
	
	//we want this to intercept the method hello (could be before, after, etc.)
	@Before("execution(* services.HelloService.hello(..))") 
	//(..)allows us to intercept overloaded hello methods as well
	public void before() {
		System.out.println("B");
	}
//	
//	
//	@After("execution(* services.HelloService.hello(..))") 
//	public void after() {
//		System.out.println("A");
//	}
//	
//	@AfterReturning("execution(* services.HelloService.hello(..))") 
//	public void afterReturning() {
//		System.out.println("AR");
//	}
//	
//	@AfterThrowing("execution(* services.HelloService.hello(..))") 
//	public void afterThrowing() {
//		System.out.println("AT");
//	}
	@Around("execution(* services.HelloService.hello(..))")
	//ProceedingJoinPoint represents the method intercepted
	public Object around(ProceedingJoinPoint joinPoint) {
		System.out.println("A");
		Object[] result;
		try {
			result = joinPoint.getArgs();
			System.out.println(result[0]);
			System.out.println("B");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	 
}









