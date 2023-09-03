package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;
import utils.DataProviderClass;

public class DataProviderMainPageTest extends BaseTest{
	
	
	@Test(dataProviderClass = DataProviderClass.class, dataProvider = "bookURLDataProvider")
	public void searchBooksTest(String title, String url) throws InterruptedException {
		
		WebElement book = driver.findElement
				(By.xpath("//a[contains(text()," + "\"" + title + "\")]"));
		book.click();
		assertTrue(driver.getCurrentUrl().equals(url));
		driver.navigate().back(); 
	}

}
