package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Dell/Desktop/cars.html");
		
		Select drop=new Select(driver.findElement(By.xpath("html/body/select")));
		
		drop.selectByIndex(2);
		
//		drop.selectByVisibleText("Saab");
		
		//drop.selectByValue("volvo");
	}

}
