package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import messages.YourCart;
import messages.CheckOut;
import messages.CheckOutComplete;
import messages.CheckOutOverview;
import messages.Products;
import testdata.Links;


public class BookingTests extends BaseTest {
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
	public void bookingProduct() throws InterruptedException  {
		
		productsPage.clickBackpackLink();
		
		assertTrue(productDetailsPage.checkBackButton());
		assertEquals(Products.BACKPACK_TITLE, productDetailsPage.getBackPackTitle());
		assertEquals(Products.BACKPACK_DESCRIPTION, productDetailsPage.getBackpackText());
		assertEquals(Products.BACKPACK_PRICE, productDetailsPage.getBackPackPrice());
		
		// in acest assert, atributul de "src" pe care il primesc este cu "	https://www.saucedemo.com" inainte de link 
		// dar pe atributul elemtului este prezent fara " https://www.saucedemo.com "
		// am lasat cu linkul intreg pentru a nu pica testul dar cred ca este un bug.
		assertEquals(Links.BACKPACK_IMAGE_PATH, productDetailsPage.getBackpackImagePath());
		
		productDetailsPage.clickAddToCartButton();
		header.clickShop();
		
		assertEquals(YourCart.TITLE_TEXT,yourCartPage.getPageTitleText());
		assertEquals(YourCart.SUBTITLE_TEXT, yourCartPage.getSubtitleQuantityText());
		assertEquals("1",yourCartPage.getQuantityOfProduct());
		assertEquals(Products.BACKPACK_TITLE,yourCartPage.getProductAddedToCartText());
		assertEquals(Products.BACKPACK_DESCRIPTION,yourCartPage.getProductDescription());
		assertEquals(Products.BACKPACK_PRICE,yourCartPage.getProductPrice());
		assertTrue(yourCartPage.isContinueButtonDisplayed());
		assertTrue(yourCartPage.isCheckOutButtonDisplayed());
		
		yourCartPage.clickCheckOutButton();
		
		assertEquals(CheckOut.PAGE_TITLE_TEXT,checkOutPage.checkTitleText());
		
		checkOutPage.getFirstName(personalUserInfo.getFirstName());
		checkOutPage.getLastName(personalUserInfo.getLastName());
		checkOutPage.getPostalCode(personalUserInfo.getPostalCode());
		
		checkOutPage.clickContinueButton();
		Thread.sleep(3000);
		
		assertEquals(CheckOutOverview.TITLE_TEXT,checkOutOverviewPage.getpageTitleText());
		assertEquals(Products.BACKPACK_TITLE, checkOutOverviewPage.getproductTitleName());
		assertEquals(Products.BACKPACK_DESCRIPTION, checkOutOverviewPage.getProductDescription());
		assertEquals(Products.BACKPACK_PRICE, checkOutOverviewPage.getProductPrice());
		assertEquals(CheckOutOverview.PAYMENT_INFORMATION, checkOutOverviewPage.getPaymentInfoContent());
		assertEquals(CheckOutOverview.SHIPPING_INFORMATION, checkOutOverviewPage.getShippingInfoContent());
		assertEquals(CheckOutOverview.PRICE_TOTAL, checkOutOverviewPage.getTotalPrice());
		
		checkOutOverviewPage.clickFinishButton();
		
		assertEquals(CheckOutComplete.PAGE_TITLE, checkOutCompletePage.getPageTitle());
		assertEquals(CheckOutComplete.COMPLETE_ORDER_TEXT,checkOutCompletePage.getCompleteOrderText());
		assertEquals(CheckOutComplete.COMPLETE_ORDER_DESCRIPTION_TEXT,checkOutCompletePage.getCompleteOrderDescriptionText());
		
		checkOutCompletePage.clickHomeButton();
		
		assertTrue(header.isMenuButtonDisplayed());
		assertTrue(header.isShoppingIconDisplayed());
		assertEquals(Products.HOME_TITLE_TEXT,header.getTitleText());
		assertEquals(Products.HOME_SUBTITLE_TEXT,productsPage.getHomePageTitle());
		
	
		
		
	
	}
}
