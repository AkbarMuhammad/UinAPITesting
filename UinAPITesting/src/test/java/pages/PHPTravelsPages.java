package pages;

import org.openqa.selenium.WebDriver;

import objectRepository.PHPTravelsObjects;

public class PHPTravelsPages {
	
	WebDriver driver = null;
	
	public PHPTravelsPages(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToWeb() {
		driver.get("https://www.phptravels.net/");
		
		System.out.println("Navigate To Web");
	}
	
	public void closeWeb() {
		driver.quit();
		
		System.out.println("Close Website");
	}
	
	public void clickloginMyAccount() {
		PHPTravelsObjects.btn_drop_down_my_account(driver).click();
		PHPTravelsObjects.btn_login(driver).click();
		
		System.out.println("Navigate to Login");
	}
	
	public void submitLogin(String username, String password) {
		PHPTravelsObjects.txt_field_username(driver).sendKeys(username);
		PHPTravelsObjects.txt_field_password(driver).sendKeys(password);
		PHPTravelsObjects.btn_submit_login(driver).click();
		
		System.out.println("Submit username and password");
	}
	
	public boolean assertLoginSuccess() {
		boolean assertLogin = PHPTravelsObjects.txt_hello(driver).isDisplayed();
		
		System.out.println("Assert Login Succes");
		return assertLogin;
	}

}
