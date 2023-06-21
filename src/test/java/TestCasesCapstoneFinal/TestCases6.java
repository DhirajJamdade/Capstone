package TestCasesCapstoneFinal;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CapstoneBaseConfig.basecapstone;
import Scenario6.Reviewproduct;
import Scenario6.productfeedback;

public class TestCases6 extends basecapstone {
	
	
	
	public productfeedback allobj;
	
	public Reviewproduct reviewobj;
	
    WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	
	public void setup2(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		
		allobj=new productfeedback(driver);
		
		reviewobj=new Reviewproduct(driver);
	}

	
	@Test
	public void DemoScenario() 
	{
		
		allobj.PerformReview();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		allobj.performview2();
		
		reviewobj.EnterReview();
	}
	
	
 }