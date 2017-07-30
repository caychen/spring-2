package dao.impl;

import dao.CostDAO;

public class HibernateCostDAO implements CostDAO{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("利用Hibernate技术添加记录");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("利用Hibernate技术删除记录");
		
	}

}
