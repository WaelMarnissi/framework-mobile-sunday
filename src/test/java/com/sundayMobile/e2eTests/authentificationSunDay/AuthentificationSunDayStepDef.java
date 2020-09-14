package com.sundayMobile.e2eTests.authentificationSunDay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sundayMobile.e2eTests.utility.Hook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AuthentificationSunDayStepDef {
	
	private AndroidDriver<WebElement> driver;
	//private WebDriver driver;

	public AuthentificationSunDayStepDef() {
		this.driver = Hook.getDriver();
	}

	@Given("^Ouvrir l application SunDay$")
	public void ouvrirLApplicationSunDay() throws Throwable {
		
	}

	@When("^cliquer sur Vous avez deja un compte$")
	public void cliquerSurVousAvezDejaUnCompte() throws Throwable {
		driver.findElement(By.xpath("//*[@text='Vous avez déjà un compte ?']")).click();	
		
	}

	@When("^saisir adresse mail$")
	public void saisirAdresseMail() throws Throwable {
		//driver.findElement(By.xpath("android.widget.EditText")).click();
		driver.findElement(By.xpath("//*[@text='john.doe@sunday.com']")).sendKeys("wael13.seloger@hotmail.com");
	}

	@When("^saisir mot de passe$")
	public void saisirMotDePasse() throws Throwable {
		driver.findElement(By.xpath("//*[@text='******']")).sendKeys("12345a");
	}

	@When("^cliquer sur Connexion$")
	public void cliquerSurConnexion() throws Throwable {
		driver.findElement(By.xpath("//*[@text='Connexion']")).click();
	}

	@Then("^page Mes familles s affiche$")
	public void pageMesFamillesSAffiche() throws Throwable {

	}
	//@When("^Mot de passe oublié $")
	//public void Clik() throws Throwable {
		
		//driver.findElement(By.xpath("//*[@text='Vous avez oublié votre mot de passe ?']")).click();
	}

