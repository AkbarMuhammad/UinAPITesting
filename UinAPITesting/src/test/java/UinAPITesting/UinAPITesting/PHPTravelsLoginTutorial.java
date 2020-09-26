package UinAPITesting.UinAPITesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class PHPTravelsLoginTutorial {
	
	@Test
	public static void LoginTest(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().setPosition(new Point(0,0));
		driver.manage().window().setSize(new Dimension(1440,826));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.phptravels.net/");
		
		driver.findElement(By.xpath("//*[@class='dropdown dropdown-login dropdown-tab']")).click();
		driver.findElement(By.xpath("//*[@class='dropdown-item active tr']")).click();
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("user@phptravels.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("demouser");
		driver.findElement(By.xpath("//*[@class='btn btn-primary btn-lg btn-block loginbtn']")).click();
		
		WebElement helloTxt = driver.findElement(By.xpath("//*[contains(text(),'Hi, Demo User')]"));
		Assert.assertEquals(true, helloTxt.isDisplayed());
		
		driver.close();
	}

}
