Feature: Google login

Background: Opening Netbanking Page
Given while clicking login button
When launching the browser


@SanityTest	
Scenario: launching browser 
	Given User is on application 
	When Login application with  "santosh" and "swathi" 
	Then Verify application is launched 
	And application launched 