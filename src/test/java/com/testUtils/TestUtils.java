package com.testUtils;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
import com.base.BaseTest;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Attachment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

import io.appium.java_client.AppiumDriver;


public class TestUtils extends BaseTest {
	
//static ExtentReports extent;
//	
//
//	public static ExtentReports getReporterObject() {
//		String path = System.getProperty("user.dir") + "/src/test/resources/Reports";
//		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
//		//reporter.config().setReportName("RC Truvideo Enterprise App");
//		reporter.config().setReportName("RC CDK App");
//		reporter.config().setDocumentTitle("Automation Test Result");
//		reporter.config().setTheme(Theme.STANDARD);
//		extent = new ExtentReports();
//		extent.attachReporter(reporter);
//		//extent.setSystemInfo("5 Exceptions", "RC Truvideo");
//		extent.setSystemInfo("5 Exceptions", "RC CDK");
////		extent.setSystemInfo("Device", BaseClass.capabilityName);
////		extent.setSystemInfo("OS", BaseClass.opeartingSystem);
////		extent.setSystemInfo("Build", BaseClass.applicationBuild);
//		return extent;
//
//	}
	
//	public String getScreenShotPath(String testCaseName) throws IOException {
//        if (driver == null) {
//            throw new IllegalStateException("Driver is not initialized. Make sure the driver is set up before taking screenshots.");
//        }
//        
//        File source = driver.getScreenshotAs(OutputType.FILE);
//        String destinationField = System.getProperty("user.dir") + "/src/test/resources/ScreenShots/" + testCaseName + ".png";
//        FileUtils.copyFile(source, new File(destinationField));
//        return destinationField;
//    }
	
	 public String getScreenShotPath(String testCaseName) throws IOException {
	        if (driver == null) {
	            throw new IllegalStateException("Driver is not initialized. Make sure the driver is set up before taking screenshots.");
	        }

	        // Capture original screenshot
	        File source = driver.getScreenshotAs(OutputType.FILE);
	        BufferedImage image = ImageIO.read(source);

	        // Find last interacted element dynamically
	        WebElement lastClickedElement = getLastClickedElement();

	        if (lastClickedElement != null) {
	            org.openqa.selenium.Point point = lastClickedElement.getLocation();
	            int elementWidth = lastClickedElement.getSize().getWidth();
	            int elementHeight = lastClickedElement.getSize().getHeight();

	            // Draw rectangle around last interacted element
	            Graphics2D graphics = image.createGraphics();
	            graphics.setColor(java.awt.Color.RED);
	            graphics.setStroke(new BasicStroke(5));
	            graphics.drawRect(point.getX(), point.getY(), elementWidth, elementHeight);
	            graphics.dispose();
	        }

	        // Save modified screenshot
	        String destinationPath = System.getProperty("user.dir") + "/src/test/resources/ScreenShots/" + testCaseName + ".png";
	        File destinationFile = new File(destinationPath);
	        ImageIO.write(image, "png", destinationFile);

	        return destinationPath;
	    }



	 private WebElement getLastClickedElement() {
		    try {
		        // Get all elements using a valid XPath method
		        List<WebElement> elements = driver.findElements(By.xpath("//*"));

		        // Loop through elements to find the last focused element
		        for (WebElement element : elements) {
		            String isFocused = element.getAttribute("focused");
		            if ("true".equals(isFocused)) {  // Check if the element is focused
		                return element;  // Return the last interacted element
		            }
		        }
		    } catch (Exception e) {
		        System.out.println("Error fetching last clicked element: " + e.getMessage());
		    }
		    return null;  // Return null if no focused element is found
		}
	 
	 //for allure report
	 @Attachment(value = "Screenshot", type = "image/png")
	    public byte[] captureScreenshot() {
	        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        File destFile = new File(System.getProperty("user.dir") + "/screenshots/test.png");
	        try {
	            Files.copy(srcFile.toPath(), destFile.toPath());
	            return Files.readAllBytes(destFile.toPath());
	        } catch (IOException e) {
	            e.printStackTrace();
	            return new byte[0];
	        }
	    }



}
