package com.i2tech.Autowiredsettermethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Person {
	private String name;
	private Address address;
	
	public Person() {
		super();
		this.name= "Person:Name";
	}
	
	@Autowired(required=true)
	public Person(Address address) {
		System.out.println("@Autowired contructor Person");
		
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

	

}
