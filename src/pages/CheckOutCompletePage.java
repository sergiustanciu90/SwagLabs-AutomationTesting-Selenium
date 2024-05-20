package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutCompletePage {
	WebDriver driver;
	public CheckOutCompletePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//locators
	private By pageTitle = By.xpath("//span[@class=\"title\"]");
	private By completeOrderText = By.xpath("//h2[@class=\"complete-header\"]");
	private By completeOrderDescriptionText = By.xpath("//div[@class=\"complete-text\"]");
	private By backHomeButton = By.id("back-to-products");
	
	
	
	
	
	//actions
	public String getPageTitle() {
		return driver.findElement(pageTitle).getText();
	}
	public String getCompleteOrderText() {
		return driver.findElement(completeOrderText).getText();
	}
	public String getCompleteOrderDescriptionText() {
		return driver.findElement(completeOrderDescriptionText).getText();
	}
	public void clickHomeButton() {
		driver.findElement(backHomeButton).click();
	}
	
	
}
