package web_ui;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebElement;
//import static org.openqa.selenium.support.locators.RelativeLocator;

public class LoginTest {
	public static String browser = "chrome"; // external configuration -XLS,CSV
	public static WebDriver driver;
	@BeforeTest
	public void webdriverselection(){
	 

		if (browser.equals("Firfor")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}
	@Test(priority=1,description="This is Login Method")
	public void login() throws InterruptedException {
		SoftAssert softassert = new SoftAssert();
		driver.get("https://tabiyat.pk/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[1]")).sendKeys("3351291126");
		Reporter.log("The data\"3351291126\"Entered");
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[2]/div[2]/button[1]"));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click()", element1);
		driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[2]")).sendKeys("Azam1234567");
		Reporter.log("The data\"Azam1234567\"Entered");
		WebElement element2 = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[3]/div/button/span"));
		jse1.executeScript("arguments[0].click()", element2);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		System.out.println("Signed in with Click");
		System.out.println("Sign in successfully");
		Thread.sleep(1500);
		//String actualtitle = driver.getTitle();
		String actualUrl = "https://tabiyat.pk/";
		String expectedUrl = driver.getCurrentUrl();
		softassert.assertEquals(actualUrl, expectedUrl, "This is login varification");
		
		//softassert.assertAll();
		if(actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		//Assert.assertEquals(actualUrl,expectedUrl);
		
	}
	@AfterTest
	public void quit() {
		driver.quit();
	}
}