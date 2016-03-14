package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmpReg extends orgmaster
{
	
	@Test
	public void empreg()
	{
		Expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("btnSave")).click();
		Actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(Actval,Expval,"Emp reg failed");
		
		
	}

}
