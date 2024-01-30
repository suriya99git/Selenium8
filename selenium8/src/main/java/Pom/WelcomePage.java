package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {

	public WelcomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Register")
	public WebElement RegLink;

	public WebElement getRegLink() {
		return RegLink;
	}
	
	
	
}
