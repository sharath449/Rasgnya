package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Dragdrop {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://snapdeal.com");
		Sleeper.sleepTightInSeconds(5);
		driver.manage().window().maximize();
		
		WebElement mobile=driver.findElement(By.xpath(".//*[@id='leftNavMenuRevamp']/div/div/ul/li[5]/a/span[3]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(mobile).build().perform();
		Sleeper.sleepTightInSeconds(5);
		
		WebElement l2=driver.findElement(By.xpath(".//*[@id='leftNavMenuRevamp']/div/div/ul/li[5]/div/div[1]/div/div/p[4]/a/span"));
		act.moveToElement(l2).build().perform();
		
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath(".//*[@id='leftNavMenuRevamp']/div/div/ul/li[5]/div/div[1]/div/div/p[4]/a/span")).click();
		
		WebElement drop=driver.findElement(By.xpath(".//*[@id='content_wrapper']/div[2]/div[3]/div[1]/div/div[2]/div[8]/div[3]/div/div[1]/a[1]"));
		
		act.dragAndDropBy(drop, 100, 0).build().perform();
		
	}

}
