package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SanaHotelPage {
	public SanaHotelPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "qf-0q-destination")
	public WebElement searchBox;
	
	@FindBy(xpath = "//a[@class='icon close-icon po-a cursor c-hds-arch-3']")
	public WebElement closeButton;
	
	@FindBy (xpath = "//input[@name='q-localised-check-in'][@id='qf-0q-localised-check-in']")
	public WebElement checkIn;

	@FindBy(xpath="//button[@type='submit']")
	public WebElement searchButton;

	@FindBy (xpath = "//form[@class='cont-bd']")
	public WebElement form;

}
