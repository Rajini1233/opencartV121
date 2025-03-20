package testCase;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountRegistration;
import pageobjects.HomePage;

public class TCAccountregTest extends BaseClass {
	
	@Test
	public void verifyregacc()
	{
		HomePage pg=new HomePage(driver);
		pg.clickMyacc();
		pg.clickReg();
		AccountRegistration Ar=new AccountRegistration(driver);
		Ar.setFirstName(randomString().toLowerCase());
		Ar.setLastName(randomString().toLowerCase());
		Ar.setEmail(randomString()+"@gmail.com");
		Ar.setTelephone(randomNumber());
		
		String password=randomAlphanumeric();
		Ar.setPassword(password);
		Ar.setConfirmPassword(password);
		Ar.setPrivacyPolicy();
		Ar.setContinue();
		 String confirmmsg= Ar.getConfirmationMsg();
		 Assert.assertEquals(confirmmsg, "Your Account Has Been Created!");
		
	}
	
	
	

}
