package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import constant.Constants;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;

	public static String getStringData(int i, int j, String sheet) throws IOException 
	{
		String file_path = Constants.TESTDATAFILE;
		f=new FileInputStream(file_path);
		w= new XSSFWorkbook(f);
		s = w.getSheet(sheet);
		Row r= s.getRow(i);
		Cell c= r.getCell(j);
		return c.getStringCellValue();
	}
	public static String getIntegerData(int i, int j, String sheet) throws IOException
	{
		String file_path = Constants.TESTDATAFILE;
		f=new FileInputStream(file_path);
		w= new XSSFWorkbook(f);
		s = w.getSheet(sheet);
		Row r= s.getRow(i);
		Cell c= r.getCell(j);
		int x= (int) c.getNumericCellValue();
		return String.valueOf(x);
	}
}