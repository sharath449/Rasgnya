package Day12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Synchronization {

	public static void main(String[] args) {
		//implicitwait
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.24hourfitness.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div[1]/div[5]/a")).click();
		
		

	}

}
