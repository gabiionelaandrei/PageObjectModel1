package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JavaexecutorBlogTest1 extends BaseTest {
	@Test
	public void navigateToBlog() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		String jsHover = "var obiect = document.createEvent('MouseEvent');"
				+ "obiect.initMouseEvent('mouseover', true); arguments[0].dispatchEvent(obiect);";
		
		jse.executeScript(jsHover, app.returnWebElement(app.menu.blogLink) );
		jse.executeScript("arguments[0].click()", app.returnWebElement(app.menu.blogSubMenuClasic));
		
		WebElement searchClassicBlog = driver.findElement(By.xpath("//input[contains(@title, 'Search for:')]"));
		jse.executeScript("arguments[0].scrollIntoView()", searchClassicBlog);
		jse.executeScript("arguments[0].click()", searchClassicBlog);
		jse.executeScript("arguments[0].value='"+ "Why I won\\'t stop buying books" +"';", searchClassicBlog);
		
		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search-2\"]/form/button"));
		jse.executeScript("arguments[0].click()", searchButton);
		
		WebElement readMore = driver.findElement(By.xpath("//span[contains(@class, 'post_readmore_label')]"));
		jse.executeScript("arguments[0].click()", readMore);
		
		String isDisplayedClassic = jse.executeScript("return document.getElementsByClassName('category_link')[0].checkVisibility() ").toString();
		String isDisplayedNews = jse.executeScript("return document.getElementsByClassName('category_link')[1].checkVisibility() ").toString();
		String isDisplayedRecommend = jse.executeScript("return document.getElementsByClassName('category_link')[2].checkVisibility() ").toString();
		
		System.out.println("isDisplayed :" + isDisplayedClassic);
		System.out.println("isDisplayed :" + isDisplayedNews);
		System.out.println("isDisplayed :" + isDisplayedRecommend);
				
}
	
	@Test
	public void navigateToShop() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", app.returnWebElement(app.menu.shopLink));
		WebElement cookBooks = driver.findElement(By.xpath("//a[contains(text(),'Cookbooks')]"));
		jse.executeScript("arguments[0].click()", cookBooks);
		
		//String onSale = jse.executeScript("return document.getElementsByClassName('hover_icon hover_icon_link')[0].checkVisibility() ").toString();
		String onSale = jse.executeScript
				("return document.getElementsByClassName('hover_icon hover_icon_link')[0].childNodes[1].innerText").toString();
		System.out.println("isDisplayed :" + onSale);
		
		onSale =jse.executeScript
				("return document.getElementsByClassName('hover_icon hover_icon_link')[1].childNodes[1].innerText").toString();
		System.out.println("isDisplayed :" + onSale);
		
		onSale =jse.executeScript
				("return document.getElementsByClassName('hover_icon hover_icon_link')[2].childNodes[1].innerText").toString();
		System.out.println("isDisplayed :" + onSale);
		
		onSale =jse.executeScript
				("return document.getElementsByClassName('hover_icon hover_icon_link')[3].childNodes[1].innerText").toString();
		System.out.println("isDisplayed :" + onSale);
		
		onSale =jse.executeScript
				("return document.getElementsByClassName('hover_icon hover_icon_link')[4].childNodes[1].innerText").toString();
		System.out.println("isDisplayed :" + onSale);
}
}