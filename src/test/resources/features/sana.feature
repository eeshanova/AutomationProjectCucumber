Feature: Verify the Hotel Module
@Sana
Scenario: Verify search criteria matches Destination results
	Given the user is on the homepage
	When the user clicks on Shop Hotel page Link
	Then the user can enter the destination in the search bar
	And the destination results should display the correct hotel