package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

   public static  WebDriver driver;

   public static void setWebDriver() {
       driver = new ChromeDriver();
   }

   public static void launchUrl(String url) {
      driver.get(url);
      driver.manage().window().maximize();
   }

}
