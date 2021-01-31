package step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.github.javafaker.Faker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.KatyaPage;
import utilities.BrowserUtils;

public class KatyaStepDefs{
	
	@Given("The User is on the homepage")
	public void theUserIsOnTheHomepage() {
	}
	
	@When("The user clicks on eCredits and types random number")
	public void theUserClicksOnECreditsAndTypesRandomNumber() {
		Faker faker = new Faker();
		KatyaPage page = new KatyaPage();
	  
	   page.eCredits.click();
	   BrowserUtils.waitFor(3);
	   page.eCreditNumber.sendKeys(""+faker.random());
	}

	@When("The user clicks on Look Up")
	public void theUserClicksOnLookUp() {
	   KatyaPage page = new KatyaPage();
	   page.lookUp.click();
	   BrowserUtils.waitFor(3);
	}

	@Then("The user should recive error message To continue, please correct the")
	public void theUserShouldReciveErrorMessageToContinuePleaseCorrectThe() {
//		KatyaPage page = new KatyaPage();
//		assertTrue(page.errorMssg.getText().contains(" To continue, please correct the "));

	}


	@When("The user click on {string}")
	public void theUserClickOn(String string) {
	    KatyaPage page= new KatyaPage();
	    page.newsHub.click();
	    BrowserUtils.waitFor(3);
	}

	@Then("Verify if page contain word {string}")
	public void verifyIfPageContainWord(String string) {
//		KatyaPage page = new KatyaPage();
//		assertTrue(page.fNews.getText().contains(string));

	}



	
	
	

}
