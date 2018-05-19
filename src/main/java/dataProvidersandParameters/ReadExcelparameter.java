package dataProvidersandParameters;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class ReadExcelparameter {
	@Test
	public Object[][] fetchData() throws IOException
	{
		
	//public static void main(String[] args) throws IOException {
		
		//Openwork book
		//Create Lead
		//XSSFWorkbook wbook = new XSSFWorkbook("./Excel/TC2.xlsx");
		
		//Edit Lead
		XSSFWorkbook wbook = new XSSFWorkbook("./Excel/TC2.xlsx");
		
		//open sheet
		XSSFSheet sheet = wbook.getSheet("Sheet1");
		
		//identifying last row
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		
		//identifying last column
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
		
		Object[][] data = new Object [lastRowNum][lastCellNum];
		//reading the data
		for (int i=1;i<=lastRowNum;i++)
		{
			//reaching the row
			XSSFRow row = sheet.getRow(i);
		for (int j=0;j<lastCellNum;j++)
		{
			XSSFCell cell = row.getCell(j);
			data[i-1][j]=cell.getStringCellValue();
		//String stringCellValue = cell.getStringCellValue();
		//System.out.println(stringCellValue);
			System.out.println(data);
		
		}
		wbook.close();
		}
		return data;
		
		
	}

}
