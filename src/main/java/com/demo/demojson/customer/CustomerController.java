package com.demo.demojson.customer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/customers")
public class CustomerController {
	
	// Logger initialization
		final private static Logger logger = LoggerFactory.getLogger(CustomerController.class);

		@Autowired
		ICustomerService customer;
		
		@GetMapping
		public List<Customer> getAllCustomers(){
			return customer.getAll();
		}
		
		@GetMapping(value= "/{id}")
		public ResponseEntity<Customer> getById(@PathVariable Integer id){
			return ResponseEntity.ok().body(customer.getById(id));
		} 

}
