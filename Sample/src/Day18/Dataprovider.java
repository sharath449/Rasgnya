package Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Dataprovider 
{
	@Test(dataProvider="userdata")
	public void login(String u,String p)
	{
		System.out.println(u+" "+p);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com");
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		driver.close();
	}
	
	@DataProvider
	public Object[][] userdata()
	{
		Object[][] data=new Object[2][2];
		
		data[0][0]="Admin";
		data[0][1]="admin";
		
		data[1][0]="hamsini";
		data[1][1]="hamsini123";
		
		return data;
	}
}
