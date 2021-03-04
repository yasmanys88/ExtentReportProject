package com.google.qa.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	private static ExtentReports extent;
	    
	    public static ExtentReports getInstance() {
	    	if (extent == null)
	    		createInstance("test-output/extent.html");
	    	
	        return extent;
	    }
	    
	    public static ExtentReports createInstance(String fileName) {
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
	        htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
	        htmlReporter.config().setChartVisibilityOnOpen(true);
	        htmlReporter.config().setTheme(Theme.STANDARD);
	        htmlReporter.config().setDocumentTitle(fileName);
	        htmlReporter.config().setEncoding("utf-8");
	        htmlReporter.config().setReportName(fileName);
	        
	        
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        extent.setSystemInfo("os.name", System.getProperty("os.name"));
	        extent.setSystemInfo("os.version", System.getProperty("os.version"));
	        extent.setSystemInfo("os.arch", System.getProperty("os.arch"));
	        extent.setSystemInfo("user.name", System.getProperty("user.name"));
	          
	        return extent;
	    }
}
