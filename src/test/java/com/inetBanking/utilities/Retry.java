package com.inetBanking.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
   int count=0;
   int maxrun=1;
	public boolean retry(ITestResult result) {
		if(count<maxrun) {
			count++;
			return true;
		}
		return false;
	}

}
