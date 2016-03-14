package Day16;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngng 
{
	@BeforeTest
	public void brlaunch()
	{
		System.out.println("this is program for browser launch");
	}
	@AfterTest
	public void brclose()
	{
		System.out.println("this is program for browser close");
	}
	@BeforeClass
	public void init()
	{
		System.out.println("intiation");
	}
	@AfterClass
	public void close()
	{
		System.out.println("close");
	}
	
	@BeforeMethod
	public void start()
	{
		System.out.println("This is start function");
	}
	@AfterMethod
	public void End()
	{
		System.out.println("This is End function");
	}
	@Test(priority=0)
	public void c()
	{
		System.out.println("c");
	}
	@Test
	public void b()
	{
//		System.out.println("b");
		throw new SkipException("too many functions");
	}
	@Test(priority=2)
	public void a()
	{
		System.out.println("a");
	}

}
