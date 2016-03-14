package Day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowid {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		
		
		String url1=driver.getCurrentUrl();
		
		
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> s=new HashSet<>();
		s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		while (it.hasNext())
		{
			
			//switchto()
			
			
			String id=it.next();
			System.out.println(id);
			String url2=driver.getCurrentUrl();
			System.out.println(driver.getCurrentUrl());
			driver.switchTo().window(it.next());
			if (!url1.equals(url2)) {
				driver.findElement(By.xpath(".//*[@id='privacyLabel']")).click();
			}
			
		}

	}

}
