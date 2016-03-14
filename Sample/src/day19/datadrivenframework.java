package day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

import Day15.orangehrmmaster;

public class datadrivenframework 
{
	orangehrmmaster om=new orangehrmmaster();
	@Test
	public void empreg() throws IOException
	{
		
		String res;
		FileInputStream fi=new FileInputStream("C:\\Users\\Dell\\Desktop\\Rasagnya.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet2");
		
		om.launch(om.url);
		
		om.login(om.u, om.p);
		for (int i = 1; i <= ws.getLastRowNum(); i++) 
		{
			XSSFRow R=ws.getRow(i);
			String f=R.getCell(0).getStringCellValue();
			String l=R.getCell(1).getStringCellValue();
			
			res=om.empreg(f, l);
			XSSFCell C=R.createCell(2);
			C.setCellValue(res);
		}
		om.logout();
		om.close();
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Dell\\Desktop\\Rasagnya1.xlsx");
		wb.write(fo);
		wb.close();
	}

}
