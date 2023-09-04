package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SocialMediaPage {
	public WebDriver driver;
	
	public SocialMediaPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By fb = By.xpath("//a[@href='https://www.facebook.com/keytraining.ro']");
	public By twitter = By.xpath("//a[@href='https://twitter.com/']");
	public By instagram = By.xpath("//a[@href='https://www.instagram.com']");

	
	public void clickOnEvent(By locator) {
		driver.findElement(locator).click();
	}

}
