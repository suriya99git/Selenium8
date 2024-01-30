package Genric;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcel implements Frameworkconstant {

	@Test(dataProvider = "data1")
	public void read(String s1,String s2,String s3,String s4,String s5) {
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
	
	
	@DataProvider(name = "data1")
	public static  Object[][] readData() throws EncryptedDocumentException, IOException{
		
		FileInputStream fis = new FileInputStream(excel_path);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet("Sheet1");
		int row_size = s.getPhysicalNumberOfRows();
		int coloum_size = s.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] o = new Object[row_size][coloum_size];
		
		for (int i = 0; i < row_size; i++) {
			
			for (int j = 0; j < coloum_size; j++) {
				
				o[i][j] = s.getRow(i).getCell(j).toString();
			}
		}
		
		return o;
	}
}
