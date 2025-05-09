package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.PageFactory;

import com.test.LaunchApp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DealerCode extends LaunchApp {
	
	public  DealerCode(AndroidDriver driver) {
		super();
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "2")
	private WebElement two;
	
	@AndroidFindBy(accessibility = "0")
	private WebElement zero;
	
	@AndroidFindBy(accessibility = "3")
	private WebElement three;
	
	@AndroidFindBy(accessibility = "1")
	private WebElement one;
	
	@AndroidFindBy(accessibility = "5")
	private WebElement five;
	
	@AndroidFindBy(accessibility = "6")
	private WebElement six;
	
	@AndroidFindBy(accessibility = "4")
	private WebElement four;
	
	public void enterDealercode() throws InterruptedException {
		Thread.sleep(8000);
		System.out.println("inside truvideo app");
		Thread.sleep(8000);
		 SessionId sessionId = driver.getSessionId();
	        System.out.println("Session ID on dealer code page: " + driver.currentActivity());
	        System.out.println(driver.getCurrentPackage());
		two.click();
		System.out.println("clicked");
		two.click();
		System.out.println("clicked");
		zero.click();
		three.click();
		one.click();
		zero.click();
		System.out.println("entered dealer code");
	}
	
	

}
