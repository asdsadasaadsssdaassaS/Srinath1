package Pages;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;

public class Jobspage {

	WebDriver driver;
	By Admin= By.xpath("//span[text()='Admin']");
	By Jobs= By.xpath("//span[text()='Job ']");
	By Jobtitles=By.xpath("//a[text()='Job Titles']");
	By Addbutton=By.xpath("//button[text()=' Add ']");
	By Jobtitle=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By Jobdesc=By.xpath("//textarea[ @placeholder='Type description here']");
	By Jobnote=By.xpath("//textarea[@placeholder='Add note']");
	
	By Savebutton=By.xpath("//button[text()=' Save ']");
	
	public void passdriver(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void addjobs(String jobtitle,String jobdesc,String jobnote) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(Admin).click();
        driver.findElement(Jobs).click();
        driver.findElement(Jobtitles).click();
        driver.findElement(Addbutton).click();
        driver.findElement(Jobtitle).sendKeys(jobtitle);
        driver.findElement(Jobdesc).sendKeys(jobdesc);
        driver.findElement(Jobnote).sendKeys(jobnote);
				  
		Thread.sleep(5000);
		driver.findElement(Savebutton).click();
	}
	
	public void addjobs1(DataTable datatable) throws InterruptedException
	{
List<Map<String, String>> Jobsdata=datatable.asMaps(String.class,String.class);
		
		for(int i=0;i<Jobsdata.size();i++) {
		
		String JobTitle=Jobsdata.get(i).get("JobTitle");
		String JobDesc=Jobsdata.get(i).get("JobDesc");
		String JobNote=Jobsdata.get(i).get("JobNote");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(Admin).click();
        driver.findElement(Jobs).click();
        driver.findElement(Jobtitles).click();
        driver.findElement(Addbutton).click();
        driver.findElement(Jobtitle).sendKeys(JobTitle);
        driver.findElement(Jobdesc).sendKeys(JobDesc);
        driver.findElement(Jobnote).sendKeys(JobNote);
				  
		Thread.sleep(5000);
		driver.findElement(Savebutton).click();
	}
	}
}
