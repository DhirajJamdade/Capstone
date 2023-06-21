package InvalidLoginTC3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InvalidLogin {
	
	
	WebDriver driver;
	public InvalidLogin(WebDriver driver)
		
		{
			this.driver=driver;   		
			PageFactory.initElements(driver, this);			
		}
	   
	       @FindBy(xpath = "//a[normalize-space()='Signup / Login']" )
	       public WebElement signupbuttonInvalid;

	       @FindBy(xpath = "//h2[normalize-space()='Login to your account']" )
	       public WebElement LoginUserInvalid;
	       
	       @FindBy(xpath = "//input[@data-qa='login-email']" )
	       public WebElement LoginEmailInvalid;
	       
	       @FindBy(xpath = "//input[@placeholder='Password']" )
	       public WebElement LoginPasswordInvalid;
	       
	       @FindBy(xpath = "//button[normalize-space()='Login']" )
	       public WebElement LoginButtonInvalid;
	       
	       
	       public void  invalidMethod()
	      	{
	    	   
	       signupbuttonInvalid.click();
   
	       System.out.println("Login To your Account ! is Visible  - "+LoginUserInvalid.isDisplayed());
	   		
	   		Assert.assertTrue(LoginUserInvalid.isDisplayed(), "New User Signup is not Visible !");
	      	}
	       
	       public void DataForInvalid() {
	    	   LoginEmailInvalid.sendKeys("asdd@gmail.com");
	    	   LoginPasswordInvalid.sendKeys("Jojosjx");
	    	   LoginButtonInvalid.click();
	       }
	       
	       

}
