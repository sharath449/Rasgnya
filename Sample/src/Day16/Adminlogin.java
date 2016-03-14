package Day16;

import org.testng.annotations.Test;

import Day15.orangehrmmaster;

public class Adminlogin {
	@Test
	public  void Adminlogin() 
	{
		orangehrmmaster oh=new orangehrmmaster();
		oh.launch(oh.url);
		oh.login(oh.u, oh.p);
		oh.logout();
		oh.close();
		
		
		

	}

}
