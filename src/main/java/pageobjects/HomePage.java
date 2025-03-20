package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	WebDriver driver;
	
	public  HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	private WebElement Myacc;
	@FindBy(xpath="//a[normalize-space()='Register']")
	private WebElement Reg;
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
	private WebElement login;
	
	public void clickMyacc()
	{
		Myacc.click();
	}
	
	public void clickReg()
	{
		Reg.click();
	}
	public void clicklogin()
	{
		login.click();
	}

}
