package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {
	WebDriver driver;
	public Header(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locators
	private By menuButton = By.id("react-burger-menu-btn");
	private By title = By.xpath("//div[@id=\"shopping_cart_container\"]/preceding-sibling::div[@class=\"header_label\"]/div");
	private By shoppingIcon = By.id("shopping_cart_container");
	private By shopNotification = By.xpath("//a[contains(.,\"1\")]");
	private By logOutButton = By.id("logout_sidebar_link");
	
	//Actions
	public boolean isMenuButtonDisplayed() {
		return driver.findElement(menuButton).isDisplayed();
	}
	public String getTitleText() {
		return driver.findElement(title).getText();
	}
	public boolean isShoppingIconDisplayed() {
		return driver.findElement(shoppingIcon).isDisplayed();
	}
	public String getShopNotification() {
		return driver.findElement(shoppingIcon).getText();
	}
	public boolean isShopNotificationEnabled() {
		return driver.findElement(shopNotification).isDisplayed();
	}
	public void clickShop() {
		driver.findElement(shoppingIcon).click();
	}
	public void clickMenu() {
		driver.findElement(menuButton).click();
	}
	public void clickLogout() {
		driver.findElement(logOutButton).click();
	}
	
	}
	
	
	
	
	
	
	

