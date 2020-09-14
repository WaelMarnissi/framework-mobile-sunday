package com.sundayMobile.e2eTests.utility;

import net.codestory.simplelenium.SectionObject;
import org.openqa.selenium.WebDriver;


public abstract class AbstractPage implements SectionObject{
	
	public static WebDriver driver;
	public static boolean bResult;

	public  AbstractPage(WebDriver driver){
		AbstractPage.driver = driver;
		AbstractPage.bResult = true; 
	}
}
	
