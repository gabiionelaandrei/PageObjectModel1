package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample3 extends BaseTest{
	
	
	
	@Test
	public void xpathExample3() {
		
		driver.findElement(By.linkText("BOOKS")).click();
		
		////span[bdi='$14.99']
		
		
		
		//select and go back one level and down on specific sibling 
		//bdi[contains(text(), '14.99')]/../../following-sibling::a
		
		
		////span[bdi='$11.50']/../../del/child::*/bdi
		
		
		////*[self::span or self::a][contains(@class, 'page-numbers') and not(contains(text(), '1') or contains(text(), '2'))]
		
		
		
		// atunci cand vreau ultimul element dar nu pot sa ma bazez pe index, folosim last
		
//		//bdi[contains(text), '10.35']/ancestor::div[@class='post_content']/a acelasi lucru cu
//		//bdi[contains(text), '10.35']/ancestor::div[@class='post_content']/child::a
		
//			//bdi[contains(text), '10.35']/ancestor::div[@class='post_content']/following::li
			
			
	//(//h2[@class = 'woocommerce-lopp-product__title'])[16]

	//ultimul
	//(//h2[@class = 'woocommerce-lopp-product__title'])[last()]

	//penultimul (//h2[@class = 'woocommerce-lopp-product__title'])[last()-1]
		//similar cu index este si position
    //(//h2[@class = 'woocommerce-lopp-product__title'])[position()=16]
		
		
		
		
	}

}