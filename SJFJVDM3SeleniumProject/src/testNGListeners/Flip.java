package testNGListeners;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flip {
	public String readExcelData(String excelpath, String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis = new FileInputStream(excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
	Row row = sheet.getRow(rowNo);
	Cell cell = row.getCell(cellNo);
	String data = cell.getStringCellValue();
	return data;
	
	}
	
	public String readPropertyData(String propPath, String key) throws IOException
	{
	FileInputStream fis = new FileInputStream(propPath);
	Properties prop = new Properties();
	prop.load(fis);
	String data = prop.getProperty(key);
	return data;
	
	}

}
