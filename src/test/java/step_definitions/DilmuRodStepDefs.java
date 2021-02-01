package step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.KaterinaBookingPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class DilmuRodStepDefs {
	
//	@Given("The User is on the homepage")
//	public void theUserIsOnTheHomepage() {
//		
//	}
	
	@When("The user expands Advanced Search and clicks on question mark next to Basic Fares For")
	public void theUserExpandsAdvancedSearchAndClicksOnQuestionMarkNextToBasicFaresFor() {
	    KaterinaBookingPage bp = new KaterinaBookingPage();
	    bp.advanceSearch.click();
	    bp.faresQuestionMark.click();
	    BrowserUtils.waitFor(3);
	}

	@Then("The pop up window comes up with Fares Info")
	public void thePopUpWindowComesUpWithFaresInfo() {
		
		KaterinaBookingPage bp = new KaterinaBookingPage();
		assertEquals(bp.messageTitle.getText(), "Cabin Experiences");
	    
	}
	
	@When("The user inputs numbers instead of letters for From Airport")
	public void theUserInputsNumbersInsteadOfLettersForFromAirport() {
		KaterinaBookingPage bp = new KaterinaBookingPage();
		BrowserUtils.waitForPageToLoad(10);
	    bp.fromAirport.sendKeys("123");
	    BrowserUtils.waitFor(3);
	    
	}

	@Then("The error message {string} is displayed")
	public void theErrorMessageIsDisplayed(String string) {
		KaterinaBookingPage bp = new KaterinaBookingPage();
		assertEquals(bp.searchError.getText(), string);
	    
	}
	
	@Then("The user clicks on red arrow between cities to swap them")
	public void theUserClicksOnRedArrowBetweenCitiesToSwapThem() {
		KaterinaBookingPage bp = new KaterinaBookingPage();

		String cityArrBefore = bp.actualToCity.getAttribute("value");
		String codeArrBefore = bp.actualToAirportCode.getAttribute("value");
		
		bp.swapButton.click();
		
		String cityDeptAfter = bp.actualFromCity.getAttribute("value");
		String codeDeptAfter = bp.actualFromAirportCode.getAttribute("value");
		
		assertTrue(cityDeptAfter.contains(cityArrBefore) || 
				codeDeptAfter.contains(codeArrBefore));
		
	}
	
	@When("The user expands Advanced Search and clicks on Include Nearby Airports checkbox")
	public void theUserExpandsAdvancedSearchAndClicksOnIncludeNearbyAirportsCheckbox() {
		 KaterinaBookingPage bp = new KaterinaBookingPage();
		 bp.advanceSearch.click();
		 BrowserUtils.jsClick(bp.nearbyAirports);

	}

	@Then("The My dates are flexible checkbox is disabled")
	public void theMyDatesAreFlexibleCheckboxIsDisabled() {
		KaterinaBookingPage bp = new KaterinaBookingPage();
		assertTrue(!bp.checkFlexDateBox.isEnabled());
	}

	@When("The user clicks on submit button")
	public void theUserClicksOnSubmitButton() {
		KaterinaBookingPage bp = new KaterinaBookingPage();
		bp.submitButton.submit();
	    
	}

	@Then("The error message {string} pops up")
	public void theErrorMessagePopsUp(String string) {
		KaterinaBookingPage bp = new KaterinaBookingPage();
		String error = bp.errorPopMessage.getText();
		assertEquals(error,string);
	    
	}
	
	@When("The user clicks on a notificaiton icon")
	public void theUserClicksOnANotificaitonIcon() {
		KaterinaBookingPage bp = new KaterinaBookingPage();
		bp.notificationIcon.click();
	}
	@Then("The user should land on notification window")
	public void theUserShouldLandOnSerchPoUpWindow() {
		String expected = "ADVISORIES";
		assertTrue(Driver.getDriver().getPageSource().contains(expected));
	}


}
