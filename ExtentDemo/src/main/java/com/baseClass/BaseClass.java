package com.baseClass;

import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	
	public ExtentSparkReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest test;
    
    @BeforeSuite
    public void setExtent() {
        htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/MyReport.html");
        
        htmlReporter.config().setDocumentTitle("Automation Test Report");
        htmlReporter.config().setReportName("OrangeHRM Test Automation Report");

    }
}
