package com.customer.CustomerRelationshipManagement.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.customer.CustomerRelationshipManagement.repository.CustomerRepository;


@Component
public class ServerInit implements ApplicationRunner{
	@Autowired
	CustomerRepository repo;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		repo.createCustomer("Max");
		repo.createCustomer("Maxine");
		
	}
}
