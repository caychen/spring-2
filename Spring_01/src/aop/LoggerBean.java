package aop;

import org.aspectj.lang.ProceedingJoinPoint;

import util.PropertiesUtil;

/**
 * ��¼������־�Ĵ������
 * @author ľʯǰ��Cam
 *
 */
public class LoggerBean {

	//���û���֪ͨ
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
