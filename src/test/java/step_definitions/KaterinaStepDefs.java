//package step_definitions;
//
//import static org.junit.Assert.*;
//import static org.junit.Assert.assertTrue;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import pages.KaterinaBookingPage;
//import pages.KaterinaResultsPage;
//import utilities.BrowserUtils;
//import utilities.Driver;
//
//
//public class KaterinaStepDefs {
//
//	@Given("The User is on the homepage")
//	public void theUserIsOnTheHomepage() {
//		
////		Driver.getDriver().get("https://www.delta.com/");
//		
//	}
//
//	@When("The user clicks on From Airport and types either a code or a full city name")
//	public void the_user_clicks_on_from_airport_and_types_either_a_code_or_a_full_city_name() {
//		KaterinaBookingPage bp = new KaterinaBookingPage();
//		BrowserUtils.waitForPageToLoad(10);
//	    bp.fromAirport.sendKeys("Atlanta");
//	    BrowserUtils.waitFor(3);
//	    bp.searchWindow.click();
//	    for (WebElement elementFrom: bp.cityFullNameOptions) {
//
//			if(elementFrom.getText().contains("Atlanta")) {
//			elementFrom.click();
//			break;
//			}
//		}
//	}
//	
//	@When("The user clicks on To Airport and types either a code or a full city name")
//	public void the_user_clicks_on_to_airport_and_types_either_a_code_or_a_full_city_name() {
//		 KaterinaBookingPage bp = new KaterinaBookingPage();
//		 bp.toAirport.sendKeys("IAD");
//		 BrowserUtils.waitFor(3);
//			bp.searchWindow.click();
//			
//				for (WebElement elementTo: bp.cityFullNameOptions) {
//				if(elementTo.getText().contains("IAD")) {
//				elementTo.click();
//				break;
//				}
//			}
//	}
//	
//	@Then("The typed city code or names should match with displayed ones")
//	public void the_typed_city_code_or_names_should_match_with_displayed_ones() {
//		KaterinaBookingPage bp = new KaterinaBookingPage();
//			
//		assertTrue(bp.actualFromCity.getAttribute("value").contains("Atlanta") || 
//								bp.actualFromCity.getAttribute("value").contains("ATL"));
//		assertTrue(bp.actualToAirportCode.getAttribute("value").contains("Washington") || 
//								bp.actualToAirportCode.getAttribute("value").contains("IAD") );
//	}
//	
//	@When("The user clicks on One Way option")
//	public void the_user_clicks_on_one_way_option() {
//		KaterinaBookingPage bp = new KaterinaBookingPage();
//		Driver.getDriver().findElement(By.id("selectTripType-val")).click();
//		BrowserUtils.hover(bp.oneWay);
//		bp.oneWay.click();
//	    
//	}
//
//	@When("Chooses the departure date and clicks on submit")
//	public void chooses_the_departure_date_and_clicks_on_submit() {
//		KaterinaBookingPage bp = new KaterinaBookingPage();
//		bp.calendarWindow.click();
//		
//		bp.pickMonth("February");
//		bp.getDateMonth("1 ", "February").click();
//		bp.doneButton.click();
//		bp.submitButton.submit();
//	    
//	}
//
//	@Then("The results page displays {string} in the header")
//	public void the_results_page_displays_in_the_header(String string) {
//		KaterinaResultsPage rp = new KaterinaResultsPage();
//		BrowserUtils.waitForPageToLoad(15);
//		assertTrue(rp.headingInfo.getText().contains(string));
//	    
//	}
//
//}
