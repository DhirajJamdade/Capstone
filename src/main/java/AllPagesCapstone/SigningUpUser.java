package AllPagesCapstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SigningUpUser {
	

		WebDriver driver;
		
		
		public SigningUpUser(WebDriver driver)
		{
			
			this.driver=driver;   
			
			PageFactory.initElements(driver, this);	
			
		}
		
		
		@FindBy(xpath = "//input[@placeholder='Name']")
		
		WebElement name;
		
		@FindBy(xpath = "//input[@data-qa='signup-email']")
		
		WebElement email;
		
		
		@FindBy(xpath = "//button[normalize-space()='Signup']")
		
		WebElement button;
		
		
		public void signupValues()
		{
			
			name.sendKeys("Dhiraj");
			
			email.sendKeys("cap112125113@gmailxx.com");
			
			button.click();
			
			
		}
		
		
		@FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
		
		WebElement account;
		
		
		public void informationVisible()
		{
			
			System.out.println("Enter Account Information is Visible - "+account.isDisplayed());
			
			Assert.assertTrue(account.isDisplayed(), "Account Information is  Not Visible ");
			
			
		}
		
		
 }


