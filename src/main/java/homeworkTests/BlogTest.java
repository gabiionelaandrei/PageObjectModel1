package homeworkTests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import homeworkUtils.BrowserSetup;
import homoeworkPageObject.BlogMenu;
import homoeworkPageObject.BlogPage;


public class BlogTest extends BrowserSetup{
	
	@Test(description = "Post a valid comment")
	
	public void postValidComment() {
		
		BlogMenu blog = new BlogMenu(driver);
		blog.navigateTo(blog.blogMenu);
		blog.navigateTo(blog.classicMenu);

		
		BlogPage comment = new BlogPage(driver);
		
		comment.assComment("This is a test","Test Test","Test@yahoo.com");
		
		assertTrue(comment.commentIsDisplayed(comment.messageApproved));

	}

}
