package Pages;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;

public class Skillspage {

	 WebDriver driver;
	 By Admin=By.xpath("//span[text()='Admin']");
	 By Qualifications=By.xpath("//span[text()='Qualifications ']");
	 By Skills=By.xpath("//a[text()='Skills']");
	 By Addbutton=By.xpath("//button[text()=' Add ']");
	 By skillname=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	 By skilldesc=By.xpath("//textarea[ @placeholder='Type description here']");
	 By savebutton=By.xpath("//button[text()=' Save ']");
	 
	 
	 public void passdriver(WebDriver driver1)
	 {
		 this.driver=driver1;
	 }
	 
	 public void navigateskills()
	 {
		 driver.findElement(Admin).click();
		 driver.findElement(Qualifications).click();
		 driver.findElement(Skills).click();
		 
		
	 }
	 
	 public void addskills(String Skillname,String Skilldesc) throws InterruptedException
	 {
		
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 driver.findElement(Addbutton).click();
		 driver.findElement(skillname).sendKeys(Skillname);
			driver.findElement(skilldesc).sendKeys(Skilldesc);
			
			Thread.sleep(5000);
			driver.findElement(savebutton).click();
	 }
	 
	 public void addskills1(DataTable datatable) throws InterruptedException
	 {
		 
		 List<Map<String, String>> SkillsData=datatable.asMaps(String.class,String.class);
			
			for(int i=0;i<SkillsData.size();i++) {
			
			String SkillName=SkillsData.get(i).get("SkillName");
			String SkillDescr=SkillsData.get(i).get("Skilldesc");
			
			driver.findElement(Addbutton).click();
			driver.findElement(skillname).sendKeys(SkillName);
			driver.findElement(skilldesc).sendKeys(SkillDescr);
				
			Thread.sleep(5000);
			driver.findElement(savebutton).click();
	 }
	 }
}
