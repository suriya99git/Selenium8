package selenium8;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Genric.Base;
import Genric.ReadExcel;
import Pom.RegisterPage;
import Pom.WelcomePage;

public class Tc_001_Test extends Base {

	@Test(dataProvider = "data")
	public void case1(String s1,String s2,String s3,String s4,String s5) {
		
		WelcomePage w = new WelcomePage(driver);
		
		w.getRegLink().click();
		
		RegisterPage r = new RegisterPage(driver);
		
		r.getFirstName().sendKeys(s1);
		r.getLastName().sendKeys(s2);
		r.getEmail().sendKeys(s3);
		r.getPassword().sendKeys(s4);
		r.getConfirmPassword().sendKeys(s5);
		
	}
	
	@DataProvider(name="data")
	public Object[][] excelData() throws EncryptedDocumentException, IOException {
		
		return ReadExcel.readData();
	}
}
