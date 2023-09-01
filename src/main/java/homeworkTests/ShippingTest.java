package homeworkTests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import homoeworkPageObject.BlogMenu;
import homoeworkPageObject.BlogPage;
import homoeworkPageObject.ShippingMenu;
import homoeworkPageObject.ShippingPage;
import pageObject.LoginPage;
import pageObject.MenuPage;
import pageObject.ShopPage;
import utils.BaseTest;

public class ShippingTest extends BaseTest{

	@Test(priority = 1, description = "KeyBooks Login ")
	public void validLoginTest() {
		
		MenuPage menu =  new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		LoginPage login = new LoginPage(driver);
		login.loginInApp("TestUser", "12345@67890");
		
		assertTrue(login.loginMsgIsDisplayed(login.loginSuccessMsg));
	}
	
	
	@Test(priority = 2, description = "Add values for the static fields")
	public void shippingAddress() {
		ShippingMenu shippingAdress = new ShippingMenu(driver);
		shippingAdress.navigateTo(shippingAdress.userDetails);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		shippingAdress.navigateTo(shippingAdress.settingsMenu);	
		ShippingPage address = new ShippingPage(driver);
		address.addAddress("First","Last","Street1, House6","041907","City Test");
	}
	
	@Test(priority = 3,  description = "Select Canada value")
	public void selectByIndexTest() {
		ShippingPage shippingCountry = new ShippingPage(driver);
		shippingCountry.filterByIndex(41);
		assertEquals(shippingCountry.getCurrentSelectedOption(), "Canada");
		
	}	

	@Test(priority=4, description = "Select Newfoundland and Labrador value")
	public void selectByValueTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ShippingPage shippingProvince = new ShippingPage(driver);
		shippingProvince.filterByValue("NL");
		assertEquals(shippingProvince.getCurrentSelectedOption(), "Newfoundland and Labrador");
		ShippingMenu saveAdress = new ShippingMenu(driver);
		saveAdress.navigateTo(saveAdress.saveShippingAddress);
		
	}
	

	

	}
	
	

