package com.customer.CustomerRelationshipManagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Customer")
public class CustomerImp implements Customer{

	@Id
	@GeneratedValue
	private Long id;
	
	private String customerName;	
	
	
	protected CustomerImp() {}//for jpa only
	public CustomerImp(String name) {
		customerName= name;
		
	}
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return customerName;
	}

	
}
