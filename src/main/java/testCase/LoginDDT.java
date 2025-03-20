package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import assertions.Dataproviders;
import pageobjects.HomePage;
import pageobjects.Loginpage;
import pageobjects.MyAccountPage;

public class LoginDDT extends BaseClass {
	@Test(dataProvider = "LoginData",dataProviderClass=Dataproviders.class)
	public void verifylogin1(String email,String pass,String res1) {
		HomePage pg=new HomePage(driver);
		pg.clickMyacc();
		pg.clicklogin();
		
		Loginpage lp=new Loginpage(driver);
		lp.setEmail(email);
		lp.setPassword(pass);
		lp.setLogin();
		
		MyAccountPage ma=new MyAccountPage(driver);
		boolean target=ma.accExists();
		Assert.assertTrue(target);
		
		if(res1.equalsIgnoreCase("valid"))
		{
			if(target==true)
			{
				Assert.assertTrue(true);
				ma.logout();
			}
			else
			{
				Assert.assertFalse(false);
			}
			
		}
		
	}

}
