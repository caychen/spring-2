package action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dao.CostDAO;

@Controller("deleteAction")
@Scope("prototype")
public class DeleteAction {

	@Resource(name="jdbcCostDAO")
	private CostDAO costDAO;
	
	public void setCostDAO(CostDAO costDAO) {
		this.costDAO = costDAO;
	}
	
	public DeleteAction(){
	}

	//采用构造方式注入一个CostDAO对象
	public DeleteAction(CostDAO costDAO){
		this.costDAO = costDAO;
	}

	public String execute(){
		String s = null;
		s.length();
		System.out.println("执行删除记录请求");
		costDAO.delete();
		return "success";
	}
}
