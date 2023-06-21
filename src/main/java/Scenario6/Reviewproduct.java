package Scenario6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Reviewproduct {
	
	
	WebDriver driver;

	  public Reviewproduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  @FindBy(xpath="//*[text()='Write Your Review']")
	  public WebElement ReviewMsg;
	  
	  @FindBy(id="name")
	  public WebElement NameReview;
	  
	  @FindBy(id="email")
	  public WebElement EmailReview;
	  
	  @FindBy(id="review")
	  public WebElement WriteReview;
	  
	  @FindBy(id="button-review")
	  public WebElement SubmitReview;
	  
	  @FindBy(xpath = "//span[contains(text(),'Thank you for your review.')]")
	  
	  public WebElement thanky;
	  
	  public void EnterReview()
	  {
		  ReviewMsg.isDisplayed();
		  NameReview.sendKeys("Dhiraj");
		  EmailReview.sendKeys("Dhiraj@gmail.com");
		  WriteReview.sendKeys("Product is good  ");
		  SubmitReview.click();
	  }

  
	  public void Thankyou2() {
		  System.out.println("Thanky YOu Review is displayed "+thanky.isDisplayed());
		  Assert.assertEquals(thanky.isDisplayed(), true);
	  }
	
}