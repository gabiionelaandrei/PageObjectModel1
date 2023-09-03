package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObject.AudioPostPage;
import pageObject.MenuPage;
import pageObject.ShopPage;
import utils.BaseTest;

public class AudioPostTest extends BaseTest {
	
	
	@Test
	public void audioPostTest() {
		MenuPage menu =  new MenuPage(driver);
		menu.navigateTo(menu.blogLink);
		menu.navigateTo(menu.blogSubMenuPostFormats);


}
	
	@Test
	public void dragAndDropTest() {	
		AudioPostPage audioButton =  new AudioPostPage(driver);
		audioButton.navigateTo(audioButton.play);

		AudioPostPage audio = new AudioPostPage(driver);
		audio.dragAndDrop(audio.melSlider, 200, 0);
		audio.dragAndDrop(audio.volSlider, 50, 0);
		
	}
}