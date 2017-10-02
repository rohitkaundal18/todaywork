package com.stateFarm.com.stateFarm.InterFace;

import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
	protected Properties prop =null;
	protected InputStream input = PropertyReader.class.getClassLoader().getResourceAsStream("\\Data\\config.properties");

	public PropertyReader() {
		try {
			 prop = new Properties();
			prop.load(input);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	

	
	public String getUrl() {
		return prop.getProperty("Url");
	}

	public String getBrowser() {
		return prop.getProperty("browserType");
	}
	
}
