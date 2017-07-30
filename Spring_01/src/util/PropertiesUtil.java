package util;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	
	public static Properties props = new Properties();
	
	static{
		try {
			props.load(PropertiesUtil.class.getClassLoader().getResourceAsStream("opt.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getValue(String key){
		String value = props.getProperty(key);
		if(value == null)
			return "";
		return value;
	}
}
