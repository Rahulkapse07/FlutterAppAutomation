package com.testUtils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;


public class Listeners extends TestUtils implements ITestListener{

//	ExtentReports extent = TestUtils.getReporterObject();
//    ExtentTest test;
//
//    public void onTestStart(ITestResult result) {
//        test = extent.createTest(result.getMethod().getMethodName());
//    }
//
//    public void onTestSuccess(ITestResult result) {
//        try {
//            String screenshotPath = getScreenShotPath(result.getMethod().getMethodName());
//            test.addScreenCaptureFromPath(screenshotPath);
//            test.log(Status.PASS, "Test Passed");  //this will display below the SS
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void onTestFailure(ITestResult result) {
//        try {
//            String screenshotPath = getScreenShotPath(result.getMethod().getMethodName());
//            test.addScreenCaptureFromPath(screenshotPath);
//            test.log(Status.FAIL, result.getThrowable());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void onTestSkipped(ITestResult result) {
//        test.log(Status.SKIP, result.getThrowable());
//    }
//
//    public void onFinish(ITestContext context) {
//        extent.flush();
//    }
//	
	
}
