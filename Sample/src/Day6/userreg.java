package Day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import Day15.orangehrmmaster;

public class userreg extends orangehrmmaster {

	public static void main(String[] args)
	{
		String Actun;
		String Expun="rasagnya1234";
		boolean flag = false;
		orangehrmmaster om=new orangehrmmaster();
		om.launch(om.url);
		om.login(om.u, om.p);
		
		driver.findElement(By.linkText("Admin")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.linkText("User Management")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.linkText("Users")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("sharath chandra");
		driver.findElement(By.id("systemUser_userName")).sendKeys("rasagnya1234");
		driver.findElement(By.id("systemUser_password")).sendKeys("rasagnya1234");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("rasagnya1234");
		driver.findElement(By.id("btnSave")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		
		for (int i = 0; i < rows.size(); i++) 
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) 
			{
				Actun=cols.get(1).getText();
				if (Expun.equals(Actun))
				{
					System.out.println("Pass");
					flag=true;
					break;
				}
				else
				{
					flag=false;
				}
				
			}
			if (flag) 
			{
				break;
				
			}
			
		}
		
		om.logout();
		om.close();
	}
}
