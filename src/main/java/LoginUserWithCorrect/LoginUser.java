package LoginUserWithCorrect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginUser {

	WebDriver driver;
public LoginUser(WebDriver driver)
	
	{
		this.driver=driver;   		
		PageFactory.initElements(driver, this);			
	}
   
       @FindBy(xpath = "//a[normalize-space()='Signup / Login']" )
       public WebElement signupbutton;

       @FindBy(xpath = "//h2[normalize-space()='Login to your account']" )
       public WebElement LoginUser;
       
       @FindBy(xpath = "//input[@data-qa='login-email']" )
       public WebElement LoginEmail;
       
       @FindBy(xpath = "//input[@placeholder='Password']" )
       public WebElement LoginPassword;
       
       @FindBy(xpath = "//button[normalize-space()='Login']" )
       public WebElement LoginButton;
       
       @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]" )
       public WebElement LoggedInAs;
       
       @FindBy(xpath = "//a[normalize-space()='Delete Account']" )
       public WebElement DeleteButton;
     
       
       
     
       public void HomeclickSignup()
   	{
   		signupbutton.click();
   		
   	}
   	
   	
   	
   	public void  Visiblebutton()
   	{
   		
   		System.out.println("New User Signup ! is Visible  - "+signupbutton.isDisplayed());
   		
   		Assert.assertTrue(signupbutton.isDisplayed(), "New User Signup is not Visible !");
   		
   		
        System.out.println("Login To your Account ! is Visible  - "+LoginUser.isDisplayed());
   		
   		Assert.assertTrue(LoginUser.isDisplayed(), "New User Signup is not Visible !");
   		
   		LoginEmail.sendKeys("Dhira12@gmail.com");
   		LoginPassword.sendKeys("Dhira@1234");
   		LoginButton.click();
   		
        System.out.println("Logged in As John Wood  ! is Visible  - "+LoggedInAs.isDisplayed());
        
   		Assert.assertTrue(LoggedInAs.isDisplayed(), "New User Signup is not Visible !");
   		
 
   		DeleteButton.click();
   		
        
   		
   	}

}
