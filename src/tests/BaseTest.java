package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import components.Header;
import messages.YourCart;
import messages.Products;
import messages.CheckOutComplete;
import messages.CheckOutOverview;
import messages.Login;
import pages.YourCartPage;
import pages.CheckOutCompletePage;
import pages.CheckOutOverviewPage;
import pages.CheckOutPage;
import pages.ProductsPage;
import pages.LoginPage;
import pages.ProductDetailsPage;
import testdata.Personal;
import testdata.URL;
import testdata.User;


public class BaseTest {
	static WebDriver driver;
	
	public static Header header;
	public static LoginPage loginPage;
	
	public static Login login;
	public static Products products;
	public static ProductsPage productsPage;
	public static ProductDetailsPage productDetailsPage;
	public static CheckOutOverview checkOutOverview;
	public static CheckOutComplete checkOutComplete;
	public static YourCart yourCart;
	public static YourCartPage yourCartPage;
	public static CheckOutPage checkOutPage;
	public static CheckOutOverviewPage checkOutOverviewPage;
	public static CheckOutCompletePage checkOutCompletePage;
	
	
	public static User standardUser = new User("standardUser");
	public static User wrongUser = new User("wrongUser");
	public static User lockedOutUser = new User("lockedOutUser");
	public static User problemUser = new User("problemUser");
	public static User performanceGlitchUser = new User("performanceGlitchUser");

	public static Personal personalUserInfo = new Personal("personalUserInfo");
	
	
	
	@BeforeClass
	public static void setUp() {
	}
	@AfterClass
	public static void tearDown() {
	}
	
	@Before
	public void before() {
	
		
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		loginPage = new LoginPage(driver);
		login = new Login (driver);
		header = new Header(driver);
		products = new Products(driver);
		productsPage = new ProductsPage(driver);
		productDetailsPage = new ProductDetailsPage(driver);
		yourCart = new YourCart(driver);
		yourCartPage = new YourCartPage(driver);
		checkOutPage = new CheckOutPage(driver);
		checkOutOverview = new CheckOutOverview(driver);
		checkOutOverviewPage = new CheckOutOverviewPage(driver);
		checkOutComplete = new CheckOutComplete(driver);
		checkOutCompletePage = new CheckOutCompletePage(driver);
		
		
		
		driver.navigate().to(URL.LOGIN_PAGE);
		assertTrue(loginPage.isLoginButtonDisplayed());
		assertEquals(Login.LOGIN_TITLE,loginPage.getLoginTitle());
		
		
	}
	@After
	public void after() {
		driver.close();
		
	}
	
	
}
