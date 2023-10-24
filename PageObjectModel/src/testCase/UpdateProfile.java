package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.loginPageObject;
import pageObjects.updatePageObject;


public class UpdateProfile {

	@Test
	public void updateprofile() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://phptravels.net/login");
		Thread.sleep(3000);

		//using annotations
		PageFactory.initElements(driver, loginPageObject.class);

		loginPageObject .username.sendKeys("user@phptravels.com"); 
		loginPageObject .password.sendKeys("demouser");
		loginPageObject .loginbutton .click();

		Thread.sleep(3000);
		PageFactory.initElements(driver, updatePageObject.class);
		updatePageObject.myprofile.click();
		updatePageObject.newPassword.sendKeys("demouser");
		updatePageObject.address2.sendKeys("kowndampalayam");
		updatePageObject.updateProfile.click();













		//using find elements

		//		loginPageObject .username(driver).sendKeys("user@phptravels.com"); 
		//		loginPageObject .password(driver).sendKeys("demouser");
		//		loginPageObject .loginbutton(driver).click();
		//
		//
		//		updatePageObject.myprofile(driver).click();
		//		updatePageObject.newPassword(driver).sendKeys("demouser");
		//		updatePageObject.address2(driver).sendKeys("kowndampalayam");
		//		updatePageObject.updateProfile(driver).click();
		//		


		//		WebElement userName = driver.findElement(By.name("email"));
		//		userName.sendKeys("user@phptravels.com");
		//
		//		WebElement password = driver.findElement(By.name("password"));
		//		password.sendKeys("demouser");
		//
		//		WebElement loginButton =  driver.findElement(By.id("submitBTN"));
		//		loginButton.click();
		//
		//		Thread.sleep(3000);
		//		WebElement profileButton = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div/div/div[2]/ul/li[3]/a"));
		//		profileButton.click();
		//
		//		WebElement newPassword = driver.findElement(By.name("password"));
		//		newPassword.sendKeys("demouser");
		//
		//		WebElement address = driver.findElement(By.name("address2"));
		//
		//		address.sendKeys("kowndampalayam");
		//
		//		//*[@id="profile"]/div/div[6]/button
		//		Thread.sleep(3000);
		//		WebElement updateButton = driver.findElement(By.xpath("//*[@id='profile']/div/div[6]/button"));
		//
		//		updateButton.click();
	}
}