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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.*;

public class OrderPaymentByCard {
	public static String browser = "chrome"; // external configuration -XLS,CSV
	public static WebDriver driver;
	

	@BeforeTest
	public static void ChromeSelection() {
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
		//LoginProcess();
		//OrderPaymentByCardProcess();
		
		

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
		jse.executeScript("arguments[0].click()", element4); 
		System.out.println("Signed in with Click");
		System.out.println("Sign in successfully");
	}
	@Test(groups="OrderFlow", description="Order Payment By Card")
	public static void OrderPaymentByCardProcess() {
	//int i;
	//for(i=0;i<2;i++) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Actions actions = new Actions(driver);

		WebElement element0 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section[3]/div/div/div/div[1]/div[2]/div[1]/a"));
		jse.executeScript("arguments[0].click()", element0);   // click on the view all of popular product
		
		WebElement element1a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text() = 'Olcuf sugar-free Syrup 120.0 ml']")));
		jse.executeScript("arguments[0].click()", element1a);   // click on the popular product's olcuf suger-free syrup 120
		
		WebElement element2a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"6113\"]")));
		jse.executeScript("arguments[0].click()", element2a);   // click on the add to add to cart button
		
		WebElement element3a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[2]/div[3]/div[2]/button[3]")));
		jse.executeScript("arguments[0].click()", element3a);   // click on the cart icon
		
		WebElement element4a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/span[2]")));
		jse.executeScript("arguments[0].click()", element4a);   // click on the + sign to increment the quantity of medicine 
		
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/div/div[7]/button"));
		jse.executeScript("arguments[0].click()", element5);   // click on the place to checkout button
		//Thread.sleep(1000);
		
		
/*		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/button"));
		actions.moveToElement(element6);
		actions.perform();
		jse.executeScript("arguments[0].click()", element6);   // click on the add address button
		Thread.sleep(800);
		WebElement element7 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/p/div[2]/div/div[3]/div/fieldset/div/label[2]/span[1]/span[1]/input"));
		jse.executeScript("arguments[0].click()", element7);   // click on the other checkbox option
		Thread.sleep(800);
		WebElement element8 = driver.findElement(By.xpath("//*[@id=\"bootstrap-input-other\"]"));
		element8.sendKeys("azam1236");                          // write the location name
		Thread.sleep(800);
		WebElement element9 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/p/div[2]/div/div[5]/button"));
		jse.executeScript("arguments[0].click()", element9);   // click on the Add Address button
		Thread.sleep(1000);*/
		
		
		
		WebElement element5a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div[1]/div[3]")));
		jse.executeScript("arguments[0].click()", element5a);   // click on the Pay via Card
		
		//WebElement element10 = driver.findElement(By.id("<div class=\"ep-title\">azam123456</div>"));
		WebElement element10a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text() = 'azam120']")));
		jse.executeScript("arguments[0].click()", element10a);   // click on the address block for select address
		
		WebElement element11a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[2]/div[2]/div/div/div/input")));
		element11a.sendKeys("This is Automate Order and Payment by CARD ");
		
		WebElement element12a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/div[2]/div[7]/button")));
		actions.moveToElement(element12a);
		actions.perform();
		jse.executeScript("arguments[0].click()", element12a);   // click on the Place Order Button
		System.out.println("Ordered Successfully");
		
		System.out.println("Order Completed");
		
		WebElement element14a = new WebDriverWait(driver, Duration.ofSeconds(8))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"CardNumber\"]")));
		element14a.sendKeys("5440123456789012");   // Enter the Card number
		
		WebElement element15a = new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"CVV\"]")));
		element15a.sendKeys("119");    // Enter the cvv number
		
		WebElement element16 = driver.findElement(By.xpath("//*[@id=\"ExpiryMonth\"]"));
		element16.sendKeys("01");    //  Enter the Expiry Month
		
		WebElement element17 = driver.findElement(By.xpath("//*[@id=\"ExpiryYear\"]"));
		element17.sendKeys("2025");    // Enter the Expiry Year
		
		WebElement element18 = driver.findElement(By.name("cardCountry"));
		Select select = new Select(element18);
		select.selectByVisibleText("Pakistan");  // Select country
		
		WebElement element19 = driver.findElement(By.xpath("//*[@id=\"cardMobileNumber\"]"));
		element19.sendKeys("3351291126");	// Enter the mobile number
		
		WebElement element20 = driver.findElement(By.xpath("//*[@id=\"cardEmailAddress\"]"));
		element20.sendKeys("azamcardtest@gmail.com");	// Enter the email address
		
		WebElement element21 = driver.findElement(By.xpath("//*[@id=\"CustomerName\"]"));
		element21.sendKeys("azamtest");		// Enter the customer name
		
		WebElement element22 = driver.findElement(By.xpath("//*[@id=\"pay\"]"));
		jse.executeScript("arguments[0].click()", element22);   // click on the Pay Button
		System.out.println("Payment Successfully");
		
		WebElement element23a = new WebDriverWait(driver, Duration.ofSeconds(6))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[3]/div/div[3]/button[2]")));
		jse.executeScript("arguments[0].click()", element23a);
		
		System.out.println("Order Placed");
	//}	
		
	}
	@AfterTest
	public void quit() {
		driver.quit();
	}

}
