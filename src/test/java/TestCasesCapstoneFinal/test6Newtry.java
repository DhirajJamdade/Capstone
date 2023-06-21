package TestCasesCapstoneFinal;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CapstoneBaseConfig.basecapstone;

import Scenario6.products;

public class test6Newtry extends basecapstone{
	
	
	public products myobj1;
	
WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	
	public void setup2(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		
		myobj1=new products(driver);
		
	}
	
	@Test
	 public void ReviewSix()
	  {
		 myobj1.clicksix();
	  }


}
