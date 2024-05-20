package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	WebDriver driver;
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}
	

	//locators
	private By pageTitle = By.xpath("//span[contains(.,\"Products\")]");
	private By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
	private By removeButton = By.id("remove-sauce-labs-backpack");
	private By filtrerButton = By.xpath("//select[@class=\"product_sort_container\"]");
	
	private By boltTshirtLink = By.id("item_1_title_link");
	private By onesieLink = By.id("item_2_title_link");
	private By redTshirtLink = By.id("item_3_title_link");	
	private By backpackLink = By.id("item_4_title_link");
	private By backpackDescription = By.xpath("//div[@id=\"inventory_item_container\"]/descendant::div[@class=\"inventory_details_desc large_size\"]");
	private By fleeceJacketLink = By.id("item_5_title_link");
	
	
	
	//actions
	public String getHomePageTitle() {
		return driver.findElement(pageTitle).getText();
	}
	public void clickAddToCartButton() {
		driver.findElement(addToCartButton).click();
	}
	public String getAddToCartButtonText() {
		return driver.findElement(addToCartButton).getText();
	}
	public void clickRemoveButton() {
		driver.findElement(removeButton).click();
	}
	public String getRemoveButtonText() {
		return driver.findElement(removeButton).getText();
	}
	public boolean isFiltrerButtonDisplayed() {
		return driver.findElement(filtrerButton).isDisplayed();
	}
	
	
	
	public void clickBoltTshirtLink() {
		driver.findElement(boltTshirtLink).click();
	}

	public void clickOnesieLink() {
		driver.findElement(onesieLink).click();
	}

	public void clickRedThsirtLink() {
		driver.findElement(redTshirtLink).click();
	}

	
	public void clickBackpackLink() {
		driver.findElement(backpackLink).click();
	}
	public String getBackpackText() {
		return driver.findElement(backpackDescription).getText();
	}
	
	
	public void clickFleeceJacketLink() {
		driver.findElement(fleeceJacketLink).click();
	}

	
}

