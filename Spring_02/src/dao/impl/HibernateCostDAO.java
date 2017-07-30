package dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import dao.CostDAO;

@Repository("hibernateCostDAO")
@Scope("prototype")
public class HibernateCostDAO implements CostDAO{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("����Hibernate������Ӽ�¼");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("����Hibernate����ɾ����¼");
		
	}

}
