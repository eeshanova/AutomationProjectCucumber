package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SanaHomePage {
	
	public SanaHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//div[@class='widget-query-group widget-query-destination']//input[@id='qf-0q-destination']")
	public WebElement searchBox;
	
	@FindBy(xpath="//a[@href='https://www.hotels-delta.com?wapb3=%7cc.500863%7cl.en_US%7ct.Site%7cs.HomepageShopHotels']")
	public WebElement hotelLink;
	
}
