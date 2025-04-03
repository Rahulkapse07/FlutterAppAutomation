package com.test;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.page.Product;

import io.appium.java_client.android.AndroidDriver;

public class ProductTest extends BaseTest  {
	
	@Test
	public void backTOLogin() {
		Product product=new Product(driver);
		product.backToLogin();	
	}

}
