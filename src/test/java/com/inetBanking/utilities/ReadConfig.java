package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() {
		File src=new File("./Configration\\config.properties");
		try {
			FileInputStream fi=new FileInputStream(src);
			pro=new Properties();
			pro	.load(fi);
			
		}catch(Exception e)
		{
		System.out.println("Exception is:" +e);	
		}
		
	}
	public String getapplicationUrl() {
		String url=pro.getProperty("baseurl");
		return url;
		
	}
	public String getUser() {
		String user=pro.getProperty("loguser");
		return user;
	}
	public String getpass() {
		String pass=pro.getProperty("logpass");
		
		return pass;
		
	}
       public String getBrowser() {
    	   String browser=pro.getProperty("chromepath");
    	   return browser;
       }
}
