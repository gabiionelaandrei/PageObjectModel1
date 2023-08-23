package pageObject;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class ProductPage {
public WebDriver driver;
	
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By banquetBook = By.xpath("//a[contains(text(), 'A banquet of  mouse')]");
	
	public By loop = By.xpath("//div[contains(@id, 'product-257')]/div[1]/a");
	public By title = By.xpath("//h1[@class='product_title entry-title']");
	public By description = By.xpath("//p[contains(text(), 'This delightful book')]");
	public By price = By.xpath("//ins/span/bdi/text()");
	public By category = By.xpath("//span[@class = 'posted_in']");
	public By tags = By.xpath("//span[@class = 'tagged_as']");
	public By productID = By.xpath("//span[@class = 'product_id']");
	
	public void displayedElement (By locator) {
		driver.findElement(banquetBook).click();
		driver.findElement(locator);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:5px solid purple')", locator);
		assertTrue(driver.findElement(locator).isDisplayed());
	}
}
