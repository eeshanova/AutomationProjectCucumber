Feature: Verify the Car Booking Module


#Background: Common Steps
#	Given the user is on the homepage
#	When the user clicks on RentACar Link

	
@sana
Scenario: Verify searched location matches the dispalyed results
	Given the user is on the homepage
	When the user clicks on RentACar Link
	Then the user can enter the location in the search bar
	Then the destination results should display the correct location




@sana
Scenario: Verify searched Car type appears in the displayed results
	Given the user is on the homepage
	When the user clicks on RentACar Link
	Then the user selects the desired car type
	Then the car results should display the correct type



@sana
Scenario: Verify error message when past date is entered in Car Pick Up Box
	Given the user is on the homepage
	When the user clicks on RentACar Link
	Then the user selects past pickUp Date
	Then the error message is displayed



@sana
Scenario: Verify error tag when non-English text is entered in Car Location
	Given the user is on the homepage
	When the user clicks on RentACar Link
	Then the user enters a non-English text
	Then the error tag is displayed
	
	
	
	