package action;

import dao.CostDAO;

public class CostAction {
	//����Spring��IOC����ʹ��JdbcCostDAO
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
