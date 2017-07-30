package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.CostDAO;

public class TestApplicationContext {

	//测试模式
	@Test
	public void test2(){
		String conf = "/applicationContext.xml";
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		
		CostDAO dao1 = (CostDAO) ac.getBean("jdbcCostDAO");
		CostDAO dao2 = (CostDAO) ac.getBean("jdbcCostDAO");
		System.out.println(dao1 == dao2);
	}
	
	//
	@Test
	public void test1(){
		String conf = "/applicationContext.xml";
		//容器初始化
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		
		CostDAO dao = (CostDAO) ac.getBean("jdbcCostDAO");
		dao.save();
		
		ac.close();
	}
	
}
