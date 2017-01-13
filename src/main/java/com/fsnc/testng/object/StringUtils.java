package com.fsnc.testng.object;


public class StringUtils {

	public static boolean isBlank(String str) {
		if (null == str)
			return true;
		return str.trim().length() == 0;
	}
	
	public static boolean isNotBlank(String str){
		return !isBlank(str);
	}
}
