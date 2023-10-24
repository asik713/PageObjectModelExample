package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.loginPageObject;


public class LoginTestCase {



	@Test
	public void logintestcase() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		
		PageFactory.initElements(driver, loginPageObject.class);
		
		loginPageObject.email.sendKeys("ak");
		loginPageObject.pass.sendKeys("pass");
		
		
		
		
		
		
		
		
		
		
		
//		
//		PageFactory.initElements(driver,  loginPageObject.class);
//		
//		//using annotations for fb
//		loginPageObject.email.sendKeys("akrahu3@gmail.com");
//		loginPageObject.password.sendKeys("9751311679");
//		loginPageObject.login.click();
//		
		
//		//using find elements for fb...
//		loginPageObject.email(driver).sendKeys("akrahu3@gmail.com");
//		loginPageObject.password(driver).sendKeys("9751311679");
//		loginPageObject.login(driver).click();
//			
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		//using annotations
//		PageFactory.initElements(driver, loginPageObject.class);
//		
//		loginPageObject .username.sendKeys("user@phptravels.com"); 
//		loginPageObject .password.sendKeys("demouser");
//		loginPageObject .loginbutton .click();
//
//		//using find element
//		//		loginPageObject .username(driver).sendKeys("user@phptravels.com"); 
//		//		loginPageObject .password(driver).sendKeys("demouser");
//		//		loginPageObject .loginbutton(driver).click();
//
//
//		//		WebElement userName = driver.findElement(By.name("email"));
//		//		userName.sendKeys("user@phptravels.com");
//		//
//		//		WebElement password = driver.findElement(By.name("password"));
//		//		password.sendKeys("demouser");
//		//
//		//		WebElement loginButton =  driver.findElement(By.id("submitBTN"));
//		//		loginButton.click();

	}

}
