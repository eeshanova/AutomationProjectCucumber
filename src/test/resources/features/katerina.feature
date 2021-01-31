Feature: Booking Functionality
 
 	@katerina
   Scenario: Verify From and To Airports with Code or Full City Name functions
      Given The User is on the homepage
      When The user clicks on From Airport and types either a code or a full city name
      And The user clicks on To Airport and types either a code or a full city name
      Then The typed city code or names should match with displayed ones
    
    @katerina
	Scenario: Verify results are displayed for one way option
	  Given The User is on the homepage
      When The user clicks on From Airport and types either a code or a full city name
      And The user clicks on To Airport and types either a code or a full city name
      And The user clicks on One Way option
      And The user chooses the departure date and clicks on submit
      Then The results page contains "One Way" flights
      
    @katerina
    Scenario: Verify that pop up window comes up by clicking ? next to Shopping with Miles
      Given The User is on the homepage
      When The user clicks on question mark next to Shopping with Miles
      Then The pop up window comes up with Info
      
    @katerina
   	Scenario: Verify results are displayed for flexible dates
	  Given The User is on the homepage
      When The user clicks and types "Atlanta" as from Airport and "Salt Lake City" as to Airport
      And The user chooses "March" , "1" for departure and "April" , "15" for return
      And The user clicks on My dates are flexible box and clicks on submit
      Then The results page contains "Flexible Dates"
      
    @katerina
   	Scenario: Verify that the dates can be cleared in the calendar
	  Given The User is on the homepage
      When The user clicks and types "Atlanta" as from Airport and "Moscow" as to Airport
      And The user chooses "June" , "1" for departure and "July" , "1" for return
      Then The user clicks on clear button in the calendar window to clear the dates
      
     @katerina
  	Scenario: Verify that if Shopping with Miles checkbox is selected then the other two are not selectable
      Given The User is on the homepage
      When The user clicks on Shopping with Miles check box
      Then The Refundable Fares and My dates are flexible checkboxes are not selectable
      