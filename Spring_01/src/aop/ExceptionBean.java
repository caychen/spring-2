package aop;

import org.apache.log4j.Logger;

public class ExceptionBean {

	static Logger logger = Logger.getLogger(ExceptionBean.class);
	//ex表示目标方法抛出的异常
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
