package Genric;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Utility implements Frameworkconstant{

	public static WebDriver driver;
	
	
	public Properties prop() throws IOException {
		
		FileInputStream fis = new FileInputStream(prop_path);
		Properties p = new Properties();
	    p.load(fis);
		
	    return p;
	}
}
