package pageObjects;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPageObject {

	public static WebElement email;
	public static WebElement pass;
	
	
	

















	//using annotations...
	//	
	//		@FindBy(id="email")
	//		public static WebElement email;
	//		@FindBy(id="pass")
	//		public static WebElement password;
	//		@FindBy(name="login")
	//		public static WebElement login;
	//		

	//	//using find elements..fb
	//	
	//	public static WebElement email(WebDriver driver) {
	//		return driver.findElement(By.id("email"));
	//		
	//		
	//	}
	//	public static WebElement password(WebDriver driver) {
	//		return driver.findElement(By.id("pass"));
	//		
	//		
	//	}
	//	
	//	public static WebElement login(WebDriver driver) {
	//		return driver.findElement(By.name("login"));
	//		
	//		
	//	}
	//	




















	//	
	//	//using annotations
	//	@FindBy(name="email") 
	//	public static WebElement username;
	//	
	//	@FindBy(name="password") 
	//	public static WebElement password;
	//	
	//	@FindBy(id="submitBTN") 
	//	public static WebElement loginbutton;
	//	
	//	
	//	
	//	
	//	//using find elements
	////	public static  WebElement username(WebDriver driver) {
	////		 return driver.findElement(By.name("email"));
	////		
	////	}
	////
	////	public static WebElement password(WebDriver driver) {
	////		 return driver.findElement(By.name("password"));
	////		
	////	}
	////	
	////	public static  WebElement loginbutton(WebDriver driver) {
	////		 return driver.findElement(By.id("submitBTN"));
	////		
	//		
	////	}
}
