package dao.impl;

import dao.CostDAO;

public class JdbcCostDAO implements CostDAO {

	public JdbcCostDAO() {
		// TODO Auto-generated constructor stub
		System.out.println("-----创建------");
	}
	
	
	public void myinit(){
		System.out.println("-----初始化-------");
	}
	
	
	public void mydestroy(){
		System.out.println("------销毁--------");
	}
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("利用JDBC技术添加记录");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("利用JDBC技术删除记录");
	}

}
