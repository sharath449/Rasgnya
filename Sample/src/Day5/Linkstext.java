package Day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkstext {

	public static void main(String[] args) {
		int j=0;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		//getText()
		for (int i = 0; i < links.size(); i++) 
		{
//			System.out.println(links.get(i).getText());
//			if (links.get(i).getText().equals("")) 
//			{
//				j=j+1;
//				
//			}
//			if (!links.get(i).getText().equals("")) 
//			{
//				System.out.println(links.get(i).getText());
//				
//			}
			
			if (!links.get(i).getText().isEmpty()) {
				System.out.println(links.get(i).getText());
			}
			
		}
//		System.out.println(j);
		
	}

}
