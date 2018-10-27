package com.demo.demojson.customer;

import java.util.List;

public interface ICustomerService {

	public List<Customer> getAll();

	Customer getById(int id);
	
}
