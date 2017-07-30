package action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dao.CostDAO;

@Controller("costAction")
@Scope("prototype")
public class CostAction {
	//����Spring��IOC����ʹ��JdbcCostDAO
	@Resource(name="hibernateCostDAO")	//��costDAOע�룬��������ƥ��ע��
	//@Autowired//��Qualifier���һ����
	//@Qualifier("hibernateCostDAO")
	private CostDAO costDAO;

	public CostAction(){
		
	}
	
	public void setCostDAO(CostDAO costDAO) {
		this.costDAO = costDAO;
	}

	public String execute(){
		System.out.println("��¼����");
		costDAO.save();
		return "success";
	}
}
