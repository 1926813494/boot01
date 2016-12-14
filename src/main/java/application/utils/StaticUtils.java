package application.utils;

public class StaticUtils {

	public static String getValue() {
		return SpringUtil.getBean("carDao").toString();
	}
	
	
}
