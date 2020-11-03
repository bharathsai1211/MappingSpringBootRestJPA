package com.cg.mappingspringbootjparest.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mappingspringbootjparest.dao.ICustomerDao;
import com.cg.mappingspringbootjparest.entites.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao dao;

	@Override
	public Customer add(Customer customer) {
		return dao.save(customer);
	}

	@Override
	public Customer update(Customer customer) {
		return dao.save(customer);
	}

	

	@Override
	public Customer fetchById(Integer id) {
		 Optional<Customer> customer=dao.findById(id);
		 return customer.get();
	}

}
