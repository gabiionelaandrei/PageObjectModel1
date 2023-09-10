package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JavaScriptExecutorBlogTest extends BaseTest{
	@Test
	public void navigateToBlog() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Actions action = new Actions(driver);
		
		String jsHover = "var obiect = document.createEvent('MouseEvent');"
				+ "obiect.initMouseEvent('mouseover', true); arguments[0].dispatchEvent(obiect);";
		
		jse.executeScript(jsHover, app.returnWebElement(app.menu.blogLink) );
		jse.executeScript("arguments[0].click()", app.returnWebElement(app.menu.blogSubMenuPostFormats));
	
		WebElement galleryFormatArticle = driver.findElement(By.cssSelector("a[href='https://keybooks.ro/2016/02/01/gallery-format/']"));
		jse.executeScript("arguments[0].scrollIntoView()", galleryFormatArticle);
		jse.executeScript("arguments[0].click()", galleryFormatArticle);
		
		WebElement commentSection = driver.findElement(By.cssSelector("h2[class='section_title comments_form_title']"));
		jse.executeScript("arguments[0].scrollIntoView()", commentSection);
		WebElement commentWindow = driver.findElement(By.cssSelector("textarea[id='comment']"));
		jse.executeScript("arguments[0].click()", commentWindow);
		jse.executeScript("arguments[0].value='"+ "This is a nice article" +"';", commentWindow);
		
		WebElement authorName = driver.findElement(By.cssSelector("input[id='author']"));
		jse.executeScript("arguments[0].click()", authorName);
		jse.executeScript("arguments[0].value='"+ "gabi" +"';", authorName);
		
		WebElement authorEmail = driver.findElement(By.cssSelector("input[id='email']"));
		jse.executeScript("arguments[0].click()", authorEmail);
		jse.executeScript("arguments[0].value='"+ "gabi@test.ro" +"';", authorEmail);
		
		WebElement authorConsent = driver.findElement(By.cssSelector("input[id='wp-comment-cookies-consent']"));
		if(!authorConsent.isSelected())
		jse.executeScript("arguments[0].click()", authorConsent);
		
		WebElement postComment = driver.findElement(By.cssSelector("input[name='submit']"));
		jse.executeScript("arguments[0].click()", postComment);
		
	}

}
