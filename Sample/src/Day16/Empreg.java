package Day16;

import org.testng.annotations.Test;

import Day15.orangehrmmaster;

public class Empreg {

	@Test
	public  void empreg() 
	{
		orangehrmmaster oh=new orangehrmmaster();
		oh.launch(oh.url);
		oh.login(oh.u, oh.p);
		oh.empreg("Rasagnya", "US");
		oh.logout();
		oh.close();
		

	}

}
