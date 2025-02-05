package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;


public class LoginTest extends BaseClass {
	  @Test
		public void verifyLoginWithValidCredentials() throws IOException {
			String usernamevalue = ExcelUtility.getStringData(1, 0, "Login");
			String passwordvalue = ExcelUtility.getStringData(1, 1, "Login");
//		  	String usernamevalue = "admin";
//		  	String passwordvalue = "admin";
			LoginPage loginpage = new LoginPage(driver);
			loginpage.enterUsername(usernamevalue);
			loginpage.enterPassword(passwordvalue);
			loginpage.signin();
			boolean isHomepageavailable = loginpage.isHomePageloaded();
			Assert.assertTrue(isHomepageavailable);
		}
}
