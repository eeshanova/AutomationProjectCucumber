package step_definitions;

import org.openqa.selenium.Keys;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SanaCarPage;
import pages.SanaHomePage;
import utilities.BrowserUtils;
import utilities.Driver;

public class SanaStepDefs {

	
	@Given("the user is on the homepage")
	public void theUserIsOnTheHomepage() {
	  
	}

	@When("the user clicks on RentACar Link")
	public void theUserClicksOnRentACarLink() {
		SanaHomePage sp = new SanaHomePage();
		
		BrowserUtils.waitForPageToLoad(10);
		BrowserUtils.scroll(0, 300);
		
		sp.carSearch.click();
	}

	@Then("the user can enter the location in the search bar")
	public void theUserCanEnterTheLocationInTheSearchBar() {
	  
		SanaCarPage sc = new SanaCarPage();
		
		BrowserUtils.scroll(0, 300);
		
		sc.locationSearch.click();
		sc.locationSearch.clear();
		sc.locationSearch.sendKeys("NEW");
		
		BrowserUtils.waitFor(10);
		sc.locationSearch.sendKeys("" + Keys.DOWN + Keys.ENTER);
		
		sc.pickUp.click();
		sc.pickUp.clear();
		sc.pickUp.sendKeys("02/18/2021" + Keys.TAB + "02/27/2021" + Keys.TAB);
		
		
		sc.searchButton.click();
		
		
	}

	@Then("the destination results should display the correct location")
	public void theDestinationResultsShouldDisplayTheCorrectLocation() {
		
		SanaCarPage sc = new SanaCarPage();
		
		BrowserUtils.waitForPageToLoad(15);
		
		String str = sc.result_Title.getText();
		
		System.out.println(str);
		
		assertTrue(str.contains("NEW HAVEN"));
		
	}

///////////////// Feature 1 - TC 2 - Car Module ///////////////////



		@Then("the user selects the desired car type")
		public void theUserSelectsTheDesiredCarType() {
		
		SanaCarPage sc = new SanaCarPage();
		
		BrowserUtils.scroll(0, 300);
		
		sc.advancedSearch.click();
		
		BrowserUtils.waitForPageToLoad(10);
		
		sc.advLocationSearch.click();
		sc.advLocationSearch.clear();
		sc.advLocationSearch.sendKeys("WASHINGTON");
		
		BrowserUtils.waitFor(10);
		sc.locationSearch.sendKeys("" + Keys.DOWN + Keys.ENTER);
		
		sc.pickUp.click();
		sc.pickUp.clear();
		sc.pickUp.sendKeys("02/18/2021" + Keys.TAB + "02/27/2021" + Keys.TAB);
		
		sc.luxuryCar.click();
		sc.findCarsButton.click();
		
	}
	
	


	@Then("the car results should display the correct type")
	public void theCarResultsShouldDisplayTheCorrectType() {
		
		SanaCarPage sc = new SanaCarPage();
		
		BrowserUtils.waitFor(15);
		
		String str = sc.carType.getText();
		
		assertTrue(str.contains("LUXURY"));
		
	}



///////////////// Feature 1 - TC 3 - Car Module ///////////////////

	

	@When("the user selects past pickUp Date")
	public void theUserSelectsPastPickUpDate() {
		
		SanaCarPage sc = new SanaCarPage();
		
		BrowserUtils.scroll(0, 300);
		
		sc.locationSearch.click();
		sc.locationSearch.clear();
		sc.locationSearch.sendKeys("NEW");
		
		BrowserUtils.waitFor(10);
		sc.locationSearch.sendKeys("" + Keys.DOWN + Keys.ENTER);
		
		sc.pickUp.click();
		sc.pickUp.clear();
		sc.pickUp.sendKeys("02/18/2020" + Keys.TAB + "02/27/2021" + Keys.TAB);
		
		sc.searchButton.click();
	}

	@Then("the error message is displayed")
	public void theErrorMessageIsDisplayed() {
		SanaCarPage sc = new SanaCarPage();
		
		BrowserUtils.waitFor(10);
		
		String str = sc.errorMessage.getText();
		
		assertTrue(str.contains("correct the 1 item indicated"));
	}


///////////////// Feature 1 - TC 4 - Car Module ///////////////////


@When("the user enters a non-English text")
	public void theUserEntersANonEnglishText() {
		
		SanaCarPage sc = new SanaCarPage();
		
		BrowserUtils.scroll(0, 300);
		
		sc.locationSearch.click();
		sc.locationSearch.clear();
		sc.locationSearch.sendKeys("技術");
		
		BrowserUtils.waitFor(10);
		sc.locationSearch.sendKeys("" + Keys.DOWN + Keys.ENTER);
		
		sc.pickUp.click();
		sc.pickUp.clear();
		sc.pickUp.sendKeys("02/18/2021" + Keys.TAB + "02/27/2021" + Keys.TAB);
		
		sc.searchButton.click();
	}

	@Then("the error Tag is displayed")
	public void theErrorTagIsDisplayed() {
		
		SanaCarPage sc = new SanaCarPage();
		
		BrowserUtils.waitFor(10);
		
		String str = sc.errorMessage.getText();
		
		assertTrue(str.contains("correct the 1 item indicated"));
	}



///////////////// Feature 2 - TC 5 - Hotel Module ///////////////////

	

	@When("the user clicks on Shop Hotel page Link")
	public void theUserClicksOnShopHotelPageLink() {
		SanaHomePage sp = new SanaHomePage();
		
		BrowserUtils.waitForPageToLoad(10);
		BrowserUtils.scroll(0, 300);
		
		sp.hotelLink.click();
		
	}


	@Then("the user can enter the destination in the search bar")
	public void theUserCanEnterTheDestinationInTheSearchBar() {
		
		SanaHomePage sh = new SanaHomePage();
		BrowserUtils.waitForPageToLoad(15);
		
		BrowserUtils.switchToWindow("Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations");
		System.out.println(Driver.getDriver().getTitle());
		sh.searchBox.click();
		sh.searchBox.sendKeys("Mahe Island, Seychelles" + Keys.TAB + "02/18/21" + Keys.TAB + Keys.ENTER);

//		sh.checkIn.click();
//		sh.checkIn.clear();
//		sh.checkIn.sendKeys("02/18/21" + Keys.TAB + Keys.ENTER);
//		
//		sh.searchBox.click();

	}
	
	
	@Then("the destination results should display the correct hotel")
	public void theDestinationResultsShouldDisplayTheCorrectHotel() {

		SanaHomePage sh = new SanaHomePage();
		
		BrowserUtils.waitFor(10);
		
		String str = sh.destinationTitle.getText();
		
		System.out.println("");
		
		assertTrue(str.contains("Mahe Island, Seychelles"));
		
	}
	
	
	
}
