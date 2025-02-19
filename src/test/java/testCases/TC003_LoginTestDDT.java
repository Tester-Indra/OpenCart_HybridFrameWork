package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountpage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginTestDDT extends BaseClass {

	
	@Test(dataProvider = "LoginData",dataProviderClass = DataProviders.class)
	public void verify_Login_DDT(String email,String pwd,String result)
	{
		
		logger.info("*********   Test Case TC003_LoginTestDDT Started   ********* ");
		
		try {
		HomePage hPage=new HomePage(driver);
		hPage.clickMyAccount();
		hPage.clickLogin();
		
		
		LoginPage lPage=new LoginPage(driver);
		lPage.setEmail(email);
		lPage.setPassword(pwd);
		lPage.clickLogin();
		
		MyAccountpage macc=new MyAccountpage(driver);
		boolean targetMSG=macc.displayMyAccountMsg();
		
		
		
		
		if(result.equalsIgnoreCase("Valid"))
		{
			
			if(targetMSG==true)
			{
				macc.clickLogOut();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(result.equalsIgnoreCase("invalid"))
		{
			if(targetMSG==true)
			{
				macc.clickLogOut();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		}
		catch (Exception e) 
		{
			Assert.fail();
		}
		
		logger.info("*********   Test Case TC003_LoginTestDDT Completed Successfully   ********* ");
	}
}
