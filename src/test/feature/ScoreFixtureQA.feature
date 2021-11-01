Feature:
  @Test3
  Scenario Outline: As a QA user, I shouldn't be to log in using invalid credentials.

	Given I am on BBC sports fixture page
	When I select Sign in
	Then I should navigate to Sign in
	When I enter "<UserName>" and "<Password>"
	And I click Sign in
	Then I should see "<Error Message>"


	Examples:
	  |UserName  | Password | Error Message |
	  | dhaf     | pass123439|Uh oh, that password doesn’t match that account. Please try again.|
	  |          | pa      | Sorry, that password is too short|
	  |			 |			| Something's missing|
	  |p_dhar@yahoo.com |   | Something's missing|
	  |			|    dham       | Sorry, that password is too short|