package TestCasesCapstoneFinal;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AllPagesCapstone.RegistrationUser;
import CapstoneBaseConfig.basecapstone;
import LoginUserWithCorrect.LoginUser;

public class Testcase2Login extends basecapstone{
	WebDriver driver;

	
	LoginUser User;
	
	@BeforeClass
	@Parameters("Port")
	
	
	
		public void capstonesetup (String Port) throws MalformedURLException
		
		{
		driver= setUp (Port);
		
		User=new LoginUser(driver);
		}
	
	@Test
	public void callmethod ()throws InterruptedException
	{
		User.HomeclickSignup();
		User.Visiblebutton();

	
	}

}
