package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.test.LaunchApp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login extends LaunchApp {
	//AndroidDriver driver;

	public Login(AndroidDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter name here']")
	private WebElement firstName;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Let's  Shop\"]")
	private WebElement button;
	
	public void test() throws InterruptedException {
		firstName.click();
		System.out.println("clicked");
		firstName.sendKeys("Rahul");
		System.out.println("entered first name");
		driver.navigate().back();
		Thread.sleep(2000);
		button.click();
		System.out.println("clicked button");
		//Assert.assertTrue(false);
	}

}
