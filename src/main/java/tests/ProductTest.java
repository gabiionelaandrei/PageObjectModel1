package tests;
import static org.testng.Assert.assertTrue;

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
		

		product.displayedElement(product.loop);
		product.displayedElement(product.title);
		product.displayedElement(product.price);
		product.displayedElement(product.description);
		product.displayedElement(product.category);
		product.displayedElement(product.tags);
		product.displayedElement(product.productID);

	

}
}