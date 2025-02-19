package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath = "//input[@name=\"email\"]")
	WebElement txtEmailBox;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement txtPasswordBox;
	
	@FindBy(xpath = "//input[@value=\"Login\"]")
	WebElement btnLogin;
	
	
	public void setEmail(String email)
	{
		txtEmailBox.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtPasswordBox.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
}
