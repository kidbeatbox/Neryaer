package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch_TestNG_Demo {

	private static WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {
		System.setProperty("webdriver.gecko.driver",
				"/Users/macintoshhd/eclipse-workspace/SeleniumJavaFramework/geckodriver");
		driver = new FirefoxDriver();
	}

	@Test
	public static void googleSearch() {

		// goto google.com
		driver.get("https://google.com");

		// enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");

		// click on search button
		// driver.findElement(By.name("btnK")).click();
		// driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		WebDriverWait waitButtonSearch = new WebDriverWait(driver, 20);

		WebElement buttonSearch = waitButtonSearch
				.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));

		buttonSearch.click();


	}

	@AfterTest
	private void tearDownTest() {
		// TODO Auto-generated method stub
		// close browser
		driver.close();
		//driver.quit();
		System.out.println("Test completed Successfully");
	}
}
