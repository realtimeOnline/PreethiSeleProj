package pageObjects;

import helpers.BasePage;
import org.openqa.selenium.By;

public class RegisterPage extends BasePage {


    public static By input_FullName = By.id("Form_getForm_FullName");

    public static void enter_FullName(String name) {
        driver.findElement(input_FullName).sendKeys(name);
    }

    public static void selectCountry(String country) {
        driver.findElement(By.xpath("//select[@name='Country']/option[@value='"+country+"']")).click();
    }

}
