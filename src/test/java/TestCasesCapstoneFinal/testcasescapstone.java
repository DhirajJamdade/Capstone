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


	public class testcasescapstone  extends basecapstone  {
		
		WebDriver driver;
		RegistrationUser register;		
		SigningUpUser signup;
		EnterAccountInformation AccountInformation;
		AddressInformationCaapstone Address;
		Continue deletetask;
		
		
		
		
		
		@BeforeClass
		@Parameters("Port")
		
		
		
			public void capstonesetup (String Port) throws MalformedURLException
			
			{
			driver= setUp (Port);
            register=new RegistrationUser(driver);

			signup=new SigningUpUser(driver);
			
			AccountInformation=new EnterAccountInformation(driver);

			Address = new AddressInformationCaapstone(driver);
			
			deletetask = new Continue(driver);

			}
		
		
		@Test
		public void callmethod ()throws InterruptedException
		{
			register.clickHomepage();
			register.VisibilityOfText();
			signup.signupValues();
			AccountInformation.Accountinformation();
			Address.AddressInformation();
			deletetask.continueMethod();
			
		}
		
		
	}


