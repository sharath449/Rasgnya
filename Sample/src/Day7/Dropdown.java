package Day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Dell/Desktop/cars.html");
		Select drop=new Select(driver.findElement(By.xpath("html/body/select")));
		//getOptions()
		List<WebElement> carslist=drop.getOptions();
		System.out.println(carslist.size());
		
		//reading the values from dropdownlist
		
		
	for (int i = 0; i < carslist.size(); i++) {
		System.out.println(carslist.get(i).getText());
	}
	}

}
