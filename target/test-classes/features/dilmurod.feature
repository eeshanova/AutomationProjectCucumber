Feature: Checking Booking Module 

 @dilmurod
    Scenario: Verify that pop up window comes up by clicking ? next to Basic Fares For
      Given The User is on the homepage
      When The user expands Advanced Search and clicks on question mark next to Basic Fares For
      Then The pop up window comes up with Fares Info

	@dilmurod
    Scenario: Verify that error message comes up when numbers used instead of letters for From Airport 
      Given The User is on the homepage
      When The user inputs numbers instead of letters for From Airport
      Then The error message "Please enter a valid city code or airport name" is displayed
 
 	@dilmurod
 	Scenario: Verify that cities can swap by clicking red arrows between cities
	  Given The User is on the homepage
      When The user clicks and types "Atlanta" as from Airport and "Miami" as to Airport
      Then The user clicks on red arrow between cities to swap them
      
     @dilmurod
     Scenario: Verify that My dates are flexible checkbox is disabled if Include Nearby Airports is checked
      Given The User is on the homepage
      When The user expands Advanced Search and clicks on Include Nearby Airports checkbox
      Then The My dates are flexible checkbox is disabled
      
      @dilmurod
     Scenario: Verify that error message displays if the user just clicks submit button
      Given The User is on the homepage
      When The user clicks on submit button
      Then The error message "please correct the 2 items indicated" pops up
     
     @temp
    Scenario: Verify Search Page title
	Given The User is on the homepage
	When The user clicks on a notificaiton icon
	Then The user should land on notification window
      