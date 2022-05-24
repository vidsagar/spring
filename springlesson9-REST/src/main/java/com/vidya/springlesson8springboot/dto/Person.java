package com.vidya.springlesson8springboot.dto;

//Person is my DTO
//Data Transfer Object: They represent the object that is transferred

public class Person {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
