package step_definitions;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.KaterinaBookingPage;
import pages.KaterinaResultsPage;
import utilities.BrowserUtils;
import utilities.Driver;


public class KaterinaStepDefs {

	@Given("The User is on the homepage")
	public void theUserIsOnTheHomepage() {
		
//		Driver.getDriver().get("https://www.delta.com/");
		
	}

	@When("The user clicks on From Airport and types either a code or a full city name")
	public void the_user_clicks_on_from_airport_and_types_either_a_code_or_a_full_city_name() {
		KaterinaBookingPage bp = new KaterinaBookingPage();
		BrowserUtils.waitForPageToLoad(10);
	    bp.fromAirport.sendKeys("Atlanta");
	    BrowserUtils.waitFor(3);
	    bp.searchWindow.click();
	    for (WebElement elementFrom: bp.cityFullNameOptions) {

			if(elementFrom.getText().contains("Atlanta")) {
			elementFrom.click();
			break;
			}
		}
	}
	
	@When("The user clicks on To Airport and types either a code or a full city name")
	public void the_user_clicks_on_to_airport_and_types_either_a_code_or_a_full_city_name() {
		 KaterinaBookingPage bp = new KaterinaBookingPage();
		 bp.toAirport.sendKeys("IAD");
		 BrowserUtils.waitFor(3);
			bp.searchWindow.click();
			
				for (WebElement elementTo: bp.cityFullNameOptions) {
				if(elementTo.getText().contains("IAD")) {
				elementTo.click();
				break;
				}
			}
	}
	
	@Then("The typed city code or names should match with displayed ones")
	public void the_typed_city_code_or_names_should_match_with_displayed_ones() {
		KaterinaBookingPage bp = new KaterinaBookingPage();
			
		assertTrue(bp.actualFromCity.getAttribute("value").contains("Atlanta") || 
								bp.actualFromCity.getAttribute("value").contains("ATL"));
		assertTrue(bp.actualToAirportCode.getAttribute("value").contains("Washington") || 
								bp.actualToAirportCode.getAttribute("value").contains("IAD") );
	}
	
	@When("The user clicks on One Way option")
	public void the_user_clicks_on_one_way_option() {
		KaterinaBookingPage bp = new KaterinaBookingPage();
		Driver.getDriver().findElement(By.id("selectTripType-val")).click();
		BrowserUtils.hover(bp.oneWay);
		bp.oneWay.click();
	    
	}

	@When("The user chooses the departure date and clicks on submit")
	public void chooses_the_departure_date_and_clicks_on_submit() {
		KaterinaBookingPage bp = new KaterinaBookingPage();
		bp.calendarWindow.click();
		
		bp.pickMonth("February");
		bp.getDateMonth("1 ", "February").click();
		bp.doneButton.click();
		bp.submitButton.submit();
	    
	}

	@Then("The results page contains {string}")
	public void the_results_page_displays_in_the_header(String string) {
		BrowserUtils.waitForTitleContains("Flexible Date Flight Result : Find & Book Airline Tickets : Delta Air Lines", 10);
		assertTrue(Driver.getDriver().getPageSource().contains(string));
	    
	}
	
	@Then("The results page contains {string} flights")
	public void theResultsPageContainsFlights(String string) {
		BrowserUtils.waitForTitleContains("Flight Results : Find & Book Airline Tickets : Delta Air Lines", 10);
		assertTrue(Driver.getDriver().getPageSource().contains(string));
	}
	
	@When("The user clicks on question mark next to Shopping with Miles")
	public void theUserClicksOnQuestionMarkNextToShoppingWithMiles() {
		
		KaterinaBookingPage bp = new KaterinaBookingPage();
		bp.milesQuestionMark.click();
	    
	}

	@Then("The pop up window comes up with Info")
	public void thePopUpWindowComesUpWithInfo() {
		KaterinaBookingPage bp = new KaterinaBookingPage();
		assertEquals(bp.messageTitle.getText(), "Shop with Miles");
	}
	
