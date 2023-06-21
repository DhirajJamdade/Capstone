package TestCasesCapstoneFinal;

import java.net.MalformedURLException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CapstoneBaseConfig.basecapstone;
import Scenario5.Loginpage5;
import Scenario5.Products;
import Scenario5.isDisplayedFive;

public class TestcasesFive extends basecapstone {
	
	WebDriver driver;
	public Products product;
	public Loginpage5 product2;
	public isDisplayedFive product3;
	
	@Parameters({"Port"})
	@BeforeClass
	
	
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);		
		product = new Products(driver);
		product2= new Loginpage5(driver);
		product3= new isDisplayedFive(driver);
	} 

	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
      		
		product.clickProductFive();
		product.searchProductVisibleFive();
		product.addToCartFive();
		product2.Loginuserss5();
		product3.visibleFive();

	}

}
   