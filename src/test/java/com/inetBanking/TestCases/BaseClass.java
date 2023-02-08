package com.inetBanking.TestCases;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig=new ReadConfig();
	public String url=readconfig.getapplicationUrl();
	public String user=readconfig.getUser();
	public String pass=readconfig.getpass();
	public WebDriver driver;
	public Logger logger; 
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String bro) {
		if(bro.equals("chrome"))
		System.setProperty("webdriver.chrome.driver",readconfig.getBrowser());
		driver=new ChromeDriver();
		//logger= Logger.getLogger("eBanking");
		//PropertyConfigurator.configure("Log4j.properties");
	
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	public String getScreenShot(String testcaseName,WebDriver driver) throws IOException {
		TakesScreenshot ss= (TakesScreenshot)driver;
	File src=	ss.getScreenshotAs(OutputType.FILE);
	File file=new File(System.getProperty("user.dir")+"reports//"+testcaseName+".png");
	FileUtils.copyFile(src, file);
	return System.getProperty("user.dir")+"reports//"+testcaseName+".png";
	}

}
