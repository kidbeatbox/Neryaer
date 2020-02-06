package testngMaven;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;

	@Test
	public void testEasy() {
		System.setProperty("webdriver.gecko.driver", "/Users/macintoshhd/eclipse-workspace/testngMaven/geckodriver");
		driver.get("http://demo.guru99.com/test/guru99home/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Demo Guru99 ";
		
//		AssertJUnit.assertTrue(title.contains("Demo Guru99 Page"));
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
