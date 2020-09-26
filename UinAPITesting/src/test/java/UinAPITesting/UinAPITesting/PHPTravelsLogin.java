package UinAPITesting.UinAPITesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pages.PHPTravelsPages;

public class PHPTravelsLogin {
	
	private WebDriver driver = null;
	private PHPTravelsPages page = null;
	
	@BeforeTest
	public void setUpTest(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().setPosition(new Point(0,0));
		driver.manage().window().setSize(new Dimension(1440,826));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		page = new PHPTravelsPages(driver);
	}
	
	@Test
	public void LoginTest(){
		
		page.navigateToWeb();
		
		page.clickloginMyAccount();
		
		page.submitLogin("user@phptravels.com", "demouser");
		
		boolean success = page.assertLoginSuccess();
		
		Assert.assertEquals(true, success);
	}
	
	@AfterTest
	public void LoginTestWithObjects() {
		page.closeWeb();
	}

}
