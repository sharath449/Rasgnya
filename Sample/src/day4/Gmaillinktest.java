package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;



public class Gmaillinktest {

	
	public static void main(String[] args) {
		
		String expurl="https://accounts.google.com";
		WebDriver driver=new FirefoxDriver();
		Sleeper.sleepTightInSeconds(10);
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		
		
		String acturl=driver.getCurrentUrl();
		System.out.println(acturl);
		 if (acturl.contains(expurl)) {
			System.out.println("Pass");
		}
		 else
		 {
			 System.out.println("Fail");
		 }
		

	}

}
