
Feature: As a sport user , I would like to read about all articles related to sports.
  @Test2
  Scenario: As a sport user When I use the search option to find all articles related to sports
  			I should see the first heading and the last heading on the page.

	Given I am on BBC sports fixture page
	When I type "sports" in the search bar & click on search
	Then I should be on sports article page


