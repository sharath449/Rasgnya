package Day17;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class orgmaster 
{
	public static WebDriver driver;
	static String url="http://opensource.demo.orangehrm.com";
	static String Expval,Actval; 
	static String u="Admin";
	static String p="admin";
	static String f="Rasagnya";
	static String l="The great";
	static String uname="Rasagnya123";
	static String pwd="Rasagnya123";
	static String cpwd="Rasagnya123";
	static boolean flag=false;
	@BeforeSuite
	public void lanchbr()
	{
		Expval="btnLogin";
		driver=new FirefoxDriver();
		driver.get(url);
		Actval=driver.findElement(By.id("btnLogin")).getAttribute("id");
		Assert.assertEquals(Actval,Expval,"Launch App Failed");
	}
	
	@AfterSuite
	public void close()
	{
		driver.quit();
	}
	@BeforeTest
	public void login()
	{
		Expval="Welcome Admin";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		Actval=driver.findElement(By.linkText("Welcome Admin")).getText();
		Assert.assertEquals(Actval,Expval,"login failed");
	}
	@AfterTest
	public void logout()
	{
		Expval="btnLogin";
		driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.linkText("Logout")).click();
		Sleeper.sleepTightInSeconds(5);
		Actval=driver.findElement(By.id("btnLogin")).getAttribute("id");
		Assert.assertEquals(Actval,Expval,"Launch App Failed");
	}
	

}
