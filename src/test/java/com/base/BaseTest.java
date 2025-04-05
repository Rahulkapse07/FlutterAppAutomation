package com.base;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

//import com.aventstack.chaintest.plugins.ChainTestListener;
import com.test.LaunchApp;

import io.appium.java_client.android.AndroidDriver;

//@Listeners(ChainTestListener.class)
public class BaseTest {
	
	    public static AndroidDriver driver; // Shared driver

	    @BeforeSuite
	    //@BeforeMethod
	    public void setup() throws MalformedURLException {
	        //if (driver == null) { // Initialize only once
	        	if (driver == null) {
	            LaunchApp app = new LaunchApp();
	            app.launch();
	            driver = app.driver;
	        }
	    }

	    @AfterSuite
	    //@AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}



