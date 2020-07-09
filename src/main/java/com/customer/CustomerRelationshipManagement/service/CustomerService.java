
package com.customer.CustomerRelationshipManagement.service;

import java.util.List;

import com.customer.CustomerRelationshipManagement.model.Customer;
import com.customer.CustomerRelationshipManagement.model.Memo;


public interface CustomerService {

	List<Customer> getAllCustomers();

	Customer createCustomer(String customerName);

	Customer getCustomerById(Long id);
	
	List<Memo> getAllMemos();

	Memo getMemoById(Long m_id);

	Memo createMemo(String text);
	
	
	
	
	
}
