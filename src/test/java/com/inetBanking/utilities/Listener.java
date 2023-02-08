package com.inetBanking.utilities;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.inetBanking.TestCases.BaseClass;


public class Listener extends BaseClass implements ITestListener  {
	ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
	ExtentReports extent=ReportingConfig.reports();
   ExtentTest test;
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getMethod().getMethodName()); 
		extentTest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		extentTest.get().log(Status.PASS, "this test is pass");
	}

	public void onTestFailure(ITestResult result) {
		String path=null;
		extentTest.get().fail(result.getThrowable());
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		try {
			 path=getScreenShot(result.getMethod().getMethodName(),driver);
			 extentTest.get().addScreenCaptureFromPath(path,result.getMethod().getMethodName() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(path,result.getMethod().getMethodName() );
		
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {

	
	}

	public void onFinish(ITestContext context) {
	 extent.flush();	
	}
	

}
