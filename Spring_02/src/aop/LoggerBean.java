package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import util.PropertiesUtil;

/**
 * ��¼������־�Ĵ������
 * @author ľʯǰ��Cam
 *
 */
@Component	//�������ɨ�赽Spring������
@Aspect	//�����������Ϊ�������
public class LoggerBean {
	
	//���������
	@Pointcut("within(action.*)")
	public void mypoint(){}//��ҪĿ����Ϊ��ʹ��@Pointcut

	//���û���֪ͨ
	@Around("mypoint()")
	public Object logger(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("��¼�û��Ĳ�����־");
		//ǰ���߼�
		//��ȡҪִ�е�Ŀ���������
		String clazz = pjp.getTarget().getClass().getName();
		
		//��ȡҪִ�еķ�����
		String mth = pjp.getSignature().getName();
		System.out.println(clazz + "," + mth);
		
		//���������ͷ����������û���ʾ����Ĳ�����Ϣ
		String key = clazz + "." + mth;
		
		//����properties������key��ȡ��Ϣ
		
		System.out.println(PropertiesUtil.getValue(key));
		Object obj = pjp.proceed();
		//�����߼�
		return obj;
	}
}
