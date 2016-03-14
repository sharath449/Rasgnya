package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LaunchingFirefox {

	
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		//opening google.com , 1) get()
		driver.get("http://google.com");
		//maximizing the browser
		driver.manage().window().maximize();
		

	}

}
