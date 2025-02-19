package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.MyAccountpage;
import pageObjects.RegisterPage;
import testBase.BaseClass;


public class TC001_AccountRegistrationTest extends BaseClass {

	
	@Test(groups = {"Regression","Master"})
	public void verifyAccountRegistration()
	{
		try
		{
		
		logger.info("******  Test Case Execution Started  *********");
		
		HomePage hPage=new HomePage(driver);
		hPage.clickMyAccount();
		logger.info("******  Click On MyAccount Link Successfully  *********");
		
		hPage.clickRegister();
		logger.info("******  Click On Register Page Link Successfully  *********");
		
		RegisterPage rPage=new RegisterPage(driver);
		
		rPage.setFirstName(randomString().toUpperCase());
		rPage.setLastName(randomString().toUpperCase());
		rPage.setEmail(randomString()+"@gmail.com");
		rPage.setTelephone(randomNumbers());
		
		String PassWord=alphaNumric();
		
		rPage.setPassword(PassWord);
		rPage.setConfirmPassword(PassWord);
		
		logger.info("******  Fill all the User Info Successfully  *********");
		
		
		rPage.clickPolicy();
		rPage.clickContinue();
		
		logger.info("******  Click On Continue Btn Successfully  *********");
		
		String Confirmation_Msg=rPage.getAccountCreatedMSG();
		
		Assert.assertEquals(Confirmation_Msg,"Congratulations! Your new account has been successfully created!");
		
		MyAccountpage mPage=new MyAccountpage(driver);
		mPage.clickMyAccount();
		mPage.clickLogOut();
		
		logger.info("**********   click on Logout Btn Successfully   *******************");
		
		logger.info("****** verifyAccountRegistration Test Case Passed Successfully  *********");
		
		}
		catch (Exception e)
		{
			logger.error("***************    Test Case verifyAccountRegistration Failed      **************");
			Assert.assertTrue(false);
			
		}
		
	}
}
