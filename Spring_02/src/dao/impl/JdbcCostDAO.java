package dao.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Repository;

import dao.CostDAO;

@Repository
/**
 * 	注意@Repository默认为类名，且首字母小写
 * 	可以使用@Repository("自定义")，在getBean的时候需要使用自定义的名字
 * 
 *	如果需要非单例的话，可以使用@Scope("prototyep") 
 *
 */
public class JdbcCostDAO implements CostDAO {

	public JdbcCostDAO() {
		// TODO Auto-generated constructor stub
		System.out.println("-----创建------");
	}
	
	@PostConstruct //等价于init-method属性定义
	public void myinit(){
		System.out.println("-----初始化-------");
	}
	
	@PreDestroy	//等价于destroy-method属性定义
	public void mydestroy(){
		System.out.println("------销毁--------");
	}
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("利用JDBC技术添加记录");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("利用JDBC技术删除记录");
	}

}
