package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import base.Driver;

public class TestUtils extends Driver{
	
	public static String getProperty(String key) {
		String value = null;
		Properties prop = loadProperty("testRun");
		value = prop.getProperty(key);
		if (value == null) {
			String env = prop.getProperty("testEnv");
			prop = loadProperty(env);
			value = prop.getProperty(key);
		}

		return value;
	}

	public static Properties loadProperty(String propFileName) {
		Properties prop = new Properties();
		String filePath = ".\\src\\main\\resources\\properties\\"+ propFileName +".properties";
		try {
			File file = new File(filePath);
			FileInputStream stream = new FileInputStream(file);
			prop.load(stream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return prop;
	}
	
	public String []  directTVPageActual(String actual) {
		
		if(actual.isEmpty()) return null;	
		String [] actualArr = actual.split(" ");
		
		return actualArr;	
	}
	
	public String []  directTVPageExpected(String expected) {
		
		if(expected.isEmpty()) return null;	
		String [] expectedArr = expected.split(" ");
		
		return expectedArr;	
	}
	 

}
