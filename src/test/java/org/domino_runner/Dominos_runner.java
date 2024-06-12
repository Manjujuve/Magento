package org.domino_runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Dominos_feature\\dominos.feature", glue ="org.domino_stepdef")

public class Dominos_runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void start() {
		driver= new ChromeDriver();

	}

}
