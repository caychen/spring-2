package action;

import dao.CostDAO;

public class DeleteAction {

	private CostDAO costDAO;
	
	
	public void setCostDAO(CostDAO costDAO) {
		this.costDAO = costDAO;
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
