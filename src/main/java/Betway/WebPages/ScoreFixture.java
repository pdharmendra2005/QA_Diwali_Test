package Betway.WebPages;

import Betway.Utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ScoreFixture extends BasePage{
  WebElement userOnScoreFixturePage;

  public ScoreFixture(){
    PageFactory.initElements(driver,this);
  }

   @FindBy(css = "#page")
   WebElement headerScoreFixture;

   @FindBy(css = "#sp-timeline-current-dates > li > a")
   WebElement selectToday;

   @FindBy ( css = "#orb-search-q")
   WebElement searchOption;

   @FindBy ( className = "se-searchbox__submit")
   WebElement clickSearch;

   @FindBy ( css = "#idcta-username")
   WebElement clickSignIn;

  @FindBy ( css = "#signin-page")
  WebElement verify_SignIn;

  @FindBy ( css = "#user-identifier-input")
  WebElement enterUserName;

  @FindBy ( css = "#password-input")
  WebElement enterPassword;

  @FindBy ( css = "#submit-button")
  WebElement signInButton;

  @FindBy ( css = "#form-message-password > p > span > span:nth-child(1)")
  WebElement errormsg1Pass;


  public boolean isUserOnScoreFixturePage() {
    return Util.isDisplayed(headerScoreFixture);
  }
  public void selectDate(){
      Util.click(selectToday);

    }
  /*public void teamNamesFrame() {
      Util.click(teamNamesFrame);
      Util.waitTime(8);
  }
*/

  public void displayListOfTeam() {
    List<WebElement> obj = driver.findElements(By.className("qa-match-block"));

    for (int i = 0; i < obj.size(); i++) {
      System.out.println("article size"+obj.get(i).findElements(By.tagName("article")).size());
      for(int j =0;j<obj.get(i).findElements(By.tagName("article")).size();j++) {
        System.out.println("-----Home Team--------" + obj.get(i).findElements(By.tagName("article")).get(j).findElements(By.cssSelector("span.sp-c-fixture__team")).get(0).getText());
        System.out.println("-----HomeAway Team" + obj.get(i).findElements(By.tagName("article")).get(j).findElements(By.cssSelector("span.sp-c-fixture__team")).get(1).getText());
      }
    }
  }


    ///
  public void selectSports(String sports){
      Util.sendKey(searchOption, sports);
      Util.click(clickSearch);
  }
  public void select_SignIn(){
      Util.click(clickSignIn);
  }
  public boolean isUserOnSignInPage(){

    return Util.isDisplayed(verify_SignIn);

  }

  public void enterUserNameandPassword(String userName, String passwrd){
     Util.sendKey(enterUserName, userName);
     Util.sendKey(enterPassword,passwrd);
  }


  public void clickSignInButton() {
      Util.click(signInButton);
  }

  public String getErrorMsg() {
     return Util.getText(errormsg1Pass);



  }
}
