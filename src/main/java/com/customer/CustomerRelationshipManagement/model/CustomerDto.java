package com.customer.CustomerRelationshipManagement.model;


public class CustomerDto {
	public long id;
	public String customerName;
	
	
	public CustomerDto() {};
	
	public CustomerDto(Customer customer) {
		id=customer.getId();
		customerName=customer.getName();
		
	}

}
