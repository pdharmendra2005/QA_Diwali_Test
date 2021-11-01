package Betway.WebPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BasePage {

  public static String baseUrl = "https://www.bbc.co.uk/sport/football/scores-fixtures";
  public static WebDriver driver;
  public static String browserType = "chrome";

  public void startBrowser(String browser){
    if(browser.equalsIgnoreCase("chrome")){
      WebDriverManager.chromedriver().setup();
      ChromeOptions chromeOptions = new ChromeOptions();
      chromeOptions.addArguments("--incognito");
      driver = new ChromeDriver(chromeOptions);
    }
    else if(browser.equalsIgnoreCase("firefox")){
      WebDriverManager.firefoxdriver().setup();
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      firefoxOptions.addArguments("--incognito");
      driver = new FirefoxDriver(firefoxOptions);
    }
    driver.manage().window().maximize();
    driver.get(baseUrl);
    //driver.findElement(By.id("")).click();
  }
   public static void exit(){
    driver.quit();
  }
}
