

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Linkexist {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("Http://bing.com");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++)
		{
			if (links.get(i).getText().equals("Maps")) 
			{
				System.out.println("Maps link is exist");
				
			}
			
		}

	}

}
