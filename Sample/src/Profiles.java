import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Profiles {

	
	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		
		FirefoxProfile fp=pr.getProfile("sandeep");
		
		WebDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com");

	}

}
