package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountpage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {

	
	@Test(groups = {"Smoke","Master"})
	public void verify_Login()
	{
		try {
		logger.info("*********   Test Case TC002_LoginTest Started   ********* ");
		
		
		HomePage hPage=new HomePage(driver);
		hPage.clickMyAccount();
		hPage.clickLogin();
		
		
		LoginPage lPage=new LoginPage(driver);
		lPage.setEmail(prop.getProperty("email"));
		lPage.setPassword(prop.getProperty("password"));
		lPage.clickLogin();
		
		MyAccountpage macc=new MyAccountpage(driver);
		boolean targetMSG=macc.displayMyAccountMsg();
		
		macc.clickLogOut();
		Assert.assertTrue(targetMSG);
		logger.info("*********   Test Case TC002_LoginTest Passed Successfully   ********* ");
		
		}
		
		catch (Exception e)
		{
			Assert.assertTrue(false);
		}
		
	}
}
