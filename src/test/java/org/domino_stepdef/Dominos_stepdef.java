package org.domino_stepdef;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.domino_pom.Dominos_pom;
import org.domino_runner.Dominos_runner;
import org.dominos.Dominos.DominosBaseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dominos_stepdef extends DominosBaseclass {
	
	WebDriver driver = Dominos_runner.driver;
	Dominos_pom dm = new Dominos_pom(driver);
	
	@Given("launch the url and maximizing")
	public void launch_the_url_and_maximizing() {
	    url(driver, "https://www.dominos.co.in/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@When("click order online button")
	public void click_order_online_button() {
	    toClick(dm.getOrderbutton());
	}
	@Then("locate the delivery address")
	public void locate_the_delivery_address() {
		toClick(dm.getLocate());
	}
	@Then("enter the pincode")
	public void enter_the_pincode() {
	  toClick(dm.getPincode());
	  toSendValue(dm.getPincode(), "10,neelankarai");
	  toClick(dm.getSuggestion());
	 // TakingScreenshot(driver,"C:\\Users\\manju\\eclipse-workspace\\MavenProject\\screenshot\\dominos.png" );
	   
	}
	@Then("click vegpizza and add required quantity")
	public void click_vegpizza_and_add_required_quantity() {
		toClick(dm.getVegpizza());
		toClick(dm.getMarghetadd());
		toClick(dm.getNothanks());
		toClick(dm.getMarghet2());
		toClick(dm.getGourmet());
		toClick(dm.getPeppypaner());
	}
	@Then("click beverages and add required quantity")
	public void click_beverages_and_add_required_quantity() throws InterruptedException {
		toClick(dm.getBeverages());
		toClick(dm.getPepsi());
		for (int i = 1; i < 12 ; i++) {
			dm.getPepad().click();
			Thread.sleep(3000);
		}
	}
	@Then("removing products")
	public void removing_products() {
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 for (int i = 1; i < 7; i++) {
			 toClick(dm.getRemove());
		}
	}
	@Then("click checkout")
	public void click_checkout()  {
	    driver.findElement(By.xpath("//button[@data-label='miniCartCheckout']")).click();
	    WebElement scroll = driver.findElement(By.xpath("//div[@class='ftr-img']//img[@alt='dominos logo']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView()", scroll);
	}
	
	

	

}
