package com.customer.CustomerRelationshipManagement.controller.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.CustomerRelationshipManagement.model.Customer;
import com.customer.CustomerRelationshipManagement.model.CustomerDto;
import com.customer.CustomerRelationshipManagement.model.Memo;
import com.customer.CustomerRelationshipManagement.model.MemoDto;
import com.customer.CustomerRelationshipManagement.service.CustomerService;


@RestController
public class CustomerRestController {
	@Autowired
	CustomerService customerService;
	
	
	/** @return list of all customers */
	@RequestMapping("/rest/customers")
	List <CustomerDto> getCustomerList() {
		List<Customer> customers = customerService.getAllCustomers();
		List<CustomerDto> res = new ArrayList<>();
		for(Customer customer : customers) {
			res.add(new CustomerDto(customer));
		}
		return res;
		}
	
	@RequestMapping("/rest/customers/{id}")
	CustomerDto getCustomer(@PathVariable ("id") Long id) {
		return new CustomerDto(customerService.getCustomerById(id)); //TODO
	}
	
	@PostMapping("/rest/customers")
    CustomerDto createCustomer(@RequestBody CustomerDto customerDto) {
		return 
			new CustomerDto(
			customerService.createCustomer(customerDto.customerName)
				); //TODO
	}
	
	
	
	/** @return list of all customers */
	@RequestMapping("/rest/customers/{id}/memos")
	List <MemoDto> getMemoList() {
		List<Memo> memos = customerService.getAllMemos();
		List<MemoDto> res = new ArrayList<>();
		for(Memo memo : memos) {
			res.add(new MemoDto(memo));
		}
		return res;
		}
	
	@RequestMapping("/rest/customers/{id}/{m_id}")
	MemoDto getMemo(@PathVariable ("m_id") Long m_id) {
		return new MemoDto(customerService.getMemoById(m_id)); //TODO
	}
	
	@PostMapping("/rest/customers/{id}/memos")
    MemoDto createMemo(@RequestBody MemoDto memoDto) {
		return 
			new MemoDto(
			customerService.createMemo(memoDto.text)
				); //TODO
	}
	
	
	
	
	
	
}
