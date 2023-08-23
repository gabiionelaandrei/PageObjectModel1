package tests;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pageObject.MenuPage;
import pageObject.ProductPage;
import utils.BaseTest;

public class ProductTest extends BaseTest {
	
	
	@Test(priority=1, description = "Open a product page - check if the product elements are displayed")
	
	public void isdisplayed() {		

		MenuPage menu =  new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		ProductPage product = new ProductPage(driver);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		product.displayedElement(product.loop);
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:5px solid purple')", product.loop);
		product.displayedElement(product.title);
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:5px solid purple')", product.title);
		product.displayedElement(product.price);
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:5px solid purple')", product.price);
		product.displayedElement(product.description);
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:5px solid purple')", product.description);
		product.displayedElement(product.category);
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:5px solid purple')", product.category);
		product.displayedElement(product.tags);
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:5px solid purple')", product.tags);
		product.displayedElement(product.productID);
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:5px solid purple')", product.productID);
		

}
}