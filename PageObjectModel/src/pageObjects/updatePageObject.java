package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class updatePageObject {

	//using annotations
	@FindBy(xpath="//*[@id=\"fadein\"]/div[3]/div/div/div[2]/ul/li[3]/a") 
	public static WebElement myprofile;

	@FindBy(name="password") 
	public static WebElement newPassword;

	@FindBy(name="address2") 
	public static WebElement address2;

	@FindBy(xpath="//*[@id='profile']/div/div[6]/button") 
	public static WebElement updateProfile;







	//using find elements..
	//	public static WebElement myprofile(WebDriver driver) {
	//
	//		return driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div/div/div[2]/ul/li[3]/a"));
	//	}
	//
	//	public static WebElement newPassword(WebDriver driver) {
	//
	//		return driver.findElement(By.name("password"));
	//	}
	//
	//	public static WebElement address2(WebDriver driver) {
	//
	//		return driver.findElement(By.name("address2"));
	//
	//	}
	//
	//	public static WebElement updateProfile(WebDriver driver) {
	//		return driver.findElement(By.xpath("//*[@id='profile']/div/div[6]/button"));
	//
	//
	//	}

}
