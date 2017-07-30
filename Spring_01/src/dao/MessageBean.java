package dao;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MessageBean {

	private String name;// �û���
	private String fileDir;// �ϴ�·��
	private Set<String> types;//�����ϴ�����
	private List<String> hbms;
	private Set<String> cities;
	private Map<Integer, String> books;
	private Properties props;

	public void setProps(Properties props) {
		this.props = props;
	}

	public void setBooks(Map<Integer, String> books) {
		this.books = books;
	}

	public void setCities(Set<String> cities) {
		this.cities = cities;
	}

	public void setHbms(List<String> hbms) {
		this.hbms = hbms;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFileDir(String fileDir) {
		this.fileDir = fileDir;
	}

	public void show() {
		System.out.println("�û�����" + name);
		System.out.println("�ϴ�·����" + fileDir);

		System.out.println("-----hbm�ļ�����------");
		for (String string : hbms) {
			System.out.println(string);
		}

		System.out.println("-----Cities��������------");
		for (String city : cities) {
			System.out.println(city);
		}

		System.out.println("-----book�鼮����------");
		for (Integer key : books.keySet()) {
			System.out.println("[" + key + "," + books.get(key) + "]");
		}
		
//		for(Entry<Integer,String> pair : books.entrySet()){
//			System.out.println("[" + pair.getKey() + "," + pair.getValue() + "]");
//		}

		System.out.println("-----props��������-------");
		Set<Object> keys = props.keySet();
		for (Object object : keys) {
			System.out.println(object + " : " + props.getProperty(object.toString()));
		}
		
		System.out.println("----�����ϴ���������-----");
		for(String s : types){
			System.out.println(s);
		}
	}
	
	//����setter��ע��һ���ַ������������types���ϸ�ֵ
	public void setTypes(String typeStr){
		String[] arr = typeStr.split(",");
		types = new HashSet<String>();
		for (String string : arr) {
			types.add(string);
		}
	}

}
