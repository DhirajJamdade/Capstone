package AllPagesCapstone;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class EnterAccountInformation {
	
	WebDriver driver;
	
	
	public EnterAccountInformation(WebDriver driver)
	{
		
		this.driver=driver;   
		
		PageFactory.initElements(driver, this);			
	}
	
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement Password;
    
	
	
	@FindBy(xpath = "//select[@id='days']")
	public WebElement Day;
	
	@FindBy(xpath = "//select[@id='months']")
	public WebElement Months;
	
	@FindBy(xpath = "//select[@id='years']")
	public WebElement Years;
	
    @FindBy(xpath = "//input[@id='newsletter']")
	public WebElement NewsLetter;
    
    @FindBy(xpath = "//input[@id='optin']")
	public WebElement Receive;
    
	
	public void Accountinformation()throws InterruptedException
	{
	       
		Password.sendKeys("Dhiraj1@143");
		Select day = new Select(Day);
		day.selectByVisibleText("1999");
		  
		Select month = new Select(Months);
		month.selectByVisibleText("January");
		  
		Select year = new Select(Years);
		year.selectByVisibleText("1999");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    NewsLetter.click();
		Receive.click();
		
		
	}
	

}
