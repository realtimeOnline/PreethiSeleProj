package testScritps;

import helpers.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class FirstSele extends BasePage {

	@Test
	public void test1() throws InterruptedException {

		//initialize the WebDriver
		setWebDriver();

		// Launch the URL
		launchUrl("https://www.orangehrm.com/");

		HomePage.click_BookAFreeDemo();

		RegisterPage.enter_FullName("Rama Reddy");

		RegisterPage.selectCountry("United States");

		Thread.sleep(5000);

		driver.quit();


	}

}
