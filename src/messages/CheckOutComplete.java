package messages;

import org.openqa.selenium.WebDriver;

public class CheckOutComplete {
	WebDriver driver;
	public CheckOutComplete(WebDriver driver) {
		this.driver = driver;
	}
	public final static String PAGE_TITLE = "Checkout: Complete!";
	public final static String COMPLETE_ORDER_TEXT = "Thank you for your order!";
	public final static String COMPLETE_ORDER_DESCRIPTION_TEXT = "Your order has been "
			+ "dispatched, and will arrive just as fast as the pony can get there!";
	
	
	
	
}
