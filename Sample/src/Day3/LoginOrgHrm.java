package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LoginOrgHrm {

	public static void main(String[] args) {
			
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/");
		//2.findelement()  3.findelements() 4.sendkeys()
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		//5.click()
		driver.findElement(By.className("button")).click();
		//pariallinktext()   linktext()
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.partialLinkText("Welcome")).click();
		//waiting statement
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.linkText("Logout")).click();
		
		
		

	}

}
