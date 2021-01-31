package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class SanaCarPage {
	
	public SanaCarPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//input[@id='carPickUpLocation']")
	public WebElement locationSearch;
	
	
	@FindBy (xpath = "//input[@aria-labelledby='carAdvPickUpLocationPlaceHolder']")
	public WebElement advLocationSearch;
	
	
	@FindBy (xpath = "//input[@id='btnSubmit']")
	public WebElement searchButton;
	
	
	@FindBy (xpath = "//button[@id='ck-banner-close']//span[@class='ui-button-text']")
	public WebElement crossButton;
	
	
	@FindBy (xpath = "//input[@id='carPickUpDate']")
	public WebElement pickUp;
	
	
	@FindBy (xpath = "//div[@class='travelLocationDetails grid_1']")
	public WebElement result_Title;
	
	
	@FindBy (xpath = "//a[@id='carAdvancedSearchLink']")
	public WebElement advancedSearch;
	
	
	@FindBy (xpath = "//*[@id='luxury_DeActive']")
	public WebElement luxuryCar;
	
	
	@FindBy (xpath = "//*[@id='carAdvBtnSubmit']")
	public WebElement findCarsButton;
	
	
	@FindBy (xpath = "//*[@id='carListHeader_0']/div/div[1]")
	public WebElement carType;
	
	
	@FindBy (xpath = "//*[@id='searchCarForm']/div[1]/span[3]/a")
	public WebElement errorMessage;
	
	
	@FindBy (xpath = "//label[@id='carPickUpLocation-error']")
	public WebElement errorTag;
}
