package Day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelops {
	
	public static void main(String[] args) throws IOException
	{
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("http://google.com");
		
		FileInputStream f=new FileInputStream("C:\\Users\\Dell\\Desktop\\Rasagnya.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int Rc=ws.getLastRowNum();
//		System.out.println(Rc);
		
//		XSSFRow r=ws.getRow(1);
//		System.out.println(r.getCell(1).getStringCellValue());
		
		for (int i = 0; i <= Rc; i++) 
		{

			XSSFRow r=ws.getRow(i);
			String uid=r.getCell(0).getStringCellValue();
			String pwd=r.getCell(1).getStringCellValue();
			System.out.println(uid+" "+pwd);
			XSSFCell c=r.createCell(2);
			c.setCellValue("pass");
			
		}
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Dell\\Desktop\\Rasagnya1.xlsx");
		wb.write(fo);
		wb.close();
		
	}
	
}

