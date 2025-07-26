package pageObjects;

import helpers.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public static By button_BookAFreeDemo = By.xpath("(//button[text()='Book a Free Demo'])[2]");

    public static void click_BookAFreeDemo() {
        driver.findElement(button_BookAFreeDemo).click();
    }


}
