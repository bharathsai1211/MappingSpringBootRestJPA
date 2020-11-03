package com.cg.mappingspringbootjparest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.mappingspringbootjparest.entites.Customer;

public interface ICustomerDao extends JpaRepository<Customer,Integer>{

}
