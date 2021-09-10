Feature: Google login 

@RegTest @SanityTest
Scenario: launching browser 
Given User is on application 
When user will enter the following details 
	
		| Swathi | Manasa | Madhuri | Manoj |
		
Then application launched is "true" 

@SmokeTest	
Scenario Outline: launching browser 
	Given User is on application 
	When Login application with  <username> and <password> 
	Then Verify application is launched 
	And application launched is "false" 
	
	Examples: 
	
		|username                      |password |
		|swathi.vidiyala@gmail.com     |Swathi123$ |
		|swathi113.vidiyala@gmail.com  |Swathi     | 