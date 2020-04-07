import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {
	@Test
	public void f() {

		try {
			String path = "E:\\Satish\\Automation\\Selenium\\cor\\cor\\src\\main\\java\\TestData\\myProperty.properties";
			File F = new File(path);
			FileInputStream fis = new FileInputStream(F);
			Properties p = new Properties();
			p.load(fis);
			System.out.println("------------"+p.getProperty("un"));

			String strExcel="E:\\Satish\\Automation\\Selenium\\cor\\cor\\src\\main\\java\\TestData\\Book1.xlsx";
			File excel=new File(strExcel);
			FileInputStream excelInput=new FileInputStream(excel);
			XSSFWorkbook wb=new XSSFWorkbook(excelInput);
			XSSFSheet sh=wb.getSheet("Sheet1");
		short col=sh.getRow(0).getLastCellNum();	
		int row=sh.getLastRowNum();
		for(int i=0;i<row+1;i++)
		{
			for(int j=0;j<col;j++)
			{
String cellvalue=				sh.getRow(i).getCell(j).getStringCellValue();
		System.out.println(cellvalue);
			}
		}
		wb.close();
			/*
			 * //wb.close(); String strExcel1=
			"E:\\Satish\\Automation\\Selenium\\cor\\cor\\src\\main\\java\\TestData\\Book1.xlsx";
			 * File excel1=new File(strExcel1);
			 */

			/*
			 * FileOutputStream fos=new FileOutputStream(excel); //wb=new
			 * XSSFWorkbook(excelInput);
			 * 
			 * XSSFCell cell= sh.createRow(row+1).createCell(2);
			 * cell.setCellValue("Finally Done"); wb.write(fos); System.out.println("Done");
			 */		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
