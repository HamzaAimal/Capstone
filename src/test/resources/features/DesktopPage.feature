Feature: Desktop

Background:
Given User is on Retail website
When User click on Desktops tabb
And User click on Show all desktops

@Scenario1
	Scenario: User verify all items are present in Desktop tab
	Then User should see all items are present in Desktop pagee