package com.sundayMobile.e2eTests.createAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sundayMobile.e2eTests.utility.Hook;

import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;

public class CreateAccount {
	
	private AndroidDriver<WebElement> driver;

	public CreateAccount() {
		this.driver = Hook.getDriver();
	}
	
	@When("^cliquer sur Se connecter$")
	public void cliquerSurSeConnecter() throws Throwable {
		driver.findElement(By.xpath("//*[@text='Se connecter']")).click();
	}

	@When("^cliquer sur S'inscrire$")
	public void cliquerSurSInscrire() throws Throwable {
		driver.findElement(By.xpath("//*[contains(@text, \"S'inscrire\")]")).click();
	}

	@When("^saisir le Nom$")
	public void saisirLeNom() throws Throwable {
	   
	}

	@When("^cliquer sur fleche suivant$")
	public void cliquerSurFlecheSuivant() throws Throwable {
	   
	}

	@When("^Cliquer sur Passer$")
	public void cliquerSurPasser() throws Throwable {
	    
	}

	@When("^saisir l'eamil$")
	public void saisirLEamil() throws Throwable {
	    
	}

	@When("^saisir le mot de passe$")
	public void saisirLeMotDePasse() throws Throwable {
	   
	}

	@When("^Accepter les CGU$")
	public void accepterLesCGU() throws Throwable {
	  
	}

}
