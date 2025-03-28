package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	private WebElement headermsg;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	private WebElement logoutlink;
	
	public boolean accExists()
	{
		return(headermsg.isDisplayed());
	}
	
	public void logout()
	{
		logoutlink.click();
	}

}
