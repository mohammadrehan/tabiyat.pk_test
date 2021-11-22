package web_ui;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

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
import org.testng.annotations.Test;


public class quickOrder {
	public static String browser = "chrome"; // external configuration -XLS,CSV
	public static WebDriver driver;
	
	

	
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
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
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		//Login lt = new Login();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		LoginProcess();
		//driver.get("https://stg.medznmore.com/");
		quickorderprocess();
		
		

	}
	public static void LoginProcess() {
		driver.get("https://stg.medznmore.com/login");
		//driver.manage().timeouts().implicitlyWait(10, Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element1 = driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[1]"));
		element1.sendKeys("3351291126");
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"root\\\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[2]/div[2]/button[1]"))).click();
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[2]/div[2]/button[1]"));
		//element2.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", element2);
		WebElement element3 =  driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[2]"));
		element3.sendKeys("Abdulazam19");
		//WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(1));
		//wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"root\\\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[3]/div/button/span"))).click();
		WebElement element4 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[3]/div/button/span"));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click()", element4);
		//element4.click();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("Signed in with Click");
		System.out.println("Sign in successfully");
	}
	
	
	public static void quickorderprocess() throws InterruptedException {
		//driver.get("https://stg.medznmore.com");
		//driver.get("https://stg.medznmore.com/quick-order/Upload");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement quickorderbutton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[1]/div[2]/button/span[1]/div[1]"));
		//quickorderbutton.click();
		JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		jse3.executeScript("arguments[0].click()", quickorderbutton);
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/p/div/div[2]/div/section/div/div/div/div[1]/input"));
		//WebElement element5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/p/div/div[2]/div/section/div/div/div/div[1]/span"));
		//element5.click();
		element5.sendKeys("D:\\Walls\\821259.jpg");
		//element5.click();
		//JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		//jse2.executeScript("arguments[0].click()", element5);
		Thread.sleep(4000);
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(5))
//				.withMessage("Click on the Next Button");
		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/button"));
		//WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"root\\\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/button"))).click();
		//element6.click();
		JavascriptExecutor jse4 = (JavascriptExecutor)driver;
		jse4.executeScript("arguments[0].click()", element6);
		System.out.println("File Uploaded");
		//WebElement element7 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/p/div/div[2]/div[1]"));
		WebElement element7 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/p/div/div[2]/div[3]"));
		//element7.click();
		JavascriptExecutor jse5 = (JavascriptExecutor)driver;
		jse5.executeScript("arguments[0].click()", element7);
		System.out.println("Address selected");
		WebElement element8 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/button"));
		//element8.click();
		JavascriptExecutor jse6 = (JavascriptExecutor)driver;
		jse6.executeScript("arguments[0].click()", element8);
		System.out.println("Clicked on the next button");
		WebElement element9 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/button"));
		//element9.click();
		JavascriptExecutor jse7 = (JavascriptExecutor)driver;
		jse7.executeScript("arguments[0].click()", element9);
		System.out.println("Order Successsfully");
	}
}
