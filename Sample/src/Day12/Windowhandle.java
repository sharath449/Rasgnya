package Day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Windowhandle {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
//		driver.get("http://www.citybank.com/");
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath(".//*[@id='dir-holder']/div[2]/div[2]/a[1]")).click();
		driver.findElement(By.xpath(".//*[@id='footer-list']/li[2]/a")).click();
		
		
		Set<String> s=new HashSet<>();
		//getting window id s
		s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext())
		{
			String id=it.next();
			System.out.println(id);
			System.out.println(driver.getTitle());
			driver.switchTo().window(it.next());
			Sleeper.sleepTightInSeconds(5);
			if (driver.findElement(By.xpath(".//*[@id='maia-nav-x']/div/ul/li[3]/a")).isDisplayed()) 
				
			{
				
				System.out.println(id);
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath(".//*[@id='maia-nav-x']/div/ul/li[3]/a")).click();
				Sleeper.sleepTightInSeconds(5);
				System.out.println(driver.getTitle());
			}
		}

	}

}
