package AllPagesCapstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Continue {
	WebDriver driver;
	public Continue(WebDriver driver)
	{
		
		this.driver=driver;   
		
		PageFactory.initElements(driver, this);			
	}
	
	@FindBy(xpath= "(//a[normalize-space()='Continue'])[1]")
	WebElement ContinueButton;

	@FindBy(xpath= "//li[10]//a[1]")
	WebElement LoggedInAs;
	
	@FindBy(xpath= "//a[normalize-space()='Delete Account']")
	WebElement DeleteAccountButton;
	
	
	
	
	public void continueMethod() throws InterruptedException {
		ContinueButton.click();
		DeleteAccountButton.click();
		
		System.out.println(LoggedInAs.isDisplayed());
	  	Assert.assertTrue(LoggedInAs.isDisplayed(),("Logged in as John Wood"));
	  	
	  	

	}
	
}
