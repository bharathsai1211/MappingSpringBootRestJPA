package com.cg.mappingspringbootjparest.service;

import com.cg.mappingspringbootjparest.entites.Item;

public interface IItemService {
	Item add(Item item);
	Item update(Item item);
	Item buy(Integer id, Integer itemId);

}
