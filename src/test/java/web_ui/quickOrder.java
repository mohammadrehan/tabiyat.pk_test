package web_ui;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;


public class quickOrder {
	public static String browser = "chrome"; // external configuration -XLS,CSV
	public static WebDriver driver;
	
	

	
	@SuppressWarnings("deprecation")
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
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		//Login lt = new Login();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		LoginProcess();
		//driver.get("https://stg.medznmore.com/");
		quickorderprocess();
		
		

	}
	public static void LoginProcess() {
		driver.get("https://stg.medznmore.com/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element1 = driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[1]"));
		element1.sendKeys("3351291126");
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[2]/div[2]/button[1]"));
		element2.click();
		WebElement element3 =  driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[2]"));
		element3.sendKeys("Abdulazam19");
		WebElement element4 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[3]/div/button/span"));
		element4.click();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("Signed in with Click");
		System.out.println("Sign in successfully");
	}
	
	public static void quickorderprocess() {
		//driver.get("https://stg.medznmore.com");
		//driver.get("https://stg.medznmore.com/quick-order/Upload");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement quickorderbutton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[1]/div[2]/button/span[1]/div[1]"));
		quickorderbutton.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/p/div/div[2]/div/section/div/div/div/div[1]/span"));
		element5.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/button"));
		element6.click();
		WebElement element7 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/p/div/div[2]/div[1]"));
		element7.click();
		WebElement element8 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/button"));
		element8.click();
		WebElement element9 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/button"));
		element9.click();
		
	}
}
