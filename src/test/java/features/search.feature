Feature: Search and place the vegetables

@SeleniumTest
Scenario: Searach the veagetables to place 
Given Valide the searched vegetables and display
When User enter Cucumber in the search field
Then "Cucumber" should be displayed

@SeleniumTest
Scenario Outline: Searach the veagetables to place 
Given Valide the searched vegetables and display
When User enter <Name> in the search field
Then items should be added to cart
And User proceeded to checkout page to purchase the items
Then check selected item <Name> is displaying or not

Examples: 
	
		|Name                      |
		|Beetroot     |
		|Cauliflower  |