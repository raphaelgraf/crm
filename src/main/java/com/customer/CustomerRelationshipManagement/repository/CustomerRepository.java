package com.customer.CustomerRelationshipManagement.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.CustomerRelationshipManagement.model.Customer;
import com.customer.CustomerRelationshipManagement.model.CustomerImp;
import com.customer.CustomerRelationshipManagement.model.Memo;




public interface CustomerRepository extends JpaRepository<CustomerImp, Long>{

	public default List<Customer> findAllCustomer(){
		return new ArrayList<Customer>(findAll());
		
	}
	public Customer findCustomerByCustomerName(String customerName);
	public default Customer createCustomer(String customerName) {
		return save( new CustomerImp(customerName));
	}
	
}
