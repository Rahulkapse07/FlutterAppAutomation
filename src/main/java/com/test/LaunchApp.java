package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class LaunchApp {
	
	private static AppiumDriverLocalService service;
	public  AndroidDriver driver;

	//public static void main(String[] args) throws MalformedURLException, FileNotFoundException {
		
		public void launch() throws MalformedURLException {
		File logFile = new File("appium_logs.txt");

		service = new AppiumServiceBuilder()
		        .withAppiumJS(new File("C:\\Users\\rahul\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
		        .usingAnyFreePort()
		        
		        .build();
		//.withLogFile(logFile)  // ✅ Sirf Appium logs ko file me redirect karega

		service.start();

		System.out.println("✅ Appium Server Started. Logs saved in appium_logs.txt");

	        System.out.println("✅ Appium Server Started at: " + service.getUrl());
		System.out.println("Appium server started at: " + service.getUrl());

		
		 DesiredCapabilities caps = new DesiredCapabilities();
	       // caps.setCapability("platformName", "Android");
	        caps.setCapability("deviceName", "Pixel_8"); // Change to your device name
	       // caps.setCapability("app", "D:\\Downloads Data\\General-Store.apk"); // Path to APK file
	        caps.setCapability("app", "C:\\Users\\rahul\\Downloads\\General-Store.apk");
	       // caps.setCapability("appPackage", "com.sec.android.app.camera");
	       // caps.setCapability("appPackage", "com.truvideo.enterprise.rc");
	       // caps.setCapability("appPackage", "com.flipkart.android");	        
	       // caps.setCapability("appActivity", "com.flipkart.android.SplashActivity");
	        caps.setCapability("automationName", "UiAutomator2");
	        caps.setCapability("autoGrantPermissions", true);
	        	      
	        String serverUrl = service.getUrl().toString();
	        System.out.println("Appium server started at: " + serverUrl);
	         driver = new AndroidDriver(new URL(serverUrl), caps);

//	        try {
//	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//	            wait.until(ExpectedConditions.alertIsPresent());
//	            driver.switchTo().alert().accept();
//	        } catch (Exception e) {
//	            System.out.println("No alert found!");
//	        }
	        //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]")).click();
	        System.out.println("Selected location");
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("Application launched");
	        // driver.quit();

	}

}
