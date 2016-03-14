package Day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Calenderprog {

	public static void main(String[] args) 
	{
		 String doj="7/August/2016";
		 String[] temp=doj.split("/");
		 String day=temp[0];
		 String month=temp[1];
		 String year=temp[2];
		 boolean flag = false;
		 WebDriver driver=new FirefoxDriver();
		 driver.get("http://www.cleartrip.com/");
		 Sleeper.sleepTightInSeconds(15);
		 driver.findElement(By.id("DepartDate")).click();
		 
		 
		 String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		 
		 System.out.println(calyear);
		 
		 while(!year.equals(calyear))
		 {
			 driver.findElement(By.className("nextMonth ")).click();
			 calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		 }
		 
		 String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		 
		 while (!month.equals(calmonth))
		 {
			 driver.findElement(By.className("nextMonth ")).click();
			 calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			
		}
		 
		 List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr"));
		 
		 for (int i = 0; i < rows.size(); i++)
		 {
			 List<WebElement> rowcells=rows.get(i).findElements(By.tagName("td"));
			 
			 for (int j = 0; j < rowcells.size(); j++)
			 {
				 if (rowcells.get(j).getText().equals(day))
				 {
					rowcells.get(j).click();
					flag=true;
					break;
				 }
				
			}
			 if (flag) 
			 {
				 break;
				
			}
			
		}
				 

	}

}
