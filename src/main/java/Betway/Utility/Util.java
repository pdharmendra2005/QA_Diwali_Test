package Betway.Utility;

import Betway.WebPages.BasePage;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Util extends BasePage {

  public static boolean isDisplayed(WebElement element){
    return element.isDisplayed();
  }


  public static void click(WebElement element){
    element.click();
  }
  public static void sendKey( WebElement element, String string){
    element.sendKeys(string);
  }

  public static void waitTime(long seconds){

    driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
  }
  public static String getText (WebElement element ){
     return element.getText();
    //return null;
  }

}
