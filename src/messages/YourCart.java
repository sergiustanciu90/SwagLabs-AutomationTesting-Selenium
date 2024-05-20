package messages;

import org.openqa.selenium.WebDriver;

public class YourCart {
	WebDriver driver;
	public YourCart(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public final static String TITLE_TEXT = "Your Cart";
	public final static String SUBTITLE_TEXT = "QTY";
	
}
