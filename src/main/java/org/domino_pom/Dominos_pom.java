package org.domino_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dominos_pom {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//button[normalize-space()='ORDER ONLINE NOW']")
	private WebElement orderbutton;
	@FindBy(xpath="//input[@placeholder='Enter your delivery address']")
	private WebElement locate;
	@FindBy(xpath="//input[@placeholder='Enter Area / Locality']")
	private WebElement enteraddress;
	@FindBy(xpath="//input[@placeholder='Enter Area / Locality']")
	private WebElement pincode;
	@FindBy(xpath="//span[@class='lst-desc-main ellipsis']")
	private WebElement suggestion;
	@FindBy(xpath="//span[normalize-space()='VEG PIZZA']")
	private WebElement vegpizza;
	@FindBy(xpath="//div[@data-label='Veg Pizza']//div[@data-label='Margherita']//span[contains(text(),'ADD TO CART')]")
	private WebElement marghetadd;
	@FindBy(xpath="//span[normalize-space()='NO THANKS']")
	private WebElement nothanks;
	@FindBy(xpath="//div[@class='crt-cnt-qty-prc']//div//div[@data-label='quantity']//div//div[@data-label='increase']")
	private WebElement marghet2;
	@FindBy(xpath="//div[@data-label='Veg Pizza']//div[@data-label='Primavera Gourmet-Pizza']//span[contains(text(),'ADD TO CART')]")
	private WebElement gourmet;
	@FindBy(xpath="(//div[@class='injectStyles-sc-1jy9bcf-0 gwKvJy'])[1]")
	private WebElement gourmet2;
	@FindBy(xpath="//div[@data-label='Veg Pizza']//div[@data-label='Peppy Paneer']//span[contains(text(),'ADD TO CART')]")
    private WebElement peppypaner;
	@FindBy(xpath="(//div[@class='injectStyles-sc-1jy9bcf-0 gwKvJy'])[2]")
	private WebElement paneer2;
	@FindBy(xpath="//div[contains(text(),'BEVERAGES')]")
	private WebElement beverages;
	@FindBy(xpath="//div[@data-label='Pepsi 475ml']//span[contains(text(),'ADD TO CART')]")
	private WebElement pepsi;
	@FindBy(xpath="(//div[@class='injectStyles-sc-1jy9bcf-0 gwKvJy'])[9]")
	private WebElement pepad;
	@FindBy(xpath="//div[@data-label='Pepsi 475ml']//div[@data-label='decrease']")
	private WebElement remove;
	@FindBy(xpath="//div[@class='ftr-img']//img[@alt='dominos logo']")
	private WebElement scroll;
	
	
	public WebElement getScroll() {
		return scroll;
	}
	public WebElement getRemove() {
		return remove;
	}
	public WebElement getBeverages() {
		return beverages;
	}
	public WebElement getPepsi() {
		return pepsi;
	}
	public WebElement getPepad() {
		return pepad;
	}
	public WebElement getPeppypaner() {
		return peppypaner;
	}
	public WebElement getPaneer2() {
		return paneer2;
	}
	public WebElement getGourmet() {
		return gourmet;
	}
	public WebElement getGourmet2() {
		return gourmet2;
	}
	public WebElement getMarghetadd() {
		return marghetadd;
	}
	public WebElement getNothanks() {
		return nothanks;
	}
	public WebElement getMarghet2() {
		return marghet2;
	}
	public WebElement getVegpizza() {
		return vegpizza;
	}
	public WebElement getSuggestion() {
		return suggestion;
	}
	public WebElement getPincode() {
		return pincode;
	}
	public WebElement getEnteraddress() {
		return enteraddress;
	}
	public WebElement getLocate() {
		return locate;
	}
	public WebElement getOrderbutton() {
		return orderbutton;
	}
	
	public Dominos_pom(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver, this);

	}
	
}