package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.test.LaunchApp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Product extends LaunchApp{
	
	public Product(AndroidDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.ImageButton")
	private WebElement back;
	
	public void backToLogin() {
		back.click();
		System.out.println("navigated to login again");
	}
	
	

}
