package com.google.qa.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportListener implements ITestListener  {

	private static ExtentReports extent = ExtentManager.createInstance("extent.html");
	ExtentTest testlogger;

  
   	public synchronized void onStart(ITestContext context) {
          
   	}


   	public synchronized void onFinish(ITestContext context) {
   		extent.flush();
   	}
   	
   	
   	public synchronized void onTestStart(ITestResult result) {
   		testlogger= extent.createTest(getClass().getName());
   		testlogger.info(" onTestStart");
   		testlogger.info(result.getTestName());
  
   	}

  
   	public synchronized void onTestSuccess(ITestResult result) {
   		testlogger.pass(result.getTestName());
   	}

 
   	public synchronized void onTestFailure(ITestResult result) {
   		testlogger.fail(result.getTestName());
   	}


   	public synchronized void onTestSkipped(ITestResult result) {
   		testlogger.skip(result.getTestName());
   	}


   	public synchronized void onTestFailedButWithinSuccessPercentage(ITestResult result) {
   		
   	}
    
  
	
}