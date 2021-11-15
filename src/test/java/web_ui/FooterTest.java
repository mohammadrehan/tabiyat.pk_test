package web_ui;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
public class FooterTest {
	public static String browser = "edge"; // external configuration -XLS,CSV
	public static WebDriver driver;

	public static void main(String[] args) {

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
		driver.get("https://tabiyat.pk/login");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div/div[8]/a[1]")).click();
		String actualUrl ="https://tabiyat.pk/about-us";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("About us passad");
		@Test(description="Validation of About page ");
		@Test(priority=1);    // take priority of test cases number vise
		@Test(dependsOnMethod=”Login”);  // dependent method if you see the profile you should to execute th login test case
		@Test(enabled=’true’);  // Setting it to true execute it and setting it to false will skip the test from the execution cycle
		@Test(groups=”Smoke Suite”);   //
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div/div[8]/a[2]")).click();
//		String actualUrl ="https://tabiyat.pk/refund-policy";
//		String expectedUrl= driver.getCurrentUrl();
//		Assert.assertEquals(actualUrl, expectedUrl);
		
		
		

	}
	public void setupTestNG() {
		System.out.println("this is test automation method");
	}

}
