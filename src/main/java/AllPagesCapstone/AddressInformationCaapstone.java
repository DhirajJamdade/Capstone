package AllPagesCapstone;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddressInformationCaapstone {
	
	WebDriver driver;
	public AddressInformationCaapstone(WebDriver driver)
	{
		
		this.driver=driver;   
		
		PageFactory.initElements(driver, this);			
	}
	
	
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement FirstNameField;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement LastNameField;
	
	@FindBy(xpath="//input[@id='company']")
	WebElement Company;
	
	@FindBy(xpath="//input[@data-qa='address']")
	WebElement Address;
	
	@FindBy(xpath="//input[@id='address2']")
	WebElement Address2;
	
	@FindBy(xpath = "//input[@id='state']")
   	public WebElement StateField;
    
    @FindBy(xpath = "//input[@id='city']")
   	public WebElement cityField;
    
    @FindBy(xpath = "//input[@id='zipcode']")
   	public WebElement ZipcodeField;
    
    @FindBy(xpath = "//input[@id='mobile_number']")
   	public WebElement MobilenumberField;
    
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
   	public WebElement CreateaccountField;
    
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
   	public WebElement AccountCreatedVisible;
    
  
     
	
	public void AddressInformation() throws InterruptedException {
		FirstNameField.sendKeys("Dhiraj");
		LastNameField.sendKeys("Jamdade");
		Company.sendKeys("Axis Bank");
		Address.sendKeys("7th Floor, C-2, Wadia International Centre Pandurang Budhkar Marg, Worli, Mumbai - 400 025");
		Address2.sendKeys("7th Floor, C-2, Wadia International Centre Pandurang Budhkar Marg, Worli, Mumbai - 400 025");
		StateField.sendKeys("Maharashtra");
		cityField.sendKeys("Mumbai");
		ZipcodeField.sendKeys("400708");
		MobilenumberField.sendKeys("7896541230");
		CreateaccountField.click();
		
		System.out.println("Enter Account Information is Visible - "+AccountCreatedVisible.isDisplayed());		
		Assert.assertTrue(AccountCreatedVisible.isDisplayed(), "Account Information is  Not Visible ");
	}

}
