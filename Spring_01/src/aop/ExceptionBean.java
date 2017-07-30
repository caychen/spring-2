package aop;

import org.apache.log4j.Logger;

public class ExceptionBean {

	static Logger logger = Logger.getLogger(ExceptionBean.class);
	//ex��ʾĿ�귽���׳����쳣
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
