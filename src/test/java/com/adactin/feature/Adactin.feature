Feature: Hotel booking functionlity in adactin application 

Background: 
	Given User launch the adactin
	And User click the login1 to validate
	
Scenario Outline: User will create the new account1
	Given User launch the adactin application1
	When User enter the valid username "<username>" in username1
	And User enter the valid password "<password>" in password1
	Then User click the login1
	
	Examples: 
		|username|password|
		|manomala|Maran@3718|
		|ananthamechkumar|ananth123|
		
Scenario: User will create the new account 
	Given User launch the adactin application 
	When User enter the valid username "vinovicky" in username 
	And User enter the valid password "Jan@2020" in password 
	Then User click the login 
	
Scenario: User will search the Hotel for booking 
	When User select the location 
	And User select the hotel 
	And User select the room type 
	And User select the numbers of rooms 
	And User select the check in date, month and year 
	And User select the check out date, month and year 
	And User select the adults room 
	And User select the children per room 
	Then User select the search button 
	
Scenario: Confirm the hotel booking 
	When User select the radio button 
	Then User click the continue button 
	
Scenario: User book a hotel 
	When User enter the first name 
	And User enter the last name 
	And User enter the valid billing address 
	And User enter the valid sixteen digit credit card number 
	And User select the credit card type 
	And User select the expiry month 
	And User select the expiry year 
	And User enter the valid cvv number 
	Then User click the book now button 
	
Scenario: Booking Confirmation 
	When User check confirmation deatails and logout the application 
	
