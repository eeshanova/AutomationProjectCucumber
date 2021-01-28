package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class KaterinaBookingPage {
	
	public KaterinaBookingPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "fromAirportName")
	public WebElement fromAirport;
	
	@FindBy (id = "search_input")
	public WebElement searchWindow;
	
	@FindBy(id = "toAirportName")
	public WebElement toAirport;
	
	@FindBy(xpath = "//div[@class='search-results d-none pl-1 d-block']/ul/li")
	public List<WebElement> cityFullNameOptions;
	
	@FindBy(xpath="//input[@name = 'fromCity']")
	public WebElement actualFromCity;
	
	@FindBy(xpath="//input[@name = 'fromAirportCode']")
	public WebElement actualFromAirportCode;
	
	@FindBy(xpath="//input[@name = 'toCity']")
	public WebElement actualToCity;
	
	@FindBy(xpath="//input[@name = 'arrivalCity']")
	public WebElement actualToAirportCode;
	
	@FindBy(css = "#ui-list-selectTripType1")
	public WebElement oneWay;
	
	@FindBy(className = "travelDateSelectionView")
	public WebElement calendarWindow;
	
	@FindBy (xpath = "//a[@class='dl-datepicker-1']")
	public WebElement nextMonthButton;
	
	@FindBy (xpath = "//span[@class='dl-datepicker-month-0']")
	public WebElement firstMonthOption;
	
	@FindBy (xpath = "//span[@class='dl-datepicker-month-1']")
	public WebElement secondMonthOption;
	
	public void pickMonth(String month) {
		while(!firstMonthOption.getText().equals(month) && !secondMonthOption.getText().equals(month)) {
			nextMonthButton.click();
		}
	}
	
	public WebElement getDateMonth(String date, String month) {
		String xpath = "//a[starts-with(@aria-label,'" + date + month + "')]";
		return Driver.getDriver().findElement(By.xpath(xpath));		
	}
	
	@FindBy(className = "donebutton")
	public WebElement doneButton;
	
	@FindBy(id = "btn-book-submit")
	public WebElement submitButton;
	
}
