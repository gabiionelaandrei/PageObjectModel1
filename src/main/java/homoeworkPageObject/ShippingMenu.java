package homoeworkPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class ShippingMenu {

	public WebDriver driver;
	
	
	public ShippingMenu(WebDriver driver) {
		this.driver = driver;
		}
		
	public By userDetails = By.xpath("//span[@class='user_name']");
	public By settingsMenu = By.xpath("//a[contains(text(), 'Settings')]");
	public By saveShippingAddress = By.xpath("//button[contains(@type, 'submit')]");
	
//navigate to locators
	public void navigateTo(By locator) {
		driver.findElement(locator).click();

	}
}
