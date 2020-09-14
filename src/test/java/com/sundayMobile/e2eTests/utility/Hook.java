package com.sundayMobile.e2eTests.utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hook {

	private static AndroidDriver<WebElement> driver;

	@Before()
	public void setUpAppium() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM, "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("udid", "A00000K150011406372");// Give Device ID of your mobile phone
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nokia C1");
		cap.setCapability(MobileCapabilityType.APP,
				"D:\\wael.marnissi\\home\\Desktop\\MobileProject\\Appium-Cucumebr-master\\Appium-Cucumber\\src\\test\\ressources\\Applications\\app-demo-release.apk");
		// cap.setCapability("appPackage", "love.sunday.sunday"); //love.sunday.sunday
		//cap.setCapability("appActivity", ".MainActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@After
	public void tearDown() {

	}

	public static AndroidDriver<WebElement> getDriver() {
		return driver;
	}
}
