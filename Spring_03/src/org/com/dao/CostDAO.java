package org.com.dao;

import java.util.List;

import org.com.entity.Cost;

public interface CostDAO {
	
	public List<Cost> findAll();
	
	public Cost findById(Integer id);
	
	public void save(Cost cost);
	
	public void delete(Integer id);
	
	public void update(Cost cost);
	
	public int count();
}
