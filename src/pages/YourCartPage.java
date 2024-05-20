package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage {
	WebDriver driver;
	public YourCartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locators
	private By pageTitle = By.xpath("//span[@class=\"title\"]");
	private By subtitleQuantity = By.xpath("//div[@class=\"cart_quantity_label\"]");
	private By subtitleDescription = By.xpath("//div[@class=\"cart_desc_label\"]");
	private By quantityOfProduct = By.xpath("//div[@class=\"cart_quantity\"]");
	private By productAddedToCart = By.id("item_4_title_link");
	private By productDescription = By.xpath("//a[@id=\"item_4_title_link\"]/following::div[@class=\"inventory_item_desc\"]");
	private By productPrice = By.xpath("//div[@class=\"inventory_item_price\"]");
	private By continueShopingButton = By.id("continue-shopping");
	private By checkoutButton = By.id("checkout");
	
	//actions
	
	public String getPageTitleText() {
		return driver.findElement(pageTitle).getText();
	}
	public String getSubtitleQuantityText() {
		return driver.findElement(subtitleQuantity).getText();
	}
	public String getSubtitleDescriptionText() {
		return driver.findElement(subtitleDescription).getText();
	}
	public String getQuantityOfProduct() {
		return driver.findElement(quantityOfProduct).getText();
	}
	public String getProductAddedToCartText() {
		return driver.findElement(productAddedToCart).getText();
	}
	public String getProductDescription() {
		return driver.findElement(productDescription).getText();
	}
	public String getProductPrice() {
		return driver.findElement(productPrice).getText();
	}
	public boolean isContinueButtonDisplayed() {
		return driver.findElement(continueShopingButton).isDisplayed();
	}
	public void clickContinueShopping() {
		driver.findElement(continueShopingButton).click();
	}
	public boolean isCheckOutButtonDisplayed() {
		return driver.findElement(checkoutButton).isDisplayed();
	}
	public void clickCheckOutButton() {
		driver.findElement(checkoutButton).click();
	}
	
	
	
	
	
}
