package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {

	public HomePageObject() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()= 'Currency']")
	private WebElement currency;
	@FindBy(xpath = "//button[@name= 'EUR']")
	private WebElement currancyEru;
	@FindBy(xpath = "//button[@name= 'GBP']")
	private WebElement currancyPound;
	@FindBy(xpath = "//button[contains(text(), '$ US Dollar') ]")
	private WebElement currancyDollar;
	@FindBy(xpath = "//span[text()= 'My Account' ]")
	private WebElement myAccount;
	@FindBy(xpath = "//a[text()= 'Register']")
	private WebElement register;
	@FindBy(xpath = "//a[text()= 'Login']")
	private WebElement login;
	@FindBy(xpath = "//span[text()= 'Wish List (0)']")
	private WebElement wishList;
	@FindBy(xpath = "//span[text()= 'Shopping Cart']")
	private WebElement shoppingCart;
	@FindBy(xpath = "//span[contains(text(),'Checkout')]")
	private WebElement checkout;
	@FindBy(xpath ="//input[@name = 'search']")
	private WebElement seaarch;
	@FindBy(xpath = "(//button[@type= 'button'])[4]")
	private WebElement searchButton;
	@FindBy(id = "cart-total")
	private WebElement shopingCartItem;
	@FindBy(xpath = "//a[text() = 'TEST ENVIRONMENT']")
	private WebElement testEnvironment;
	@FindBy(xpath = "//a[text() = 'Desktops']")
	private WebElement desktops;
	@FindBy(xpath = "//a[text() = 'Show All Desktops']")
	private WebElement showAllDesctop;
	@FindBy(xpath= "//a[text() = 'Laptops & Notebooks']")
	private WebElement laptopsAndNotebooks;
	@FindBy(xpath = "//a[text() = 'Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;
	@FindBy(xpath ="//a[text() = 'Components']")
	private WebElement componenets;
	@FindBy(xpath = "//a[text() = 'Show All Components']")
	private WebElement showAllComponents;
	@FindBy(xpath = "//a[text() = 'Tablets']")
	private WebElement tablets;
	@FindBy(xpath = "(//a[text() = 'Software'])[1]")
	private WebElement software;
	@FindBy(xpath = "(//a[text() = 'Phones & PDAs'])[1]")
	private WebElement phoneAndPDAs;
	@FindBy(xpath = "//a[text() = 'Cameras']")
	private WebElement cameras;
	@FindBy(xpath = "//a[text() = 'Show All Cameras']")
	private WebElement showAllCameras;
	@FindBy(xpath = "//a[text() = 'MP3 Players']")
	private WebElement mp3Players;
	@FindBy(xpath = "//a[text() = 'Show All MP3 Players']")
	private WebElement showAllMp3Players;
	@FindBy(xpath = "(//img[@alt= 'iPhone 6'])[2]")
	private WebElement iphoneSlide;
	@FindBy(xpath = "(//img[@alt = 'MacBookAir'])[2]")
	private WebElement macBookAirSlide;
	@FindBy(xpath = "")
	
	
	
	
	
	
	
	
	
	
	
	

}
