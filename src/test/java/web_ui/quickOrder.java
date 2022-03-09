package web_ui;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.*;


public class QuickOrder {
	public static String browser = "chrome"; // external configuration -XLS,CSV
	public static WebDriver driver;
	
	

	@BeforeTest
	public void ChromeSelection() {
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
		driver.manage().window().maximize();
		

	}
	@BeforeMethod
	public static void LoginProcess() {
		driver.get("https://stg.medznmore.com/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element1 = driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[1]"));
		element1.sendKeys("3351291126");
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[2]/div[2]/button[1]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", element2);
		WebElement element3 =  driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[2]"));
		element3.sendKeys("Azam1234567");
		WebElement element4 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[3]/div/button/span"));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click()", element4); 
		System.out.println("Signed in with Click");
		System.out.println("Sign in successfully");
	}
	
	@Test(groups="OrderFlow", description="Quick Order")
	public static void quickorderprocess() {
		//for(int i = 0;i<3;i++) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement quickorderbutton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[1]/div[2]/button/span[1]/div[1]"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", quickorderbutton);
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/p/div/div[2]/div/section/div/div/div/div[1]/input"));
		element5.sendKeys("D:\\Walls\\821259.jpg");
		
		WebElement element6a = new WebDriverWait(driver, Duration.ofSeconds(8))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/button")));
		jse.executeScript("arguments[0].click()", element6a);
		System.out.println("File Uploaded");
		
		WebElement element7a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text() = 'azam120']")));
		jse.executeScript("arguments[0].click()", element7a);
		System.out.println("Address selected");
		
		WebElement element8 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/button"));
		jse.executeScript("arguments[0].click()", element8);
		System.out.println("Clicked on the next button");
		
		WebElement element9 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/button"));
		jse.executeScript("arguments[0].click()", element9);
		System.out.println("Order Successsfully");
		
		WebElement element11a = new WebDriverWait(driver, Duration.ofSeconds(4))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[3]/div/div[3]/button")));  // Back to Home
		jse.executeScript("arguments[0].click()", element11a);
		
		//}
		System.out.println("Done Orders");
		
	}
	@AfterTest
	public void quit() {
		driver.quit();
	}
}
