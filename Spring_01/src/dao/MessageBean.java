package dao;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MessageBean {

	private String name;// 用户名
	private String fileDir;// 上传路径
	private Set<String> types;//允许上传类型
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
		System.out.println("用户名：" + name);
		System.out.println("上传路径：" + fileDir);

		System.out.println("-----hbm文件如下------");
		for (String string : hbms) {
			System.out.println(string);
		}

		System.out.println("-----Cities城市如下------");
		for (String city : cities) {
			System.out.println(city);
		}

		System.out.println("-----book书籍如下------");
		for (Integer key : books.keySet()) {
			System.out.println("[" + key + "," + books.get(key) + "]");
		}
		
//		for(Entry<Integer,String> pair : books.entrySet()){
//			System.out.println("[" + pair.getKey() + "," + pair.getValue() + "]");
//		}

		System.out.println("-----props参数如下-------");
		Set<Object> keys = props.keySet();
		for (Object object : keys) {
			System.out.println(object + " : " + props.getProperty(object.toString()));
		}
		
		System.out.println("----允许上传类型如下-----");
		for(String s : types){
			System.out.println(s);
		}
	}
	
	//特殊setter，注入一个字符串，分析后给types集合赋值
	public void setTypes(String typeStr){
		String[] arr = typeStr.split(",");
		types = new HashSet<String>();
		for (String string : arr) {
			types.add(string);
		}
	}

}
