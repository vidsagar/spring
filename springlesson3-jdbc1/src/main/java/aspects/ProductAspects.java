package aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProductAspects {
	@Before("execution(* repositories.ProductRepository.getProducts(..))")
	public void before() {
		System.out.println("A#############################");
	}
}
