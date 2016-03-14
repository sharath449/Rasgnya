package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginTest 
{

	@Test
	public void adminlogintesst()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com");
		
		loginPage ln=PageFactory.initElements(driver, loginPage.class);
		
		ln.login("Admin", "admin");
	}
}
