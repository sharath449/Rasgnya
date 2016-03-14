package Day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Hashset {

	public static void main(String[] args) {
	
		
	Set<String> s=new HashSet<>();

	s.add("Selenium");
	s.add("UFT");
	s.add("Loadrunner");
	s.add("Selenium");
	
	
	System.out.println(s.size());
	Iterator<String> it=s.iterator();
	while (it.hasNext()) {
		String temp = it.next();
		System.out.println(temp);
	}
	

	}

}
