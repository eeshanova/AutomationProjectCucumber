Feature: Booking Functionality
 
 	@temp
   Scenario: Verify From and To Airports with Code or Full City Name
      Given The User is on the homepage
      When The user clicks on From Airport and types either a code or a full city name
      And The user clicks on To Airport and types either a code or a full city name
      Then The typed city code or names should match with displayed ones
    
    @temp
	Scenario: Verify results are displayed for one way option
	  Given The User is on the homepage
      When The user clicks on From Airport and types either a code or a full city name
      And The user clicks on To Airport and types either a code or a full city name
      And The user clicks on One Way option
      And Chooses the departure date and clicks on submit
      Then The results page displays "One Way" in the header