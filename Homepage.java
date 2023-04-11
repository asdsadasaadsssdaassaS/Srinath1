package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	WebDriver driver;
	By Welcome=By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
	By Logout=By.xpath("//a[text()='Logout']");
	
	public void passdriver(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void logout()
	{
		driver.findElement(Welcome).click();
		driver.findElement(Logout).click();
	}

}
