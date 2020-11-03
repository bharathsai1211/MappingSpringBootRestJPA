package com.cg.mappingspringbootjparest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.mappingspringbootjparest.entites.Item;

public interface IItemDao extends JpaRepository<Item,Integer>{

}
