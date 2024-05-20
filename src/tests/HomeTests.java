package tests;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import messages.Login;
import messages.Products;

public class HomeTests extends BaseTest {
	@Before
	public void before() {
		super.before();
		loginPage.enterUsername(standardUser.getUsername());
		loginPage.enterPassword(standardUser.getPassword());
		loginPage.clickLogin();
		
		assertTrue(header.isMenuButtonDisplayed());
		assertTrue(header.isShoppingIconDisplayed());
		assertEquals(Products.HOME_TITLE_TEXT,header.getTitleText());
		assertEquals(Products.HOME_SUBTITLE_TEXT,productsPage.getHomePageTitle());
		
	}
	
	

	@Test
	public void addAndRemoveToCart()  {
		productsPage.clickAddToCartButton();
		
		assertEquals(Products.REMOVE_BUTTON_TEXT,productsPage.getRemoveButtonText());
		assertEquals("1",header.getShopNotification());
		
		productsPage.clickRemoveButton();
		assertEquals(Products.ADD_TO_CART_TEXT,productsPage.getAddToCartButtonText());
		
	}
		
	
	@Test
	public void sortByAtoZ() throws InterruptedException {
		
		Select clasicSelect = new Select(driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]")));
		
		//clasicSelect.selectByVisibleText("Name (A to Z)");
		
		List<WebElement> listOptions = clasicSelect.getOptions();
		for (WebElement el:listOptions) {
			System.out.println(el.getText());
		
		}
		listOptions.get(0).click();
		
		List<WebElement> productNameSort = driver.findElements(By.xpath("//div[@class=\"inventory_item_label\"]/descendant::div[1]"));
		List<String> productTitles = new ArrayList<String>();
		for(WebElement element:productNameSort) {
			productTitles.add(element.getText());
		}
		
		assertEquals(productTitles.get(0),Products.BACKPACK_TITLE);
		assertEquals(productTitles.get(1),Products.BIKE_LIGHT_TITLE);
		assertEquals(productTitles.get(2),Products.BOLT_TSHIRT_TITLE);
		assertEquals(productTitles.get(3),Products.JACKET_TITLE);
		assertEquals(productTitles.get(4),Products.ONESIE_TITLE);
		assertEquals(productTitles.get(5),Products.RED_TSHIRT_TITLE);
		
		System.out.println(productTitles);
		
		
	}
	
	@Test
	public void sortByZtoA() {
		Select clasicSelect = new Select(driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]")));
		
		List<WebElement> listOptions = clasicSelect.getOptions();
		for (WebElement el:listOptions) {
			System.out.println(el.getText());
		}
			listOptions.get(1).click();
		
			List<WebElement> productNameSort = driver.findElements(By.xpath("//div[@class=\"inventory_item_label\"]/descendant::div[1]"));
			List<String> productTitles = new ArrayList<String>();
			for(WebElement element:productNameSort) {
				productTitles.add(element.getText());
			}
			assertEquals(productTitles.get(0),Products.RED_TSHIRT_TITLE);
			assertEquals(productTitles.get(1),Products.ONESIE_TITLE);
			assertEquals(productTitles.get(2),Products.JACKET_TITLE);
			assertEquals(productTitles.get(3),Products.BOLT_TSHIRT_TITLE);
			assertEquals(productTitles.get(4),Products.BIKE_LIGHT_TITLE);
			assertEquals(productTitles.get(5),Products.BACKPACK_TITLE);
	}
	@Test
	public void sortLowToHighPrices() {
		Select clasicSelect = new Select(driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]")));
		
		List<WebElement> listOptions = clasicSelect.getOptions();
		for (WebElement el:listOptions) {
			System.out.println(el.getText());
		}
			listOptions.get(2).click();
		
			List<WebElement> productsPrice = driver.findElements(By.xpath("//div[@class=\"inventory_item_price\"]"));
			List<String> productSortPrices = new ArrayList<String>();
			for(WebElement element:productsPrice) {
				productSortPrices.add(element.getText());	
			}
			System.out.println(productSortPrices);
			
			
			assertEquals(productSortPrices.get(0),Products.ONESIE_PRICE);
			assertEquals(productSortPrices.get(1),Products.BIKE_LIGHT_PRICE);
			assertEquals(productSortPrices.get(2),Products.BOLT_TSHIRT_PRICE);
			assertEquals(productSortPrices.get(3),Products.RED_TSHIRT_PRICE);
			assertEquals(productSortPrices.get(4),Products.BACKPACK_PRICE);
			assertEquals(productSortPrices.get(5),Products.JACKET_PRICE);
			
	
	}
	
	@Test
	public void sortHighToLowPrices() {
Select clasicSelect = new Select(driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]")));
		
		List<WebElement> listOptions = clasicSelect.getOptions();
		for (WebElement el:listOptions) {
			System.out.println(el.getText());
		}
			listOptions.get(3).click();
		
			List<WebElement> productsPrice = driver.findElements(By.xpath("//div[@class=\"inventory_item_price\"]"));
			List<String> productSortPrices = new ArrayList<String>();
			for(WebElement element:productsPrice) {
				productSortPrices.add(element.getText());	
			}
			System.out.println(productSortPrices);
			
			
			assertEquals(productSortPrices.get(0),Products.JACKET_PRICE);
			assertEquals(productSortPrices.get(1),Products.BACKPACK_PRICE);
			assertEquals(productSortPrices.get(2),Products.BOLT_TSHIRT_PRICE);
			assertEquals(productSortPrices.get(3),Products.RED_TSHIRT_PRICE);
			assertEquals(productSortPrices.get(4),Products.BIKE_LIGHT_PRICE);
			assertEquals(productSortPrices.get(5),Products.ONESIE_PRICE);
			
	}
	
	@Test
	public void loggingOut() throws InterruptedException {
		
		header.clickMenu();
		header.clickLogout();
		
		assertTrue(loginPage.isLoginButtonDisplayed());
		assertEquals(Login.LOGIN_TITLE,loginPage.getLoginTitle());
		Thread.sleep(3000);
		
	
	}

}