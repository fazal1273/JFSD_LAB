package com.klef.jfsd.exam.SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.SpringBoot.model.Customer;
import com.klef.jfsd.exam.SpringBoot.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired 
	private CustomerRepository customerrepo;

	@Override
	public List<Customer> getAllCustomers() {
		return customerrepo.findAll();		
	}

}
