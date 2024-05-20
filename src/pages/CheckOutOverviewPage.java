package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutOverviewPage {
	WebDriver driver;
	public CheckOutOverviewPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//locators
	
	private By pageTitle = By.xpath("//span[@class=\"title\"]");
	private By productTitle = By.id("item_4_title_link");
	private By productDescription = By.xpath("//a[@id=\"item_4_title_link\"]/following::div[@class=\"inventory_item_desc\"]");
	private By productPrice = By.xpath("//div[@class=\"inventory_item_price\"]");
	private By paymentInfoText = By.xpath("//div[@class=\"summary_info\"]/div[contains(.,\"Payment Information\")]");
	private By paymentInfoContent = By.xpath("//div[@class=\"summary_info\"]/div[contains(.,\"SauceCard #31337\")]");
	private By shippingInfoText = By.xpath("//div[@class=\"summary_info\"]/div[contains(.,\"Shipping Information\")]");
	private By shippingInfoContent = By.xpath("//div[@class=\"summary_info\"]/div[contains(.,\"Free Pony Express Delivery!\")]");
	private By priceTotalText = By.xpath("//div[@class=\"summary_info\"]/div[contains(.,\"Price Total\")]");
	private By priceTotalContent = By.xpath("//div[@class=\"summary_info\"]/div[contains(.,\"Item total: $29.99\")]");
	private By taxContent = By.xpath("//div[@class=\"summary_info\"]/div[contains(.,\"Tax: $2.40\")]");
	private By totalPriceText = By.xpath("//div[@class=\"summary_info\"]/div[contains(.,\"Total: $32.39\")]");
	private By cancelButton = By.id("cancel");
	private By finishButton = By.id("finish");
	
	
	//actions
	
	
	public String getpageTitleText() {
		return driver.findElement(pageTitle).getText();
	}
	public String getproductTitleName() {
		return driver.findElement(productTitle).getText();
	}
	public String getProductDescription() {
		return driver.findElement(productDescription).getText();
	}
	public String getProductPrice() {
		return driver.findElement(productPrice).getText();
	}
	public String getPaymentInfoText() {
		return driver.findElement(paymentInfoText).getText();
	}
	public String getPaymentInfoContent() {
		return driver.findElement(paymentInfoContent).getText();
	}
	public String getShippingInfoText() {
		return driver.findElement(shippingInfoText).getText();
	}
	public String getShippingInfoContent() {
		return driver.findElement(shippingInfoContent).getText();
	}
	public String getPriceTotalText() {
		return driver.findElement(priceTotalText).getText();
	}
	public String getPriceTotalContent() {
		return driver.findElement(priceTotalContent).getText();
	}
	public String getTaxContent() {
		return driver.findElement(taxContent).getText();
	}
	public String getTotalPrice() {
		return driver.findElement(totalPriceText).getText();
	}
	public void clickCancelButton() {
		driver.findElement(cancelButton).click();
	}
	public void clickFinishButton() {
		driver.findElement(finishButton).click();
	}
}
