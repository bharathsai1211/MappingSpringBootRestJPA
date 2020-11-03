package com.cg.mappingspringbootjparest.Util;

import com.cg.mappingspringbootjparest.dto.CustomerDetails;
import com.cg.mappingspringbootjparest.entites.Customer;

public class CustomerUtil {
	public static CustomerDetails todeatils(Customer customer)
	{
		CustomerDetails customerDeatils=new CustomerDetails();
		customerDeatils.setFirstName(customer.getFirstName());
		customerDeatils.setLastName(customer.getLastName());
		customerDeatils.setId(customer.getId());
		return customerDeatils;
		
	}

}
