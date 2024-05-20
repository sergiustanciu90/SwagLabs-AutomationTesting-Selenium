package messages;

import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	public Login(WebDriver driver){
		this.driver = driver;
	}
		
		public final static String LOGIN_INVALID_MESSAGE = "Epic sadface: Username and password do not match any user in this service";
		public final static String LOGIN_LOCKED_USER_MESSAGE = "Epic sadface: Sorry, this user has been locked out.";
		public final static String LOGIN_TITLE = "Swag Labs";
}