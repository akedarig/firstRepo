package FB;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class FBlogin extends LoginRepo {

public static void main(String[] args) throws InterruptedException, IOException {

		FBlogin fblogin = new FBlogin();

		fblogin.LaunchBrowser();

	}

public void LaunchBrowser() throws InterruptedException, IOException {


		

		String title=LaunchDriver.driver.getTitle();

		System.out.println(title);

		

		Map<Double,List<String>> map = xl_login();

		System.out.println(map.get(10.0).get(0));

		System.out.println(map.get(10.0).get(1));

	

		LaunchDriver.driver.findElement(userName).sendKeys(map.get(10.0).get(0));

		LaunchDriver.driver.findElement(password).sendKeys(map.get(10.0).get(1));


		LaunchDriver.driver.findElement(By.id("email")).clear();

		LaunchDriver.driver.findElement(By.id("pass")).clear();

		LaunchDriver.driver.quit();

	}

	

	public Map<Double,List<String>> xl_login() throws IOException {

		File file = new File("C:\\Users\\ANIL\\Desktop\\LoginData.xlsx");

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);     

		

		int Lrow = sheet.getPhysicalNumberOfRows();

		int Lcol = sheet.getRow(1).getLastCellNum();

		
		
		Map<Double,List<String>> map = new HashMap<Double, List<String>>();

		List<String> list= null;

		for (int j=0; j<Lrow; j++ )

		{

			XSSFRow row = sheet.getRow(j);

			list = new ArrayList<String>();

			

			for (int k=1; k<Lcol; k++)

			{

				XSSFCell cell = row.getCell(k);

				list.add(cell.getStringCellValue());

				System.out.println(cell.getStringCellValue());

			}

			map.put(sheet.getRow(j).getCell(0).getNumericCellValue(),list);

		} 

		wb.close();

		return map;

		

	}

}
