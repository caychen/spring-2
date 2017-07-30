package test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.MessageBean;

public class TestInjection {

	@Test
	public void test1(){
		String conf = "/applicationContext.xml";
		@SuppressWarnings("resource")
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		
		MessageBean msgBean = (MessageBean) ac.getBean("messageBean");
		msgBean.show();
	}
}
