package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage {

	public Loginpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailtext;
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement passtext;
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginbtn;
	
	public void setEmail(String email)
	{
		emailtext.sendKeys(email);
	}
	
	public void setPassword(String pass)
	{
		passtext.sendKeys(pass);
	}
	public void setLogin()
	{
		loginbtn.click();
	}

}
