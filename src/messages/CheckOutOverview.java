package messages;

import org.openqa.selenium.WebDriver;

public class CheckOutOverview {
	WebDriver driver;
	public CheckOutOverview(WebDriver driver){
		this.driver = driver;
	}
	public final static String TITLE_TEXT = "Checkout: Overview";
	public final static String PAYMENT_INFORMATION = "SauceCard #31337";
	public final static String SHIPPING_INFORMATION = "Free Pony Express Delivery!";
	public final static String PRICE_TOTAL = "Total: $" + "32.39";

	
	
}
