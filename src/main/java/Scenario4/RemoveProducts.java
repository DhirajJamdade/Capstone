package Scenario4;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RemoveProducts {
	
WebDriver driver;
	
	public RemoveProducts (WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product1;
	
	
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']")
	public WebElement continueb;
	
	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product2;
	
	

	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product3;
	
	


	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product4;
	
	

	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product5;
	
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	public WebElement cart;
	
	
	
	@FindBy(xpath = "//tr[@id='product-1']//i[@class='fa fa-times']")  
	public WebElement remove1;
	
	@FindBy(xpath = "//tr[@id='product-2']//i[@class='fa fa-times']")  
	public WebElement remove2;
	
	@FindBy(xpath = "//tr[@id='product-3']//i[@class='fa fa-times']")  
	public WebElement remove3;
	
	@FindBy(xpath = "//tr[@id='product-4']//i[@class='fa fa-times']")  
	public WebElement remove4;
	
	@FindBy(xpath = "//tr[@id='product-5']//i[@class='fa fa-times']")  
	public WebElement remove5;
	
	@FindBy(xpath = "//b[contains(text(),'Cart is empty!')]")
	
	public WebElement empty;
	
	
	public void addToCart() 
	{
		
			
		product1.click();
		continueb.click();
		
		product2.click();
		continueb.click();
		
		product3.click();
		continueb.click();
		
		product4.click();
		continueb.click();
		
		
		product5.click();
		continueb.click();
		
		
		cart.click();    // Add to cart click
	
	}	
	
	
	public void removeproduct()
	{
		remove1.click();
		remove2.click();
		remove3.click();
		remove4.click();
		remove5.click();
		
		System.out.println(empty.isDisplayed()+"Successfully Product is Removed From Cart ");
		
		Assert.assertFalse(empty.isDisplayed(), "Product is Not Removed From Cart ");
		
	}
	
	

}

