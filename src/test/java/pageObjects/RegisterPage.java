package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath = "//input[@name=\"firstname\"]")
	WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@name=\"lastname\"]")
	WebElement txtLasttName;
	
	@FindBy(xpath = "//input[@name=\"email\"]")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id=\"input-telephone\"]")
	WebElement txtTelephone;
	
	@FindBy(xpath = "//input[@id=\"input-password\"]")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id=\"input-confirm\"]")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//input[@name=\"agree\"]")
	WebElement chkPolicy;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement btnContinue;
	
	@FindBy(xpath = "//div[@id=\"content\"]/p[1]")
	WebElement msgAccountCreated;
	
	
	public void setFirstName(String fName)
	{
		txtFirstName.sendKeys(fName);
	}
	
	public void setLastName(String lName)
	{
		txtLasttName.sendKeys(lName);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String phone)
	{
		txtTelephone.sendKeys(phone);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String pwd)
	{
		txtConfirmPassword.sendKeys(pwd);
	}
	
	public void clickPolicy()
	{
		chkPolicy.click();
		
		//chkPolicy.submit();
	}
	
	public void clickContinue()
	{
		btnContinue.click();
	}
	
	public String getAccountCreatedMSG()
	{
		try
		{
			return msgAccountCreated.getText();
		}
		catch (Exception e) {
			return e.getMessage();
		}
	}
}


