package dao.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Repository;

import dao.CostDAO;

@Repository
/**
 * 	ע��@RepositoryĬ��Ϊ������������ĸСд
 * 	����ʹ��@Repository("�Զ���")����getBean��ʱ����Ҫʹ���Զ��������
 * 
 *	�����Ҫ�ǵ����Ļ�������ʹ��@Scope("prototyep") 
 *
 */
public class JdbcCostDAO implements CostDAO {

	public JdbcCostDAO() {
		// TODO Auto-generated constructor stub
		System.out.println("-----����------");
	}
	
	@PostConstruct //�ȼ���init-method���Զ���
	public void myinit(){
		System.out.println("-----��ʼ��-------");
	}
	
	@PreDestroy	//�ȼ���destroy-method���Զ���
	public void mydestroy(){
		System.out.println("------����--------");
	}
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("����JDBC������Ӽ�¼");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("����JDBC����ɾ����¼");
	}

}
