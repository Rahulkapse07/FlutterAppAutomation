package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.test.LaunchApp;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.github.ashwith.flutter.FlutterFinder;


public class Login extends LaunchApp {
	//AndroidDriver driver;

	FlutterFinder finder = new FlutterFinder(driver);

	
	public Login(AndroidDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter name here']")
	private WebElement firstName;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Let's  Shop\"]")
	private WebElement button;
	
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
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='_id']")
	private WebElement searchbar;
	
	@AndroidFindBy(accessibility = "RahulTest Kapse")
	private WebElement userSelected;
	
	@AndroidFindBy(accessibility = "NO")
	private WebElement no;
	
	@AndroidFindBy(accessibility = "profile")
	private WebElement profile;
	
	
	//WebElement ele1=driver.findElement(finder.byValueKey("element"));
	WebElement ele1=finder.byValueKey("element");
	
	
	public void test() throws InterruptedException {
		//WebElement ele1= driver.findElement(finder.byValueKey("element"));
		//driver.findElement(By.xpath(""));
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
	
	public void testRC() throws InterruptedException {
		//WebElement ele1= driver.findElement(finder.byValueKey("element"));
		//driver.findElement(By.xpath(""));
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
		Thread.sleep(15000);
		driver.currentActivity();
		 SessionId sessionId1 = driver.getSessionId();
	        System.out.println("Session ID on user page: " + driver.currentActivity());
	        System.out.println(driver.getCurrentPackage());
		searchbar.click();
		searchbar.sendKeys("RahulTest Kapse");
		Thread.sleep(5000);
		userSelected.click();
		Thread.sleep(5000);
		one.click();
		two.click();
		three.click();
		four.click();
		five.click();
		six.click();
		Thread.sleep(5000);
		no.click();
		Thread.sleep(15000);
		System.out.println("inside truvideo app on list page");
		 SessionId sessionId2 = driver.getSessionId();
	        System.out.println("Session ID on RO List page: " + driver.currentActivity());
	        System.out.println(driver.getCurrentPackage());
		profile.click();
		Thread.sleep(5000);
		String sessionId3 = ((RemoteWebDriver) driver).getSessionId().toString();
		System.out.println("Appium Session ID: " + sessionId3);

		
	}

}
