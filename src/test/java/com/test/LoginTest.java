package com.test;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.page.Login;

import io.appium.java_client.android.AndroidDriver;

public class LoginTest extends BaseTest {
  //AndroidDriver driver;
	
//	@BeforeMethod
//	public void setup() throws MalformedURLException {
//		LaunchApp app=new LaunchApp();
//		app.launch();
//		driver = app.driver;
//	}
//	
//	//@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
	
	@Test
	public void verifyTest1() throws InterruptedException, MalformedURLException {
		Login login=new Login(driver);
		login.test();
		//Assert.assertTrue(true);
	}

}
