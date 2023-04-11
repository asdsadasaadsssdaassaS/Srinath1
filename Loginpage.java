package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
  WebDriver driver;
  
  //Object Repository
  By username= By.name("username");
  By password= By.name("password");
  By loginbutton= By.xpath("//button[@type='submit']");

 public void passdriver(WebDriver driver1)
 {
	 this.driver=driver1; //id123
 }
  public void Login(String Username,String Password) 
  {
	  driver.findElement(username).sendKeys(Username);
	  driver.findElement(password).sendKeys(Password);
	  driver.findElement(loginbutton).click();
  }
  
}
