Feature: Verification of Website Footer Module
 
 	@kate
   Scenario: Verify response when press eCredits and entered negative info
      Given The User is on the homepage
      When The user clicks on eCredits and types random number
      And The user clicks on Look Up
      Then The user should recive error message To continue, please correct the 
      
      
       	@kate
   Scenario: Verify response when press "News Hub"
      Given The User is on the homepage
      When The user click on "News Hub"
      Then Verify if page contain word "News"
    
    
