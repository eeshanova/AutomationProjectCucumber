package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SanaHomePage;
import pages.SanaHotelPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class SanaStepDefs {
	
	@Given("the user is on the homepage")
	public void theUserIsOnTheHomepage() {
	  
	}
	@When("the user clicks on Shop Hotel page Link")
	public void theUserClicksOnShopHotelPageLink() {
	   
		SanaHomePage sp = new SanaHomePage();
		
		BrowserUtils.waitForPageToLoad(15);
		
		BrowserUtils.scroll(0, 300);
		sp.hotelLink.click();
		
	}
	@Then("the user can enter the destination in the search bar")
	public void theUserCanEnterTheDestinationInTheSearchBar() {
		
		SanaHotelPage sh = new SanaHotelPage();
		BrowserUtils.waitForPageToLoad(5);
		BrowserUtils.switchToWindow("Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations");
		System.out.println(Driver.getDriver().getTitle());
		sh.searchBox.click();
		sh.searchBox.sendKeys("Turkey");
		
//		System.out.println(Driver.getDriver().findElement(By.id("qf-0q-destination")).getAttribute("value"));
//		System.out.println(select.getFirstSelectedOption());
//		select.selectByValue("Turkey");
				
		
		BrowserUtils.waitFor(5);
		
//		sh.searchBox.click();
//		sh.searchBox.sendKeys("Turkey");
//		BrowserUtils.hover(sh.searchBox);
//		sh.searchButton.submit();
		
//		String javascript = "document.getElementById('qf-0q-destination')";  
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();  
//		WebElement element = (WebElement) jsExecutor.executeScript(javascript);  
////		element.click();
////		element.clear();
//		element.sendKeys("Turkey");
		
	}
	@Then("the destination results should display the correct hotel")
	public void theDestinationResultsShouldDisplayTheCorrectHotel() {
		System.out.println("Last Step");
	}

}
