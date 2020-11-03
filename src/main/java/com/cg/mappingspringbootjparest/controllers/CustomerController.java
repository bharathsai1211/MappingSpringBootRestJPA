package com.cg.mappingspringbootjparest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mappingspringbootjparest.Util.CustomerUtil;
import com.cg.mappingspringbootjparest.dto.CustomerDetails;
import com.cg.mappingspringbootjparest.dto.RequestCustomer;
import com.cg.mappingspringbootjparest.entites.Customer;
import com.cg.mappingspringbootjparest.service.ICustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	private ICustomerService service;
	@PostMapping("/add")
	public CustomerDetails add(@RequestBody RequestCustomer request)
	{
		Customer customer=new Customer();
		customer.setFirstName(request.getFirstName());
		customer.setLastName(request.getLastName());
		service.add(customer);
		CustomerDetails customerDetails=CustomerUtil.todeatils(customer);
		return customerDetails;
	}
	
	@PutMapping("/update")
	public CustomerDetails update(@RequestBody CustomerDetails request)
	{
		Customer customer=new Customer();
		customer.setId(request.getId());
		customer.setFirstName(request.getFirstName());
		customer.setLastName(request.getLastName());
		service.update(customer);
		CustomerDetails customerDetails=CustomerUtil.todeatils(customer);
		return customerDetails;
	}
	@GetMapping("/itemslist/{id}")
	public Customer fetchById(@PathVariable Integer id)
	{
		return service.fetchById(id);
	}
	
	

}
