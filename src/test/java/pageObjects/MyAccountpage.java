package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountpage extends BasePage{

	public MyAccountpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//a[@title=\"My Account\"]")
	WebElement btnMyAccount;
	
	@FindBy(xpath = "//div[@id=\"content\"]/h2[text()=\"My Account\"]")
	WebElement msgMyAccount;
	
	@FindBy(xpath = "//div/a[text()=\"Logout\"]")
	WebElement btnLogout;
	
	
	
	public void clickMyAccount()
	{
		btnMyAccount.click();
	}
	
	public void clickLogOut()
	{
		btnLogout.click();
	}
	
	public boolean displayMyAccountMsg()
	{
		try {
		return (msgMyAccount.isDisplayed());
		}
		catch (Exception e) {
			return false;
		}
	}
	
	
	
}
