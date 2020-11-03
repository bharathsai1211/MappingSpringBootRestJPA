package com.cg.mappingspringbootjparest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mappingspringbootjparest.Util.ItemUtil;
import com.cg.mappingspringbootjparest.dto.CustomerItemDetails;
import com.cg.mappingspringbootjparest.dto.CustomerItemUpdate;
import com.cg.mappingspringbootjparest.dto.ItemDetails;
import com.cg.mappingspringbootjparest.dto.RequestItem;
import com.cg.mappingspringbootjparest.entites.Item;
import com.cg.mappingspringbootjparest.service.IItemService;

@RestController
@RequestMapping("/items")
public class ItemController {
	@Autowired
	private IItemService service;
	@PostMapping("/add")
	public ItemDetails add(@RequestBody RequestItem request)
	{
		Item item=new Item();
		item.setItemName(request.getItemName());
		service.add(item);
		ItemDetails itemDetails=ItemUtil.todetails(item);
		return itemDetails;
	}
	@PutMapping("/update")
	public ItemDetails update(@RequestBody ItemDetails request)
	{
		Item item=new Item();
		item.setId(request.getId());
		item.setItemName(request.getItemName());
		service.update(item);
		ItemDetails itemDetails=ItemUtil.todetails(item);
		return itemDetails;
	}
	@PutMapping("/allot")
	public CustomerItemDetails allot(@RequestBody CustomerItemUpdate request )
	{
		Item item=service.buy(request.getId(), request.getItem_id());
		CustomerItemDetails customerItem=ItemUtil.toCustomerItemDeatils(item);
		return customerItem;
	}
	

}
