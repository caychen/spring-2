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
	//ex表示目标方法抛出的异常
	
	@AfterThrowing(pointcut="mypoint()",throwing="ex")
	public void exec(Exception ex){
		//记录异常信息
		//System.out.println("将异常写入文件:" + ex);
		
		logger.error("=====错误信息=========");
		logger.error("异常类型：" + ex);
		StackTraceElement[] els = ex.getStackTrace();
		for (StackTraceElement stackTraceElement : els) {
			logger.error(stackTraceElement);
		}
	}
}
