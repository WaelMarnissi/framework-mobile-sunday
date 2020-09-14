package com.sundayMobile.e2eTests;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src/test/features"}
					//,glue={"stepdefinations"}
					,plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/SundayReport.html"},
					snippets = SnippetType.CAMELCASE,
					tags ={"@Creation-compte"}
                   // tags ={"@Creation-compte,@,@"}  Run multiple feature
                   //tags ={""} Runn all feature
		)
@Test
public class RunTest extends AbstractTestNGCucumberTests {
	
	@AfterClass
	public static void writeExtentReport() {

		Reporter.loadXMLConfig(new File("src/test/ressources/Configs/extent-config.xml"));
	}

}
