package aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExceptionBean {

	@Pointcut("with(action.*)")
	public void mypoint(){}
	
	static Logger logger = Logger.getLogger(ExceptionBean.class);
	//ex��ʾĿ�귽���׳����쳣
	
	@AfterThrowing(pointcut="mypoint()",throwing="ex")
	public void exec(Exception ex){
		//��¼�쳣��Ϣ
		//System.out.println("���쳣д���ļ�:" + ex);
		
		logger.error("=====������Ϣ=========");
		logger.error("�쳣���ͣ�" + ex);
		StackTraceElement[] els = ex.getStackTrace();
		for (StackTraceElement stackTraceElement : els) {
			logger.error(stackTraceElement);
		}
	}
}
