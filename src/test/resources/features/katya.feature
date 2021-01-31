Feature: Verification of Website Footer Module
 	@kate
   Scenario: Verify response when press eCredits and entered negative info
      Given The User is on the homepage
      When The user clicks on eCredits and types random number
      And The user clicks on Look Up
      Then The user should receive error message "To continue, please correct the"
   @kate
   Scenario: Verify response when press "News Hub" link
      Given The User is on the homepage
      When The user clicks on "News Hub"
      Then Verify if page title is "Delta In The News | Delta News Hub"
      
  @kate
   Scenario: Verify response when press "Travel Agents" link
      Given The User is on the homepage
      When The user clicks on "Travel Agents"
      And The user clicks on English under North America, United States  
      Then Verify if cookie confirmation message comes up
   @kate
   Scenario: Verify response when press "Travel Agents" link
      Given The User is on the homepage
      When The user clicks on "Travel Agents"
      And The user clicks on English under India  
      Then Verify if page contains word "INDIA"
   
   @kate
   Scenario: Verify response when press "Booking Information" link
      Given The User is on the homepage
      When The user clicks on "Booking Information"
      And The user clicks on Optional Fees and Services  
      Then Verify if page title is "Baggage Policy and Fees | Delta Air Lines"
      
 @kate
   Scenario: Verify response when press "Business Travel" link
      Given The User is on the homepage
      When The user clicks on "Business Travel"
      And The user clicks on Meeting Services  
      Then Verify if page title is "Meeting Services : Delta Air Lines"