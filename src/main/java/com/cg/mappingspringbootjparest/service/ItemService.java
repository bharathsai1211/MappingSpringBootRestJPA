package com.cg.mappingspringbootjparest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mappingspringbootjparest.dao.ICustomerDao;
import com.cg.mappingspringbootjparest.dao.IItemDao;
import com.cg.mappingspringbootjparest.entites.Customer;
import com.cg.mappingspringbootjparest.entites.Item;
@Service
@Transactional
public class ItemService implements IItemService{
	@Autowired
	private IItemDao dao;
	@Autowired
	private ICustomerDao cusDao;
	@Override
	public Item add(Item item) {
		return dao.save(item);
	}

	@Override
	public Item update(Item item) {
		return dao.save(item);
	}
	@Override
	public Item buy(Integer id,Integer itemId)
	{
		Optional<Item> item=dao.findById(itemId);
		Optional<Customer> customer=cusDao.findById(id);
		Customer cus=customer.get();
		Item ite=item.get();
		ite.setCustomer(cus);
		List<Item> itemList=cus.getItems();
		if(itemList==null)
		{
			itemList=new ArrayList<>();
			cus.setItems(itemList);
		}
		itemList.add(ite);
		return ite;
	}

}
