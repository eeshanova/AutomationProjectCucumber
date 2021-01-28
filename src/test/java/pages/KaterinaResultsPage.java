package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class KaterinaResultsPage {
	public KaterinaResultsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (css = "span[class='headingintro']") 
	public WebElement headingInfo;
	
}
