package action;

import dao.CostDAO;

public class DeleteAction {

	private CostDAO costDAO;
	
	
	public void setCostDAO(CostDAO costDAO) {
		this.costDAO = costDAO;
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
