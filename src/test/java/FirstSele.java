import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class FirstSele {

	@Test
	public void test1() throws InterruptedException{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]"));
		element.click();

    	//[id='Form_getForm_FullName']   -cssselector
		//input[@id='Form_getForm_FullName']  -xpath
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Rama Reddy");
		Thread.sleep(5000);

		driver.findElement(By.name("Contact")).sendKeys("2224567781");

		driver.findElement(By.name("Email")).sendKeys("123@gmail.com");

		driver.findElement(By.id("Form_getForm_CompanyName")).sendKeys("ABC");

		WebElement Ctrydropdown=driver.findElement(By.name("Country"));
		Ctrydropdown.click();
		Ctrydropdown.sendKeys("United states");
		Thread.sleep(2000);
		WebElement NoofEmpdropdown=driver.findElement(By.name("NoOfEmployees"));
		NoofEmpdropdown.click();
		NoofEmpdropdown.sendKeys("200 - 1,000 ");
		Thread.sleep(2000);
/*
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
Thread.sleep(3000);
driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
driver.switchTo().defaultContent();
Thread.sleep(1000);
*/
		driver.findElement(By.name("action_submitForm")).click();
		driver.quit();

		driver.quit();

	}

}
