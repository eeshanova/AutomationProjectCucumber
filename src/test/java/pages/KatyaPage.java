package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class KatyaPage {
	
	public KatyaPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//a[@class='popular-list-3']")
	public WebElement eCredits;
	
	@FindBy (xpath = "//input[@id='edocumentNum']")
	public WebElement eCreditNumber;
	
	@FindBy (xpath = "//input[@class='cta-secondary-btn edoc_certLookup ng-star-inserted']")
	public WebElement lookUp;
	
	@FindBy (xpath = "//div[@class='errorWrapper']/span[2]")
	public WebElement errorMssg;
	
	@FindBy (xpath = "//ul[@class='d-none d-md-block']/li[3]/a[contains(text(),'News Hub')]")
	public WebElement newsHub;
	
	@FindBy (xpath = "//h3[@class='block-title'][contains(text(),'Featured News')]")
	public WebElement fNews;
	
	
	
	
	
	

	
	
}
