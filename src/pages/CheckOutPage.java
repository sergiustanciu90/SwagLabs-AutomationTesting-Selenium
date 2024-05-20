package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	WebDriver driver;
	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locators
	private By pageTitle = By.xpath("//span[@class=\"title\"]");
	private By firstNameInput = By.id("first-name");
	private By lastNameInput = By.id("last-name");
	private By postalCodeInput = By.id("postal-code");
	private By continueButton = By.id("continue");
	private By cancelButton = By.id("cancel");
	
	//actions
	public void getFirstName(String firstname) {
		 driver.findElement(firstNameInput).sendKeys(firstname);
	}
	public void getLastName (String lastname) {
		driver.findElement(lastNameInput).sendKeys(lastname);
	}
	public void getPostalCode (String postalcode) {
		driver.findElement(postalCodeInput).sendKeys(postalcode);
	}
	public String checkTitleText() {
		return driver.findElement(pageTitle).getText();
	}
	public void clickContinueButton() {
		driver.findElement(continueButton).click();
	}
	public void clickCancelButton() {
		driver.findElement(cancelButton).click();
	}
	
	
	
}
