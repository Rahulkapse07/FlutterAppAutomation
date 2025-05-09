package com.test;

import java.lang.reflect.Field;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import io.appium.java_client.AppiumDriver;

public class ReuseSessionTest {

	 public static AppiumDriver attachToSession(String sessionIdStr, URL serverURL) {
	        try {
	            HttpCommandExecutor executor = new HttpCommandExecutor(serverURL);
	            AppiumDriver driver = new AppiumDriver(executor, new org.openqa.selenium.remote.DesiredCapabilities());

	            Field sessionIdField = RemoteWebDriver.class.getDeclaredField("sessionId");
	            sessionIdField.setAccessible(true);
	            sessionIdField.set(driver, new SessionId(sessionIdStr));

	            System.out.println("Attached to session: " + sessionIdStr);
	            return driver;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }

	    public static void main(String[] args) throws Exception {
	        String sessionId = SessionManager.getSessionId();
	        URL serverUrl = new URL("http://127.0.0.1:4723");

	        AppiumDriver driver = attachToSession(sessionId, serverUrl);

	        if (driver != null) {
	            // Continue your test without login
	            driver.findElement(By.id("com.example:id/list_button")).click();
	        } else {
	            System.out.println("Could not attach to session.");
	        }
	    }
}
