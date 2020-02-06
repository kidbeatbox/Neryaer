package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		googleSearchTest();

	}

	public static void googleSearchTest() {

		System.setProperty("webdriver.gecko.driver",
				"/Users/macintoshhd/eclipse-workspace/SeleniumJavaFramework/geckodriver");

		driver = new FirefoxDriver();

		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);

		driver.get("https://google.com");

		WebDriverWait waitButtonSearch = new WebDriverWait(driver, 20);

		searchPageObj.setTextInSearchBox("Automation Step By Step");

		WebElement buttonSearch = waitButtonSearch
				.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));

		buttonSearch.click();

		// searchPageObj.clickSearchButton();

		driver.close();

		System.out.println("Test completed Successfully");

	}
}
