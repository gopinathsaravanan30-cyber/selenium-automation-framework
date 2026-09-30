package Tests;

import java.io.IOException;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Utilities.ExcelData_Login;
import Utilities.LoggerUtil;

public class LoginTest extends BaseTest{

	WebDriver driver;
	Logger log = LoggerUtil.getLogger(LoginTest.class);
	
	@DataProvider(name = "loginData")
	public Object[][] loginData() throws IOException{
		return ExcelData_Login.getExcelData(
				"C:\\Users\\gopin\\eclipse-workspace\\SeleniumAutomation\\src\\test\\resources\\datas.xlsx",
				"LoginData"
				);
	}
	
	@Test(dataProvider = "loginData")
	public void userLogin(String email, String password) {
		log.info("Testing started");
		
		LoginPage login = new LoginPage(driver);
		login.loginApplication(email, password);
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.automationexercise.com/");
	}
	
}
