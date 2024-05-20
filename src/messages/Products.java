package messages;

import org.openqa.selenium.WebDriver;

public class Products {
	WebDriver driver;
	public Products(WebDriver driver) {
	this.driver = driver;
	}
	
	public final static String HOME_TITLE_TEXT = "Swag Labs";
	public final static String HOME_SUBTITLE_TEXT = "Products";
	public final static String ADD_TO_CART_TEXT = "Add to cart";
	public final static String REMOVE_BUTTON_TEXT = "Remove";
	
	public final static String BACKPACK_TITLE = "Sauce Labs Backpack";
	public final static String BACKPACK_DESCRIPTION = "carry.allTheThings() with the sleek, "
			+ "streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
	public final static String BACKPACK_PRICE = "$"+"29.99";
	
	public final static String BIKE_LIGHT_TITLE = "Sauce Labs Bike Light";
	public final static String BIKE_LIGHT_DESCRIPTION = "A red light isn't the desired state in testing but it sure"
			+ " helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";
	public final static String BIKE_LIGHT_PRICE = "$"+"9.99";
	
	public final static String BOLT_TSHIRT_TITLE = "Sauce Labs Bolt T-Shirt";
	public final static String BOLT_TSHIRT_DESCRIPTION = "Get your testing superhero on with the Sauce Labs bolt "
			+ "T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.";
	public final static String BOLT_TSHIRT_PRICE = "$"+"15.99";
	
	public final static String JACKET_TITLE = "Sauce Labs Fleece Jacket";
	public final static String JACKET_DESCRIPTION = "It's not every day that you come across a midweight quarter-zip "
			+ "fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.";
	public final static String JACKET_PRICE = "$"+"49.99";
	
	public final static String ONESIE_TITLE = "Sauce Labs Onesie";
	public final static String ONESIE_DESCRIPTION = "Rib snap infant onesie for the junior automation engineer in development. "
			+ "Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.";
	public final static String ONESIE_PRICE = "$"+"7.99";
	
	public final static String RED_TSHIRT_TITLE = "Test.allTheThings() T-Shirt (Red)";
	public final static String RED_TSHIRT_DESCRIPTION = "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your "
			+ "keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.";
	public final static String RED_TSHIRT_PRICE = "$"+"15.99";
	
	
	
}