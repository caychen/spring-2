package test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import action.DeleteAction;
import dao.CostDAO;

public class TestAnnotation {

	@Test
	public void test1(){
		String conf ="/applicationContext-annotation.xml";
		@SuppressWarnings("resource")
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext(conf);

		//默认名字为类名，且首字母小写
		CostDAO costDao = (CostDAO) ac.getBean("jdbcCostDAO");
		costDao.delete();
	}
	
	@Test
	public void test2(){
		String conf ="/applicationContext-annotation.xml";
		@SuppressWarnings("resource")
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext(conf);

		//默认名字为类名，且首字母小写
		DeleteAction costAction = (DeleteAction) ac.getBean("deleteAction");
		System.out.println(costAction);
		costAction.execute();
	}
}
