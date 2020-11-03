package com.cg.mappingspringbootjparest.service;

import java.util.List;

import com.cg.mappingspringbootjparest.entites.Customer;

public interface ICustomerService {
	Customer add(Customer customer);
	Customer update(Customer customer);

	Customer fetchById(Integer id);

}
