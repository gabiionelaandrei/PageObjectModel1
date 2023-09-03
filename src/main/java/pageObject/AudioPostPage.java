package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AudioPostPage {
public WebDriver driver;
	
	
	public AudioPostPage(WebDriver driver) {
		this.driver = driver;
	}



//locatori
public By audioPostOption = By.xpath("//a[contains(text(), 'Audio post')]");
public By play = By.xpath("//div[@class='mejs-button mejs-playpause-button mejs-play']");
public By melSlider = By.xpath("//span[@class='mejs-time-total mejs-time-slider']");
public By volSlider = By.xpath("//div[@class='mejs-horizontal-volume-current']");

//metoda drag and drop pt modificare slider melodie si volum

public void dragAndDrop(By locator, int x, int y) {
	WebElement element =  driver.findElement(locator);
	Actions action = new Actions(driver);
	action.moveToElement(element).clickAndHold(element).moveByOffset(x, y).release().perform();

}

public void navigateTo(By locator) {
	driver.findElement(locator).click();
}

}