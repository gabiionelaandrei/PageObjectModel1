package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObject.ContactPage;
import pageObject.MenuPage;
import pageObject.ShopPage;
import utils.BaseTest;

public class ActionClassExample extends BaseTest  {
	
//	@Test
	public void hoverTest() throws InterruptedException{
		
		MenuPage menu = new MenuPage(driver);

		menu.hoverElement(menu.blogLink);
		Thread.sleep(3000);
		menu.hoverElement(menu.aboutLink);
		Thread.sleep(3000);
		menu.hoverElement(menu.blogLink);
		Thread.sleep(3000);
		menu.hoverElement(menu.blogSubMenuMansory);
		Thread.sleep(3000);
		menu.hoverElement(menu.blogSubMenuMansorysubMenu);
	}

	//@Test
	public void dragAndDropTest() {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		ShopPage shop = new ShopPage (driver);
		shop.dragAndDrop(shop.priceSliderInitialPosition, 100,0);
		shop.dragAndDrop(shop.priceSliderFinalPosition, -100,0);		
		
		
	}
	@Test
public void sendKeysExample() {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactsLink);
		ContactPage contacts = new ContactPage(driver);
		WebElement element = driver.findElement(contacts.nameField);
		Actions action = new Actions(driver);
		
		action
		.moveToElement(element)
		.sendKeys(element, "Name")
		.sendKeys(Keys.TAB, "email@email.ro")
		.sendKeys(Keys.TAB, "My subject")
		.sendKeys(Keys.TAB, "My message")
		.sendKeys(Keys.TAB, Keys.ENTER)
		.perform();
	
		
	
		
		
	}
}
