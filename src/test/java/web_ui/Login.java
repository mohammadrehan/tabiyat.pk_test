//package web_ui;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Login {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://stg.medznmore.com/login");
//		//driver.findElement(By.id("bootstrap-input")).sendKeys("3351291126");
//		driver.findElement(By.xpath("//*[@id=\"bootstrap-input\"]")).sendKeys("3351291126");
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[2]/div[2]/button[1]")).click();
//		//driver.findElement(By.id("bootstrap-input")).sendKeys("Abdulazam19");
//		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[3]/div/button/span")).click();
//		//driver.close();
//
//	}
//
//}


package web_ui;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebElement;
//import static org.openqa.selenium.support.locators.RelativeLocator;

public class Login {
	//public static String browser = "chrome"; // external configuration -XLS,CSV
	public static WebDriver driver;
	@Test
	public void LoginProcess() {
//		if (browser.equals("Firfor")) {
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		} else if (browser.equals("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//
//		} else if (browser.equals("edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		}
		driver.get("https://stg.medznmore.com/login");
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[1]")).sendKeys("3351291126");
		WebElement element1 = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[2]/div[2]/button[1]"));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click()", element1);
		driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[2]")).sendKeys("Abdulazam19");
		WebElement element2 = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[3]/div/button/span"));
		jse1.executeScript("arguments[0].click()", element2);
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("Signed in with Click");
		System.out.println("Sign in successfully");
		//driver.quit();
		
	}
}