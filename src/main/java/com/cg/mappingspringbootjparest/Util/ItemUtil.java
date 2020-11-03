package com.cg.mappingspringbootjparest.Util;

import com.cg.mappingspringbootjparest.dto.CustomerItemDetails;
import com.cg.mappingspringbootjparest.dto.ItemDetails;
import com.cg.mappingspringbootjparest.entites.Item;

public class ItemUtil {
	public static ItemDetails todetails(Item item)
	{
		ItemDetails itemDeatils=new ItemDetails();
		itemDeatils.setId(item.getId());
		itemDeatils.setItemName(item.getItemName());
		return itemDeatils;
	}

	public static CustomerItemDetails toCustomerItemDeatils(Item item) {
		CustomerItemDetails cus=new CustomerItemDetails();
		cus.setItemId(item.getId());
		cus.setItemName(item.getItemName());
		if(item.getCustomer()!=null)
		{
			cus.setFirstName(item.getCustomer().getFirstName());
			cus.setLastName(item.getCustomer().getLastName());
			cus.setId(item.getCustomer().getId());
			
		}
		return cus;
	}

}
