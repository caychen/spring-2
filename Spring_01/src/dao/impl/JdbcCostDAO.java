package dao.impl;

import dao.CostDAO;

public class JdbcCostDAO implements CostDAO {

	public JdbcCostDAO() {
		// TODO Auto-generated constructor stub
		System.out.println("-----����------");
	}
	
	
	public void myinit(){
		System.out.println("-----��ʼ��-------");
	}
	
	
	public void mydestroy(){
		System.out.println("------����--------");
	}
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("����JDBC������Ӽ�¼");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("����JDBC����ɾ����¼");
	}

}
