package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class EmpReg {

	public static void main(String[] args) throws InterruptedException 
	{
		ProfilesIni Pr=new ProfilesIni();
//		FirefoxProfile fp=new FirefoxProfile();
		
//		fp=Pr.getProfile("Rasagnya");
		
		FirefoxProfile fp=Pr.getProfile("Rasagnya");
		 String Expvalue="Rasagnya Vangeti";
		 WebDriver driver=new FirefoxDriver(fp);
		 driver.get("http://opensource.demo.orangehrm.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin");
		 driver.findElement(By.id("btnLogin")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.linkText("PIM")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.linkText("Add Employee")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.id("firstName")).sendKeys("Rasagnya");
		 driver.findElement(By.id("lastName")).sendKeys("Vangeti");
		 
		// isSelected 
		 if (!driver.findElement(By.id("chkLogin")).isSelected())
		 {
			 
			 driver.findElement(By.id("chkLogin")).click();
		}
		 
		 driver.findElement(By.id("user_name")).sendKeys("Rasagnya123");
		 driver.findElement(By.id("user_password")).sendKeys("Rasagnya");
		 driver.findElement(By.id("re_password")).sendKeys("Rasagnya");
		 
		 driver.findElement(By.id("btnSave")).click();
		 //Xpath usage
		 String Actvalue=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		 if (Expvalue.equalsIgnoreCase(Actvalue))
		 {
			 System.out.println("Pass");
		}
		 else
		 {
			 System.out.println("Fail");
		 }
	}

}
