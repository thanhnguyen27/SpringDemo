package com.i2tech.Autowiredsettermethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//@Service("CustomerBean")
//@Component("CustomerBean")
//@Configuration
@Service
public class Customer {
	//@Autowired(required = true)
	private Person person;
	private int type;
	private String action;
	//getter and setter methods

	
	public Customer() {
		
	}
	
	//@Autowired
	public Person getPerson() {
		System.out.println("@Autowired getPerson:");
		return person;
	}
	
	@Autowired(required = true)
	public void setPerson(Person person) {
		System.out.println("@Autowired setPerson:");
		this.person = person;
	}

	public int getType() {
		return type;
	}
	//@Autowired set bien nguyen thuy loi khi run
	public void setType(int type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + ", type=" + type + ", action=" + action + "]";
	}



	
}
