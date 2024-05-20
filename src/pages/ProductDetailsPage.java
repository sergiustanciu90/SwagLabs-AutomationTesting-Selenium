package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {
	WebDriver driver;
	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
}
	
	//locators
	private By backToProductsButton = By.id("back-to-products");
	private By backPackTitle = By.xpath("//div[@id=\"inventory_item_container\"]/"
			+ "descendant::div[@class=\"inventory_details_name large_size\"]");
	private By backpackDescription = By.xpath("//div[@id=\"inventory_item_container\"]"
			+ "/descendant::div[@class=\"inventory_details_desc large_size\"]");
	private By backPackPrice = By.xpath("//div[@id=\"inventory_item_container\"]/descendant:"
			+ ":div[@class=\"inventory_details_price\"]");
	private By addToCartButton = By.id("add-to-cart");
	private By backpackImage = By.xpath("//img[@alt=\"Sauce Labs Backpack\"]");
	
	
	
	//actions
	public boolean checkBackButton() {
		return driver.findElement(backToProductsButton).isDisplayed();
	}
	public String getBackpackText() {
		return driver.findElement(backpackDescription).getText();
	}
	public String getBackPackTitle() {
		return driver.findElement(backPackTitle).getText();
	}
	public String getBackPackPrice() {
		return driver.findElement(backPackPrice).getText();
	}
	public void clickAddToCartButton() {
		driver.findElement(addToCartButton).click();
	}
	public String getBackpackImagePath() {
		return driver.findElement(backpackImage).getAttribute("src");
	}
	
	
	
}