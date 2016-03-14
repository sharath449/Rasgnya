package Day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowncheck {

	public static void main(String[] args) {
		int fromcitycount,tocitycount;
		boolean cityexist = false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com");
		//id of from city
		Select from=new Select(driver.findElement(By.id("fromCity")));
		List<WebElement> fromcity=from.getOptions();
		fromcitycount = fromcity.size();
		for (int i = 0; i < fromcitycount; i++) 
		{
			from.selectByIndex(i);
			String frm=fromcity.get(i).getText();
			//id of to city
			Select to=new Select(driver.findElement(By.id("toCity")));
			List<WebElement> tocity=to.getOptions();
			tocitycount=tocity.size();
			for (int j = 0; j < tocitycount; j++) {
				to.selectByIndex(j);
				String toc=tocity.get(j).getText();
				if (frm==toc)
				{
					cityexist = true;
					break;
				}
				else
				{
					cityexist = false;
					
				}
			}
			if (cityexist)
			{
				System.out.println("Flyfromcity check fail:"+frm+"is present in tocity list");
				break;
			}
			else
			{
				System.out.println("Flyfromcity check pass:"+frm+"is not present in tocity list");
			}
			
		}

	}

}
