package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath = "//a[@title=\"My Account\"]")
	WebElement btnMyAccount;
	
	
	@FindBy(xpath = "//a[text()=\"Register\"]")
	WebElement btnRegister;
	
	
	@FindBy(xpath = "//a[text()=\"Login\"]")
	WebElement btnLogin;
	
	
	
	public void clickMyAccount()
	{
		btnMyAccount.click();
	}
	
	public void clickRegister()
	{
		btnRegister.click();
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
}
