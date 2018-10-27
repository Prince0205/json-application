package com.demo.demojson.customer;

public class Customer {

	private int customer_id;

	private String customer_name;

	private String customer_address;

	//private double amount_payable;


	public Customer(int customer_id, String customer_name, String customer_address) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_address = customer_address;
		//this.amount_payable = amount_payable;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	
	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_address="
				+ customer_address + " ]";
	}

}
