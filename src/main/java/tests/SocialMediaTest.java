package tests;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObject.SocialMediaPage;
import utils.BaseTest;

public class SocialMediaTest extends BaseTest {
	@Test
	public void windowHandleTest() throws InterruptedException {
		
		//app.menu.navigateTo(app.menu.eventsLink);
		//app.events.clickOnEvent(app.events.festivalOfOldFilmsLink);
		SocialMediaPage socialMedia =  new SocialMediaPage(driver);
		
		//deschidem pagina de instagram
		app.click(app.socialMedia.instagram);	
		System.out.println("Current window (KeyBooks):" + driver.getWindowHandle());
		System.out.println("All windows (Instagram and KeyBooks) :" + driver.getWindowHandles());
		List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
		
		//ne mutam pe pag de instagram
		driver.switchTo().window(browserTabs.get(1));	
		driver.findElement(By.xpath("//button[contains(text(), 'Allow all cookies')]")).click();
		System.out.println("Current window after switch:" + driver.getWindowHandle());
		assertTrue(driver.getCurrentUrl().equals("https://www.instagram.com/"));
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(browserTabs.get(0));
		System.out.println("Current window after tab close:" + driver.getWindowHandle());		
		
		//deschidem pagina de twitter
		app.click(app.socialMedia.twitter);
		System.out.println("Current window (KeyBooks):" + driver.getWindowHandle());
		System.out.println("All windows (Instagram and KeyBooks) :" + driver.getWindowHandles());
		browserTabs = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(browserTabs.get(1));	
		driver.findElement(By.xpath("//span[contains(text(), 'Accept all cookies')]")).click();
		System.out.println("Current window after switch:" + driver.getWindowHandle());
		assertTrue(driver.getCurrentUrl().equals("https://twitter.com/"));
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(browserTabs.get(0));
		System.out.println("Current window after tab close:" + driver.getWindowHandle());
		
		
		//deschidem pagina de facebook
		app.click(app.socialMedia.fb);
		System.out.println("Current window (KeyBooks):" + driver.getWindowHandle());
		System.out.println("All windows (Instagram and KeyBooks) :" + driver.getWindowHandles());
		browserTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));	
		driver.findElement(By.xpath("(//span[contains(text(), 'Allow all cookies')])[2]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Close']")).click();
		System.out.println("Current window after switch:" + driver.getWindowHandle());
		assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/keytraining.ro"));
		Thread.sleep(3000);
		driver.close();
		//ne mutam pe pag KeyBooks
		driver.switchTo().window(browserTabs.get(0));
		System.out.println("Current window after tab close:" + driver.getWindowHandle());
		

		
		
	}
	
	
	
	

}