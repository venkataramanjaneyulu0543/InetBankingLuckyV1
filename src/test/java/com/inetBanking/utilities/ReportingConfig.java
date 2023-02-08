package com.inetBanking.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportingConfig {
	
	
 public  static ExtentReports reports() {
	 String path=System.getProperty("user.dir")+"/report//index.html";
	 ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("InetBanking Reporter");
		reporter.config().setDocumentTitle("Testing Reportes");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","B V R");
		return extent;
		
 }
}
