package homoeworkPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogMenu {
	public WebDriver driver;
	
	
	public BlogMenu(WebDriver driver) {
		this.driver = driver;
		}
	
	//identific meniul
	
	public By blogMenu = By.xpath("//li[contains(@id, 'menu-item-76')]/a [contains(text(), 'Blog')]");

	// optiuni blog menu
	public By classicMenu = By.xpath("//li[contains(@id, 'menu-item-114')]/a");
	
	public By mansoryMenu = By.xpath("//li[contains(@id, 'menu-item-119')]/a");
	
	public By portofolioMenu = By.xpath("//li[contains(@id, 'menu-item-120')]/a");
	
	public By postFormatsMenu = By.xpath("//li[contains(@id, 'menu-item-232')]/a");

	
	//navighez catre el
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
}
