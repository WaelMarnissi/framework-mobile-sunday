package com.sundayMobile.e2eTests.utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class Hook {

	private static AndroidDriver<WebElement> driver;
	
	@Before()
	public void setUpAppium() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM, "Android");
		cap.setCapability("platformVersion", "8.0.0");
		cap.setCapability("automationName", "UiAutomator2");         
		cap.setCapability("udid", "ce10171a0aa6ce2203");//Give Device ID of your mobile phone
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S7");
		//cap.setCapability(MobileCapabilityType.APP, "D:\\wael.marnissi\\home\\Desktop\\MobileProject\\Appium-Cucumebr-master\\Appium-Cucumber\\src\\test\\ressources\\Applications\\app-demo-release.apk");
		cap.setCapability("appPackage", "love.sunday.sunday"); //love.sunday.sunday
	    cap.setCapability("appActivity",".MainActivity");  
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@After
	public void tearDown()
	{
		
	}
	
	public static AndroidDriver<WebElement> getDriver()
	{
		return driver;
	}
}
