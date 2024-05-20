package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locator
	private By acceptedUsernames = By.id("login_credentials");
	private By usernameInput = By.id("user-name");
	private By passwordInput = By.id("password");
	private By loginButton = By.id("login-button");
	private By loginTitle = By.xpath("//div[@class=\"login_logo\"]");
	private By errorMessage = By.xpath("//div[@class=\"error-message-container error\"]");
	//action
	public String getAcceptedUsernames() {
		return driver.findElement(acceptedUsernames).getText();
	}
	
	public void enterUsername(String name) {
		driver.findElement(usernameInput).sendKeys(name);
	}
	public void enterPassword(String password) {
		driver.findElement(passwordInput).sendKeys(password);
	}
	
	public boolean isLoginButtonDisplayed() {
		return driver.findElement(loginButton).isDisplayed();
	}
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	public String getLoginTitle () {
		return driver.findElement(loginTitle).getText();	
	}
	public String getErrorText() {
		return driver.findElement(errorMessage).getText();
	}
	
}
