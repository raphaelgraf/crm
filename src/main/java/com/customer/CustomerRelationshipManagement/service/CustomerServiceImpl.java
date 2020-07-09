package com.customer.CustomerRelationshipManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.CustomerRelationshipManagement.model.Customer;
import com.customer.CustomerRelationshipManagement.model.Memo;
import com.customer.CustomerRelationshipManagement.repository.CustomerRepository;
import com.customer.CustomerRelationshipManagement.repository.MemoRepository;




@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	MemoRepository memoRepository;

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAllCustomer();
	}
	@Override
	public Customer createCustomer(String customerName) {
		//check input
		if(customerName == null ){
			
		/*	throw new InvalidParamException(
					String.format("Customer name: %s, Passwort: %s", customerName, password)
					);*/
		}
		
		//check logic customername may not already exist
		Customer exixtingCustomer = customerRepository.findCustomerByCustomerName(customerName);
		
		/*if (exixtingCustomer != null) {
			throw new CustomerAllreadyExistsException(
					String.format("Customer name: %s", customerName)
					);
		}*/
		// TODO create,save,return and return new customer
		return customerRepository.createCustomer(customerName);
	}
	@Override
	public Customer getCustomerById(Long id) {
		/*if(id == null){
			//TODO throw exception
		}
		return customerRepository.findById(id)
				//TODO better exception
				.orElseThrow(RuntimeException::new);
	*/return customerRepository.findById(id).orElseThrow(RuntimeException::new);
	}
	@Override
	public List<Memo> getAllMemos() {
		// TODO Auto-generated method stub
		return memoRepository.findAllMemos();
	}
	@Override
	public Memo getMemoById(Long id) {
		// TODO Auto-generated method stub
		 if (id != null) {
			throw new RuntimeException();
		} return memoRepository.findById(id).orElseThrow(RuntimeException::new);
		
	}
	@Override
	public Memo createMemo(String text) {
		if(text == null ){
			
		}
			return memoRepository.createMemo(text);
		
	}
	
	
	
	
	
}
