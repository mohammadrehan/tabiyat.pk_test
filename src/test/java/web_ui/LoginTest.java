package web_ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import static org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
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
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[1]")).sendKeys("3351291126");
		
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[2]/div[2]/button[1]"))
				.click();
//	

		driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[2]")).sendKeys("Abdulazam19");
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[3]/div/button/span"))
				.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("Signed in with Click");
		//driver.close();

		

	}

}
