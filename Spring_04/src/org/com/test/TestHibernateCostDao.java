package org.com.test;

import java.util.List;

import org.com.dao.CostDAO;
import org.com.entity.Cost;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHibernateCostDao {

	@Test //≤‚ ‘xml≈‰÷√
	public void test1(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
		CostDAO costDao = (CostDAO) ac.getBean("hibernateCostDao");
		List<Cost> costList = costDao.findAll();
		for (Cost cost : costList) {
			System.out.println(cost.getName());
		}
	}
	
	//≤‚ ‘◊¢Ω‚≈‰÷√
	@Test
	public void test2(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("/applicationContext-annotation.xml");
		CostDAO costDao = (CostDAO) ac.getBean("hibernateCostDao");
		List<Cost> costList = costDao.findAll();
		for (Cost cost : costList) {
			System.out.println(cost.getName());
		}
	}
}
