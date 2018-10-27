package com.demo.demojson.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

	List<Customer> customers = new ArrayList<Customer>();
	public CustomerService() {
		customers.add(new Customer(1, "Avik", "ElectronicCity"));	
		customers.add(new Customer(2, "Abhinesh", "Madiwalla"));
		customers.add(new Customer(3, "Rajinikanth", "Sarjapura"));
		customers.add(new Customer(4, "Siddappa", "Sarjapur"));
		customers.add(new Customer(5, "Amit", "Jayanagar" ));
		customers.add(new Customer(6, "Anand", "Mahadevapura"));
		customers.add(new Customer(7, "Vikram", "SilkBoard"));
		customers.add(new Customer(8, "Karthik", "Jayanagar"));
		customers.add(new Customer(9, "Prince", "MGRoad"));
		customers.add(new Customer(10, "Nandish", "RajajiNagara"));
		customers.add(new Customer(11, "Babu", "Kormangalla"));	
		customers.add(new Customer(12, "Ayan", "Madiwalla"));
		customers.add(new Customer(13, "Vamsi", "Agara"));
		customers.add(new Customer(14, "David", "VijyaNagar"));
		customers.add(new Customer(15, "Vijya", "Banashankri" ));
	}
	
	@Override
	public List<Customer> getAll() {
		return customers;
	}

	@Override
	public Customer getById(int id) {
		Customer custo = new Customer();
		
		for (Customer customer : customers) {
			if(id == customer.getCustomer_id()) {
			custo =	customer;
			}
		}
		
		return custo;
	}


}
