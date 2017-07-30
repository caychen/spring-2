package action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dao.CostDAO;

@Controller("costAction")
@Scope("prototype")
public class CostAction {
	//利用Spring的IOC机制使用JdbcCostDAO
	@Resource(name="hibernateCostDAO")	//将costDAO注入，按照类型匹配注入
	//@Autowired//与Qualifier结合一起用
	//@Qualifier("hibernateCostDAO")
	private CostDAO costDAO;

	public CostAction(){
		
	}
	
	public void setCostDAO(CostDAO costDAO) {
		this.costDAO = costDAO;
	}

	public String execute(){
		System.out.println("记录增加");
		costDAO.save();
		return "success";
	}
}
