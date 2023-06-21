package Scenario6;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class products {
	WebDriver driver;

	  public products(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  
	  @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	  public WebElement ProductButton;
      
	  @FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
		public WebElement productone;
	  
	  @FindBy(xpath="//input[@id='name']")
		public WebElement Name;
	  
	  @FindBy(xpath="//input[@id='email']")
		public WebElement Email;
	  
	  @FindBy(xpath="//textarea[@id='review']")
		public WebElement Review;	  
	  
	  {JavascriptExecutor js = (JavascriptExecutor) driver;
  	js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
	  }

     public void clicksix() 
    {			  
    	 ProductButton.click();
    	 productone.click();
    	 Name.sendKeys("Dhiraj");
    	 Email.sendKeys("Dhiraj3455@gmail.com");
    	 Review.sendKeys("good");
     }
}
