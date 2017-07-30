package action;

import dao.CostDAO;

public class CostAction {
	//利用Spring的IOC机制使用JdbcCostDAO
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
