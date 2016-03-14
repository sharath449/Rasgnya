package Day13;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class linkupload {

	
	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.52.0")).click();
		Sleeper.sleepTightInSeconds(10);
		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\selenium.exe");

	}

}
