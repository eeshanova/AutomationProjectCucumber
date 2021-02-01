package pages;

import java.util.List;
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
	
	@FindBy(xpath = "//button[@class='cookie-close-icon float-right circle-outline']")
	public WebElement cookieClose;

	@FindBy (xpath = "//ul[@class='d-none d-md-block']/li[3]/a[contains(text(),'News Hub')]")
	public WebElement newsHub;
	
	@FindBy (xpath = "//h3[@class='block-title'][contains(text(),'Featured News')]")
	public WebElement fNews;
	
	@FindBy (xpath = "//ul[@class='d-none d-md-block']/li/a")
	public List<WebElement> footerLinks;

	@FindBy (xpath = "//div[@class='siteAccessModalButtons primaryButton activeButton buttonDiv sAminWidth150PX']")
	public WebElement visitButton;
	
	@FindBy (xpath = "//div[@class='width-25-per float-left']//a")
	public List<WebElement> languages;
	
	@FindBy (xpath = "//div[@class='width-100-per float-left']")
	public List<WebElement> countries;
	
	@FindBy (id = "en-us")
	public WebElement englishUS;
	
	@FindBy (id = "en-in")
	public WebElement englishIndia;
	
	@FindBy (id = "in-in")
	public WebElement englishLang;
	
	@FindBy (id = "ui-dialog-title-cookieFocusedModalDiv")
	public WebElement cookieConfirmation;

	@FindBy(xpath = "//a[@href='/us/en/booking-information/optional-fees-services']")
	public WebElement optionanlFees;
	
	@FindBy(xpath="//div[contains(@class, 'col-md-12')]/a[@href='/us/en/corporate-travel/meeting-services']")
	public WebElement meetingServices;
}
