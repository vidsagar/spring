package com.vidya.springlesson9REST.controllers;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vidya.springlesson8springboot.dto.Person;

@RestController
public class HelloController {

	@RequestMapping(method = RequestMethod.GET, path = "/hello/{name}")
	public String hello(@PathVariable("name") String names) {
		return "Hello, " + names + "!";
	}

	// this is same, just shorter syntax
	@GetMapping(path = "/helloget/{name}")
	public String helloGetMapping(@PathVariable("name") String names) {
		return "Hello, " + names + "!";
	}

	@PostMapping(path = "/goodbye")
	public String goodbye(@RequestBody Person p) {
		return "Goodbye, " + p.getName() + "!";
	}

	@GetMapping(path = "/get")
	public Person getPerson() {
		Person p = new Person();
		p.setName("Bill");
		return p;
	}

	@GetMapping(path = "/getall")
	public List<Person> getAllPerson() {
		Person p = new Person();
		p.setName("Bill");
		Person p2 = new Person();
		p2.setName("Bill");
		return Arrays.asList(p, p2);
	}

	@GetMapping(path = "/statustest")
	public void statusTest(HttpServletResponse response) {
		response.setStatus(HttpServletResponse.SC_NO_CONTENT);
	}
}
