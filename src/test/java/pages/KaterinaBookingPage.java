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
	
	@FindBy(xpath="//a[@class='icon-help booking-help circle-outline searchOptionHelpIcon order-2']")
	public WebElement milesQuestionMark;
	
	@FindBy (xpath="//h4[@class='title']")
	public WebElement messageTitle;

	@FindBy(id = "chkFlexDate")
	public WebElement checkFlexDateBox;

	@FindBy (className = "resetButton")
	public WebElement clearDatesButton;
	
	@FindBy(className = "calenderDepartSpan")
	public WebElement clearDepartDate;
	
	@FindBy(className = "calenderReturnSpan")
	public WebElement clearReturnDate;

	@FindBy(id = "shopWithMiles" )
	public WebElement checkShopMilesBox;

	@FindBy(id = "refundableFlightsOnly" )
	public WebElement checkRefundFaresBox;
	
	@FindBy(id = "adv-search")
	public WebElement advanceSearch;
	
	@FindBy(xpath = "//a[@class='best-fares-help icon-help circle-outline ng-star-inserted']")
	public WebElement faresQuestionMark;
	
	@FindBy(id = "search-error")
	public WebElement searchError;

	@FindBy(xpath = "//a[@class='swapfield d-inline-block icon-swap']")
	public WebElement swapButton;

	@FindBy(xpath = "//input[@id='nearbyAirports']")
	public WebElement nearbyAirports;

	@FindBy(className = "continue-link" )
	public WebElement errorPopMessage;
	
	@FindBy (xpath = "//a[@class='notification icon-notification-icon circle-outline']") //Rod
	public WebElement notificationIcon;

	@FindBy(id = "meetingCode")
	public WebElement eventCode;
		
	
	
}
