package tests;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObject.MenuPage;
import pageObject.ShopPage;
import utils.BaseTest;

public class DropdownTest extends BaseTest {

	@Test(priority=1)
	public void selectByValueTest() {
		
		MenuPage menu =  new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		ShopPage shop = new ShopPage(driver);
		shop.filterByValue("rating");
		
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/?orderby=rating");
		assertEquals(shop.getCurrentSelectedOption(), "Sort by average rating");
		
	}
	
	@Test(priority = 2)
	public void selectByVisibleTextTest() {
		MenuPage menu =  new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		ShopPage shop = new ShopPage(driver);
		shop.filterByVisibleText("Sort by popularity");
		assertEquals(shop.getCurrentSelectedOption(), "Sort by popularity");
	
	}
	@Test(priority = 3)
	public void selectByIndexTest() {
		MenuPage menu =  new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		ShopPage shop = new ShopPage(driver);
		shop.filterByIndex(3);
		assertEquals(shop.getCurrentSelectedOption(), "Sort by latest");
	
	}	
	
	
	@Test(priority = 4)
	public void example() throws InterruptedException {
		MenuPage menu =  new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		WebElement dropdown =  driver.findElement(By.xpath("//select[@class='orderby']"));	
		Select select =  new Select(dropdown);
		select.selectByIndex(2);
		Thread.sleep(3000);	
		select.selectByValue("rating");
		
	}	
	
	
}