package Scenario5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class isDisplayedFive {

	WebDriver driver;

	  public isDisplayedFive (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 //verify All product test is visible
		@FindBy(xpath="//h2[contains(text(),'All Products')]")
		public WebElement AllproductvisibleFive;
		
		//verify Searched product test is visible
		@FindBy(xpath="//h2[contains(text(),'Searched Products')]")
		public WebElement SearchedproductvisibleFive;
		
		public void visibleFive()
		{
			System.out.println(AllproductvisibleFive.isDisplayed());
			Assert.assertTrue(AllproductvisibleFive.isDisplayed(),"All product test is not Displayed");
			
			System.out.println(SearchedproductvisibleFive.isDisplayed());
			Assert.assertTrue(SearchedproductvisibleFive.isDisplayed(),"Searched product test is not Displayed");
		
		}

	
	
}
