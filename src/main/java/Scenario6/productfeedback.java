package Scenario6;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;

	public class productfeedback {
		
		WebDriver driver;

		  public productfeedback(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		  
		  
		  @FindBy(xpath = "//a[@href='/products']")
		  public WebElement Button;
		  
		 @FindBy(xpath="//h2[contains(text(),'All Products')]")
		  public WebElement AllProduct;
		  		  		 
		 
		 @FindBy(xpath = "//div[3]//div[1]//div[2]//ul[1]//li[1]//a[1]")
		  public WebElement ClickViewProduct;
		  
		  public void PerformReview() 
		  {			  
			  Button.click();			  			  
			  Assert.assertEquals(AllProduct.isDisplayed(), true);
		 }
		  
		 public void performview2() {
			  ClickViewProduct.click();			 

		 }
	

}