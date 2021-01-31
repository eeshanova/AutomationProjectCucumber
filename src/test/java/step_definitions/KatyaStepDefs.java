package step_definitions;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.KatyaPage;
import utilities.BrowserUtils;
import utilities.Driver;
public class KatyaStepDefs{
	
//	@Given("The User is on the homepage")
//	public void theUserIsOnTheHomepage() {
//		
//	}
	
	@When("The user clicks on eCredits and types random number")
	public void theUserClicksOnECreditsAndTypesRandomNumber() {
		Faker faker = new Faker();
		KatyaPage page = new KatyaPage();
		BrowserUtils.waitForPageToLoad(10);
		BrowserUtils.scroll(0, 3100);
		BrowserUtils.waitFor(3);
//		page.cookieClose.click();
				
	   page.eCredits.click();
	   BrowserUtils.waitFor(3);
	   BrowserUtils.waitForPageToLoad(10);
	   page.eCreditNumber.sendKeys(""+faker.random());
	}
	
	@When("The user clicks on Look Up")
	public void theUserClicksOnLookUp() {
	   KatyaPage page = new KatyaPage();
	   page.lookUp.click();
	   BrowserUtils.waitFor(3);
	}
	
	@Then("The user should receive error message {string}")
	public void theUserShouldReceiveErrorMessage(String string) {
		KatyaPage page = new KatyaPage();
		assertTrue(page.errorMssg.getText().contains(string));
	}
	
	@When("The user clicks on {string}")
	public void theUserClicksOn(String string) {
	    KatyaPage page= new KatyaPage();
	    BrowserUtils.waitForPageToLoad(10);
	    BrowserUtils.scroll(0, 3100);
	    page.cookieClose.click();
	    BrowserUtils.waitFor(3);
//	    page.newsHub.click();
	    	    
	    for (WebElement elementFrom: page.footerLinks) {
			if(elementFrom.getText().contains(string)) {
			elementFrom.click();
			break;
			}
		}
		
	}
	
	@Then("Verify if page title is {string}")
	public void verifyIfPageTitleIs(String string) {
		
		String title = Driver.getDriver().getTitle();
		assertEquals(title, string);
	}
	
	@When("The user clicks on English under North America, United States")
	public void theUserClicksOnEnglishUnderNorthAmericaUnitedStates() {
		KatyaPage page = new KatyaPage();
		page.englishUS.click();
	    
	}

	@Then("Verify if cookie confirmation message comes up")
	public void verifyIfCookieConfirmationMessageComesUp() {
		KatyaPage page = new KatyaPage();
		assertTrue(page.cookieConfirmation.isDisplayed());		
	    
	}
	
	@When("The user clicks on English under India")
	public void theUserClicksOnUnder() {
		KatyaPage page = new KatyaPage();
		page.englishIndia.click();
	
		if(page.cookieConfirmation.isDisplayed()) {
			page.visitButton.click(); 
		}
	}

	@Then("Verify if page contains word {string}")
	public void verifyIfPageContainsWord(String string) {
		String country = new KatyaPage().englishLang.getText();
		assertEquals(country,string);
	    
	}
	
	@When("The user clicks on Optional Fees and Services")
	public void theUserClicksOnOptionalFeesAndServices() {
	    new KatyaPage().optionanlFees.click();
	}
	
	@When("The user clicks on Meeting Services")
	public void theUserClicksOnMeetingServices() {
	    new KatyaPage().meetingServices.click();
	}
	
}
