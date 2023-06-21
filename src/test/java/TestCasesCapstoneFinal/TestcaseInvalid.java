package TestCasesCapstoneFinal;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AllPagesCapstone.AddressInformationCaapstone;
import AllPagesCapstone.Continue;
import AllPagesCapstone.EnterAccountInformation;
import AllPagesCapstone.RegistrationUser;
import AllPagesCapstone.SigningUpUser;
import CapstoneBaseConfig.basecapstone;
import InvalidLoginTC3.InvalidLogin;
import LoginUserWithCorrect.LoginUser;

public class TestcaseInvalid extends basecapstone {
	
    WebDriver driver;
    InvalidLogin invaliduser;
    
    
    
    @BeforeClass
	@Parameters("Port")
	
	
	
		public void capstonesetup (String Port) throws MalformedURLException
		
		{
    	driver = setUp(Port);
    	invaliduser = new InvalidLogin(driver);
		}
    

	


	@Test
	public void callmethod ()throws InterruptedException
	{
		 invaliduser.invalidMethod();
    	invaliduser.DataForInvalid();
		
		
	}
	
	
	

}
