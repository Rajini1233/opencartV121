package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage{
	
	WebDriver driver;
	public AccountRegistration(WebDriver driver) 
	{
		super(driver);
	
	}
	
	@FindBy(name="firstname")
	private WebElement Firstnm;
	@FindBy(name="lastname")
	private WebElement Lastnm;
	@FindBy(name="email")
	private WebElement Email;
	@FindBy(name="telephone")
	private WebElement Telephone;
	@FindBy(name="password")
	private WebElement Password;
	@FindBy(name="confirm")
	private WebElement Confirmpass;
	@FindBy(name="agree")
	private WebElement Agree;
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement Continuebtn;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	private WebElement confirmationmsg;
	
	public void setFirstName(String fnm)
	{
		Firstnm.sendKeys(fnm);
	}
	
	public void setLastName(String lnm)
	{
		Lastnm.sendKeys(lnm);
	}
	
	public void setEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void setTelephone(String telephone)
	{
		Telephone.sendKeys(telephone);
	}
	
	public void setPassword(String pass)
	{
		Password.sendKeys(pass);
	}
	
	public void setConfirmPassword(String confirmpass)
	{
		Confirmpass.sendKeys(confirmpass);
	}
	
	public void setPrivacyPolicy()
	{
		Agree.click();
	}
	
	public void setContinue()
	{
		Continuebtn.click();
	}
	
	public String getConfirmationMsg()
	{
		return (confirmationmsg.getText());
	}

}
