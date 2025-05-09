package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.SessionId;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class LaunchApp {
	
	private static AppiumDriverLocalService service;
	public  AndroidDriver driver;


	//public static void main(String[] args) throws MalformedURLException, FileNotFoundException {
		
		public void launch() throws MalformedURLException {
//		File logFile = new File("appium_logs.txt");
//
		service = new AppiumServiceBuilder()
		        .withAppiumJS(new File("C:\\Users\\rahul\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
		        .usingAnyFreePort()
		        
		        .build();
		//.withLogFile(logFile)  // ✅ Sirf Appium logs ko file me redirect karega

		service.start();
		
//
//		System.out.println("✅ Appium Server Started. Logs saved in appium_logs.txt");
//
//	        System.out.println("✅ Appium Server Started at: " + service.getUrl());
//		System.out.println("Appium server started at: " + service.getUrl());

		
		 DesiredCapabilities caps = new DesiredCapabilities();
	       // caps.setCapability("platformName", "Android");
	        //caps.setCapability("deviceName", "Pixel_8"); // Change to your device name
	        caps.setCapability("deviceName", "emulator-5554");
	      //  caps.setCapability("automationName", "flutter"); // 👈 Important for Flutter apps
	       // caps.setCapability("app", "D:\\Downloads Data\\General-Store.apk"); // Path to APK file
	        caps.setCapability("app", "C:\\Users\\rahul\\Downloads\\RC Updated.apk");
	       // String apkPath = System.getProperty("user.dir") + "/src/main/resources/General-Store.apk";
	       // System.out.println("APK Path: " + apkPath);
//	        String apkPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "General-Store.apk";
//	        File apkFile = new File(apkPath);
//
//	        if (!apkFile.exists() || !apkFile.canRead()) {
//	            throw new RuntimeException("APK not found or unreadable at: " + apkPath);
//	        }
//
	        //caps.setCapability("app", apkPath);
//	        caps.setCapability("uiautomator2ServerInstallTimeout", 90000);
//	        caps.setCapability("adbExecTimeout", 90000);
//	        caps.setCapability("uiautomator2ServerLaunchTimeout", 90000);


	       // caps.setCapability("app", apkPath);

	        //caps.setCapability("app", System.getProperty("user.dir") + "/src/test/resources/General-Store.apk");

	       // caps.setCapability("appPackage", "com.sec.android.app.camera");
	       // caps.setCapability("appPackage", "com.truvideo.enterprise.rc");
	       // caps.setCapability("appPackage", "com.flipkart.android");	        
	       // caps.setCapability("appActivity", "com.flipkart.android.SplashActivity");
	        caps.setCapability("automationName", "UiAutomator2");
	        caps.setCapability("autoGrantPermissions", true);
	        	      
	        String serverUrl = service.getUrl().toString();
	        System.out.println("Appium server started at: " + serverUrl);
	         driver = new AndroidDriver(new URL(serverUrl), caps);     //this and above two lines are used to start server automatically
	   //      driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);      //uncomment this if you are strtaing server manually

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
	        
	        SessionId sessionId = driver.getSessionId();
	        System.out.println("Session ID: " + sessionId.toString());
	        SessionManager.saveSessionId(sessionId.toString());
	        // driver.quit();
			
			
			//From below code is for use BrowserStack
			
		

//			    public AndroidDriver driver;
//
//			    public void launch() throws MalformedURLException {
//
//			        DesiredCapabilities caps = new DesiredCapabilities();
//			        caps.setCapability("platformName", "Android");
//			        caps.setCapability("deviceName", "Galaxy S21"); // You can change this based on your plan
//			        caps.setCapability("os_version", "12.0"); // Set the OS version you want
//			        caps.setCapability("app", "bs://<your-app-id>"); // Replace with your uploaded app ID from BrowserStack
//			        caps.setCapability("project", "My Project");
//			        caps.setCapability("build", "Build 1.0");
//			        caps.setCapability("name", "General Store App Launch Test");
//			        caps.setCapability("autoGrantPermissions", true);
//
//			        // BrowserStack credentials from environment variables or GitHub Secrets
//			        String username = System.getenv("rajeev_tYycZA");
//			        String accessKey = System.getenv("GmRjLigzgFhpJf8b9m98");
//
//			        String browserStackUrl = "https://" + username + ":" + accessKey + "@hub.browserstack.com/wd/hub";
//
//			        driver = new AndroidDriver(new URL(browserStackUrl), caps);
//
//			        System.out.println("✅ Application launched successfully on BrowserStack");
//			    }
//			

		}
}
