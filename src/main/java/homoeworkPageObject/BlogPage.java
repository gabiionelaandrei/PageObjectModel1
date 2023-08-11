package homoeworkPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlogPage {
	public WebDriver driver;
	
	public BlogPage(WebDriver driver) {
		this.driver = driver;
}
	
	
	//locatori
	
	public By blogPost_15_Amazing_Things=By.xpath("//h4[contains(@class, 'post_title')]/a[contains(text(), '15 Amazing Things About Reading in the Fall')]");
	public By comment = By.xpath("//div[contains(@class, 'comments_field comments_message')]/textarea");
	public By authorName = By.xpath("//div[contains(@class, 'comments_field comments_author')]/input");
	public By authorEmail = By.xpath("//div[contains(@class, 'comments_field comments_email')]/input");
	public By consentBox = By.xpath("//p[contains(@class, 'comment-form')]/input");
	public By consentPost = By.xpath("//p[contains(@class, 'form-submit')]/input[contains(@value, 'Post Comment')]");
	public By messageApproved = By.xpath("//div[text() = 'Your comment is awaiting moderation.']");
	
//metode
public void assComment(String message, String name, String email ) {
	driver.findElement(blogPost_15_Amazing_Things).click();
	
	driver.findElement(comment).clear();
	driver.findElement(comment).sendKeys(message);
	
	driver.findElement(authorName).clear();
	driver.findElement(authorName).sendKeys(name);
	
	driver.findElement(authorEmail).clear();
	driver.findElement(authorEmail).sendKeys(email);
	
	
	driver.findElement(consentBox).click();
	driver.findElement(consentPost).click();
	
}


public boolean commentIsDisplayed(By locator) {
	
	return driver.findElement(locator).isDisplayed();
}
}