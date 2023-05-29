package com.rest.webservices.reswebservices.versioning;

public class PersonV1 {

	private String name;

	public PersonV1(String name) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonV1 [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	
}
