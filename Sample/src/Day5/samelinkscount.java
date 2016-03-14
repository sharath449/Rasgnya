package Day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class samelinkscount {

	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("Http://bing.com");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.linkText("Maps"));
		
			if (links.size()>0) 
			{
				for (int j = 0; j < links.size(); j++) {
				System.out.println(links.get(j).getText());
				//getAttribute()
				System.out.println(links.get(j).getAttribute("href"));
				if (j==2)
				{
					links.get(j).click();
					
				}
			}
		}
		

	}

}
