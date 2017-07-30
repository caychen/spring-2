package test;

import java.util.List;

import org.com.dao.CostDAO;
import org.com.entity.Cost;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbcCostDAO {

	
	@Test
	public void testFindAll1(){
		@SuppressWarnings("resource")
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		CostDAO costDAO = (CostDAO) ac.getBean("costDao");
		List<Cost> costList = costDAO.findAll();
		for (Cost cost : costList) {
			System.out.println(cost.getId() + "," + cost.getName());
		}
		System.out.println(costDAO.count());
	}
	
	@Test
	public void testFindAll2(){
		@SuppressWarnings("resource")
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("/applicationContext-annotation.xml");
		
		CostDAO costDAO = (CostDAO) ac.getBean("jdbcCostDAO");
		List<Cost> costList = costDAO.findAll();
		for (Cost cost : costList) {
			System.out.println(cost.getId() + "," + cost.getName());
		}
		System.out.println(costDAO.count());
	}
}
