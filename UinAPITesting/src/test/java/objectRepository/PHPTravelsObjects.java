package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PHPTravelsObjects {
	
	private static WebElement element = null;
	
	//btn
	public static WebElement btn_drop_down_my_account(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='dropdown dropdown-login dropdown-tab']"));
		return element;
	}
	
	public static WebElement btn_login(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='dropdown-item active tr']"));
		return element;
	}
	
	public static WebElement btn_submit_login(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='btn btn-primary btn-lg btn-block loginbtn']"));
		return element;
	}
	
	//txtField
	public static WebElement txt_field_username(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@name='username']"));
		return element;
	}
	
	public static WebElement txt_field_password(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@name='password']"));
		return element;
	}
	
	//txt
	public static WebElement txt_hello(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[contains(text(),'Hi, Demo User')]"));
		return element;
	}

}
