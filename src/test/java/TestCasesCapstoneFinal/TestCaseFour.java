package TestCasesCapstoneFinal;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CapstoneBaseConfig.basecapstone;
import Scenario4.RemoveProducts;

public class TestCaseFour extends basecapstone{
	
  
	
	WebDriver driver;
	public RemoveProducts addcart;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		
		addcart = new RemoveProducts(driver);
	} 
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
      		
		addcart.addToCart();
		addcart.removeproduct();

	}

}
   
	 
	
	  
