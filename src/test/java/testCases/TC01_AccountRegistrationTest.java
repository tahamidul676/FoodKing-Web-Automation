package testCases;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC01_AccountRegistrationTest extends BaseClass {

	@Test()
	public void registrationOnAccount() throws InterruptedException {
		Thread.sleep(5000);
		HomePage homePage = new HomePage(driver);
		homePage.clickLogin();
		Thread.sleep(5000);
	}
}
