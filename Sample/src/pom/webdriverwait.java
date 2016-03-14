package pom;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class webdriverwait 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://24hourfitness.com");
	}
	@Test(enabled=false)
	public void waittest()
	{
		WebDriverWait mywait=new WebDriverWait(driver,40);
//		mywait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@id='slide-1']")));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='slide-2']")));
		driver.findElement(By.xpath(".//*[@id='slide-2']")).click();
	}
	@Test
	public void fluentwait()
	{
		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver).withTimeout(40, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='slide-2']")));
		driver.findElement(By.xpath(".//*[@id='slide-2']")).click();
	}

}
