package Day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Dynamictables {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/index.php/auth/login");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.linkText("PIM")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.linkText("Employee List")).click();
		Sleeper.sleepTightInSeconds(5);
		//xpath of rows
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 1; j < cols.size(); j++) 
			{
				String cells=cols.get(j).getText();
				System.out.println(cells);
				if (cells.equals("012345")) 
				{
					cols.get(0).click();
					
				}
				
			}
		}
		

	}

}
