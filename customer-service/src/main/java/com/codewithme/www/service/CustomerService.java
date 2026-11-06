package com.codewithme.www.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.codewithme.www.exception.ResourceNotFoundException;
import com.codewithme.www.model.Customer;
import com.codewithme.www.repo.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public Customer addcustomer(Customer customer) {
		return customerRepository.save(customer);
		
	}
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
		
	}
	public Customer getCustomerById(int custId) {
		return customerRepository.findById(custId).orElseThrow(()->new ResourceNotFoundException("Id Not Found"));
	}
	public Customer updateCustomer(Customer customer) {
		Customer cust= customerRepository.findById(customer.getCustId()).orElseThrow(()->new ResourceNotFoundException("Id Not Found"));
		cust.setCustName(customer.getCustName());
		cust.setCustAdd(customer.getCustAdd());
		
		return customerRepository.save(cust);
		
	}
	
	public String deleteCustomer( int custId) {
		Customer cust = customerRepository.findById(custId).orElseThrow(()->new ResourceNotFoundException("Id Not Found"));
		customerRepository.delete(cust);
		return "Record Deleted Successfully";
	}
	

}
