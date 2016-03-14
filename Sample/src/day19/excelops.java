package day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelops 
{
	@Test
	public void excel() throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Dell\\Desktop\\Rasagnya.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		XSSFRow R=ws.getRow(2);
		//counting the rows
		int Rc=ws.getLastRowNum();
		System.out.println(Rc);
		//counting columns
		int cc=R.getLastCellNum();
		System.out.println(cc);
		
		//reading the data from excel
		
		System.out.println(R.getCell(1).getStringCellValue());
		
		//writing the data into cells
		XSSFCell C=R.createCell(2);
		
		C.setCellValue("Pass");
		
		//reading multiple values
		for (int i = 0; i <= Rc; i++) 
		{
			XSSFRow data=ws.getRow(i);
			
			System.out.println(data.getCell(0).getStringCellValue());
			System.out.println(data.getCell(1).getStringCellValue());
			//writing data into execl multiple times 
			XSSFCell celltext=data.createCell(2);
			celltext.setCellValue("pass");
			
		}
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Dell\\Desktop\\Rasagnya1.xlsx");
		wb.write(fo);
		wb.close();
	}

}
