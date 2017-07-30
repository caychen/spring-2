package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import util.PropertiesUtil;

/**
 * 记录操作日志的处理组件
 * @author 木石前盟Cam
 *
 */
@Component	//将该组件扫描到Spring容器中
@Aspect	//将该组件定义为方面组件
public class LoggerBean {
	
	//定义切入点
	@Pointcut("within(action.*)")
	public void mypoint(){}//主要目的是为了使用@Pointcut

	//采用环绕通知
	@Around("mypoint()")
	public Object logger(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("记录用户的操作日志");
		//前置逻辑
		//获取要执行的目标组件类名
		String clazz = pjp.getTarget().getClass().getName();
		
		//获取要执行的方法名
		String mth = pjp.getSignature().getName();
		System.out.println(clazz + "," + mth);
		
		//根据类名和方法名，给用户提示具体的操作信息
		String key = clazz + "." + mth;
		
		//解析properties，根据key获取消息
		
		System.out.println(PropertiesUtil.getValue(key));
		Object obj = pjp.proceed();
		//后置逻辑
		return obj;
	}
}
