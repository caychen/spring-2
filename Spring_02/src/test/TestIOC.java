package test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import action.CostAction;
import action.DeleteAction;

public class TestIOC {
	
	@Test
	public void test1(){
		String conf = "/applicationContext.xml";
		
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		
		CostAction action = (CostAction) ac.getBean("costAction");
		System.out.println(action.getClass().getName());
		action.execute();
		
		ac.close();
	}
	
	@Test
	public void test2(){
		String conf = "/applicationContext.xml";
		
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		
		DeleteAction action = (DeleteAction) ac.getBean("deleteAction");
		action.execute();
		
		ac.close();
	}
}
