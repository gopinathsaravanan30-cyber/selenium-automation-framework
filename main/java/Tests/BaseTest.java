package Tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utilities.ConfigReader;
import Utilities.ScreenShotUtil;

public class BaseTest {

	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws IOException {
		ConfigReader.loadProperties();
		
		String browser = ConfigReader.getProperty("browser");
		String Url = ConfigReader.getProperty("productUrl");
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get(Url);
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if(result.getStatus() == ITestResult.FAILURE) {
			ScreenShotUtil.takeScreenShot(driver,
					result.getName());
		}
		driver.quit();
	}
	
}
