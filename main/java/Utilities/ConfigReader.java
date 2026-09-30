package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties prop;
	
	public static void loadProperties() throws IOException {
		prop = new Properties();
		
		FileInputStream file = new FileInputStream("C:\\Users\\gopin\\eclipse-workspace\\SeleniumAutomation\\src\\test\\resources\\config.properties");
		
		prop.load(file);
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
}
