package com.adactin.readers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties pro;

	public ConfigurationReader() throws IOException {
		File f = new File(
				"C:\\Users\\user pc\\eclipse-workspace\\cucumberproject\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		pro = new Properties();
		pro.load(fis);

	}

	public String getBrowserName() {
		String browser = pro.getProperty("browsername");
		return browser;
	}

	public String getUrl() {
		String url = pro.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	
}
