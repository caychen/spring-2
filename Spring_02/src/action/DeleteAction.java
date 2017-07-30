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

	//���ù��췽ʽע��һ��CostDAO����
	public DeleteAction(CostDAO costDAO){
		this.costDAO = costDAO;
	}

	public String execute(){
		String s = null;
		s.length();
		System.out.println("ִ��ɾ����¼����");
		costDAO.delete();
		return "success";
	}
}
