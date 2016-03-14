package Day8;

import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class statictable {

	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://money.rediff.com/tools/forex");
		driver.manage().window().maximize();
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='leftcontainer']/div[2]/div[2]/table/tbody/tr"));
		
		System.out.println(rows.size());
		
		
		for (int i = 0; i < rows.size(); i++) 
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			String cells=cols.get(1).getText();
			System.out.println(cells);
//			for (int j = 0; j < cols.size(); j++) 
//			{
//				String cells=cols.get(0).getText();
//				System.out.println(cells);
//			}
			
		}
	}

}
