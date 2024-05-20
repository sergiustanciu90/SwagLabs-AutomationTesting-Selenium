package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import messages.Products;
import messages.Login;

public class LoginTests extends BaseTest {

	@Test
	public void validLogin()  {
		loginPage.enterUsername(standardUser.getUsername());
		loginPage.enterPassword(standardUser.getPassword());
		loginPage.clickLogin();
		
		assertTrue(header.isMenuButtonDisplayed());
		assertTrue(header.isShoppingIconDisplayed());
		assertEquals(Products.HOME_TITLE_TEXT,header.getTitleText());
		
	}
	@Test
	public void invalidLogin() throws InterruptedException {
		loginPage.enterUsername(wrongUser.getUsername());
		loginPage.enterPassword(wrongUser.getPassword());
		loginPage.clickLogin();
		loginPage.getErrorText();
		
		assertEquals(Login.LOGIN_INVALID_MESSAGE,loginPage.getErrorText());
		Thread.sleep(5000);
	}
	@Test
	public void lockedOutUserLogin() throws InterruptedException {
		loginPage.enterUsername(lockedOutUser.getUsername());
		loginPage.enterPassword(lockedOutUser.getPassword());
		loginPage.clickLogin();
		
		assertEquals(Login.LOGIN_LOCKED_USER_MESSAGE,loginPage.getErrorText());
		Thread.sleep(4000);
	}
}
