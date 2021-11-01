package StepDefinition;

import Betway.Utility.Util;
import Betway.WebPages.ScoreFixture;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {

  ScoreFixture scoreFixture;

  public StepDefinitions(){
    scoreFixture = new ScoreFixture();
  }

  @Given("I am on BBC sports fixture page")
  public void i_am_on_bbc_sports_fixture_page() {
    Assert.assertTrue(scoreFixture.isUserOnScoreFixturePage());

  }
  @When("I select todays date")
  public void i_select_todays_date() {
    scoreFixture.selectDate();

  }
  @Then("I should see Team names")
  public void i_should_see_team_names() {
     scoreFixture.displayListOfTeam();
  }

//////
  @When("I type {string} in the search bar & click on search")
  public void i_Type_sports_InTheSearchOption(String sports) {
    scoreFixture.selectSports(sports);

  }

  @Then("I should be on sports article page")
  public void iShouldBeOnSportsArticlePage() {

  }
  /////////
  @When("I select Sign in")
  public void i_select_sign_in() {
    scoreFixture.select_SignIn();
  }

  @Then("I should navigate to Sign in")
  public void i_should_navigate_to_sign_in() {
      Assert.assertTrue(scoreFixture.isUserOnSignInPage());
      Util.waitTime(2);
  }

  @When("I enter {string} and {string}")
  public void i_enter_UserName_and_Password(String string, String string2) {
      scoreFixture.enterUserNameandPassword(string,string2);
  }

  @When("I click Sign in")
  public void i_click_sign_in_button() {
      scoreFixture.clickSignInButton();
    Util.waitTime(3);

  }

  @Then("I should see {string}")
  public void i_should_see_Message(String string) {
      String actualErrMsg1 = scoreFixture.getErrorMsg();
      System.out.println(actualErrMsg1);
      Assert.assertEquals(actualErrMsg1, string);
  }


}
