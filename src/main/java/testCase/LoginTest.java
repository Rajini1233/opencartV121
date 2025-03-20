package testCase;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.Loginpage;
import pageobjects.MyAccountPage;

public class LoginTest extends BaseClass {
	
	@Test
	public void verifylogin()
	{
		HomePage pg=new HomePage(driver);
		pg.clickMyacc();
		pg.clicklogin();
		
		Loginpage lp=new Loginpage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.setLogin();
		
		MyAccountPage ma=new MyAccountPage(driver);
		boolean target=ma.accExists();
		Assert.assertTrue(target);
	}
	

}
