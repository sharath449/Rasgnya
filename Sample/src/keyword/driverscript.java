package keyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import Day15.orangehrmmaster;

public class driverscript
{
	@Test
	public void driver() throws IOException
	{
		orangehrmmaster admin=new orangehrmmaster();
		String result = null;
		String xlpath="C:\\Users\\Dell\\Desktop\\Keyword.xlsx";
		
		FileInputStream fi = new FileInputStream(xlpath);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws1 = wb.getSheet("Testcase");
		XSSFSheet ws2 = wb.getSheet("Teststeps");

		int tccount = ws1.getLastRowNum();
		int tscount = ws2.getLastRowNum();
		System.out.println(tccount);
		System.out.println(tscount);
		

		for (int i = 1; i <= tccount; i++) 
		{
			String tcid = ws1.getRow(i).getCell(0).getStringCellValue();
			String exec = ws1.getRow(i).getCell(2).getStringCellValue();
			System.out.println(exec);
			if (exec.equalsIgnoreCase("Y"))
			{
				for (int j = 1; j <= tscount; j++) 
				{
					String tctsid = ws2.getRow(j).getCell(0).getStringCellValue();
					if (tcid.equalsIgnoreCase(tctsid))
					{
						String keyword = ws2.getRow(j).getCell(3).getStringCellValue();
						switch (keyword) {
						case "Launch":
							result = admin.launch(admin.url);
							break;
						case "login":
							result = admin.login(admin.u, admin.p);
							break;
						case "logout":
							result = admin.logout();
							break;
						case "Empreg":
							result = admin.empreg("praveena","praveena");
							break;
						}
						System.out.println(result);
						if (result.equalsIgnoreCase("Pass"))
						{
							ws2.getRow(j).createCell(4).setCellValue("PASS");
						} else
						{
							ws2.getRow(j).createCell(4).setCellValue("FAIL");
						}
						ws1.getRow(i).createCell(3);
						if (!ws1.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("FAIL")) {
							ws1.getRow(i).createCell(3).setCellValue(result);
						}
					}
					
					
				}

			}
			else
				ws1.getRow(i).createCell(3).setCellValue("Blocked");

		}

		FileOutputStream fo = new FileOutputStream("C:\\Users\\Dell\\Desktop\\Keyword1.xlsx");
		wb.write(fo);
		wb.close();
       }
      
}




		
	