	@When("The user clicks and types {string} as from Airport and {string} as to Airport")
	public void theUserClicksAndTypesAnd(String fromAirport, String toAirport) {
		KaterinaBookingPage bp = new KaterinaBookingPage();
		BrowserUtils.waitForPageToLoad(10);
	    bp.fromAirport.sendKeys(fromAirport);
	    BrowserUtils.waitFor(3);
	    bp.searchWindow.click();
	    for (WebElement elementFrom: bp.cityFullNameOptions) {

			if(elementFrom.getText().contains(fromAirport)) {
			elementFrom.click();
			break;
			}
		}
	    
	    bp.toAirport.sendKeys(toAirport);
		 BrowserUtils.waitFor(3);
			bp.searchWindow.click();
			
				for (WebElement elementTo: bp.cityFullNameOptions) {
				if(elementTo.getText().contains(toAirport)) {
				elementTo.click();
				break;
				}
			}
	    
	}

	@When("The user chooses {string} , {string} for departure and {string} , {string} for return")
	public void theUserChoosesAnd(String deptMonth, String deptDate, String arrMonth, String arrDate) {
		KaterinaBookingPage bp = new KaterinaBookingPage();
		bp.calendarWindow.click();
		
		bp.pickMonth(deptMonth);
		bp.getDateMonth(deptDate + " ", deptMonth).click();
	
		bp.pickMonth(arrMonth);
		bp.getDateMonth(arrDate + " ", arrMonth).click();
		bp.doneButton.click();
		
	    
	}

	@When("The user clicks on My dates are flexible box and clicks on submit")
	public void theUserClicksOnMyDatesAreFlexibleBoxAndClicksOnSubmit() {

		KaterinaBookingPage bp = new KaterinaBookingPage();
		
		if(!(bp.checkFlexDateBox).isSelected()) {
			BrowserUtils.jsClick(bp.checkFlexDateBox);				
			}
		
		BrowserUtils.waitFor(3);
		bp.submitButton.submit();
	    
	}


	@Then("The user clicks on clear button in the calendar window to clear the dates")
	public void theUserClicksOnClearButtonInTheCalendarWindowToClearTheDates() {
		KaterinaBookingPage bp = new KaterinaBookingPage();
		bp.calendarWindow.click();
		bp.clearDatesButton.click();
		bp.doneButton.click();
		assertTrue(bp.clearDepartDate.getText().equals("Depart"));
		assertTrue(bp.clearReturnDate.getText().equals("Return"));
		
	   
	}
	
	@When("The user clicks on Shopping with Miles checkbox")
	public void theUserClicksOnShoppingWithMilesCheckBox() {
		
		KaterinaBookingPage bp = new KaterinaBookingPage();
		
		if(!(bp.checkShopMilesBox).isSelected()) {
			BrowserUtils.jsClick(bp.checkShopMilesBox);				
			}
		
		BrowserUtils.waitFor(3);
	   
	}

	@Then("The Refundable Fares and My dates are flexible checkboxes are not selectable")
	public void theRefundableFaresAndMyDatesAreFlexibleCheckboxesAreNotSelectable() {
		
		KaterinaBookingPage bp = new KaterinaBookingPage();
		assertTrue(!bp.checkFlexDateBox.isEnabled());
		assertTrue(!bp.checkRefundFaresBox.isEnabled());
	}

	@Then("The user clicks on Advanced Search and the {string} is not visible")
	public void theUserClicksOnAdvancedSearchAndTheIsNotVisible(String string) {
	    KaterinaBookingPage bp = new KaterinaBookingPage();
	    bp.advanceSearch.click();
	    assertTrue(!(Driver.getDriver().getPageSource()).contains(string));
	}
	
	@When("The user clicks on My dates are flexible checkbox")
	public void theUserClicksOnMyDatesAreFlexiblesCheckbox() {
KaterinaBookingPage bp = new KaterinaBookingPage();
		
		if(!(bp.checkFlexDateBox).isSelected()) {
			BrowserUtils.jsClick(bp.checkFlexDateBox);				
			}
		
		BrowserUtils.waitFor(3);
	}
}

