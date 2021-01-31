Feature: Verify the Hotel Booking Module

@temp
Scenario: Verify search criteria matches Destination results
	Given the user is on the homepage
	When the user clicks on Shop Hotel page Link
	Then the user can enter the destination in the search bar
	Then the destination results should display the correct hotel