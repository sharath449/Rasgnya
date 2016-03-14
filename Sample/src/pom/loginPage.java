package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage 
{
		@FindBy(id="txtUsername")
		WebElement username;
		
		@FindBy(id="txtPassword")
		WebElement password;
		
		@FindBy(id="btnLogin")
		WebElement submit;
		
		public void login(String u,String p)
		{
			username.sendKeys(u);
			password.sendKeys(p);
			submit.click();
		}
		

}
