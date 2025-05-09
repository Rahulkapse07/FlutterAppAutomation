package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.github.ashwith.flutter.FlutterFinder;

public class Test1 {
	
	 RemoteWebDriver driver;

	    @BeforeMethod
	    public void openApp() throws MalformedURLException {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("deviceName", "emulator-5554");
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("noReset", true);
	        capabilities.setCapability("app", "");
	        capabilities.setCapability("automationName", "Flutter");
	        driver = new AppiumDriver(new URL("http://0.0.0.0:4723"), capabilities);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    }

	    @Test
	    public void appiumFlutterTest() {
	        FlutterFinder finder = new FlutterFinder(driver);
	        WebElement element = finder.byValueKey("increment");
	        element.click();
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}
