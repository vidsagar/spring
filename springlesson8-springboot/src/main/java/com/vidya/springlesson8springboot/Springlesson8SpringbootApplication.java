package com.vidya.springlesson8springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //this comes with an automatic componentScan
					   //which will scan all packages inside of the main package
						//which is the package this class is in
public class Springlesson8SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springlesson8SpringbootApplication.class, args);
	}

}
