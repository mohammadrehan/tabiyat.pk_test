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

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderMedicinceByCategory {
	public static String browser = "chrome"; // external configuration -XLS,CSV
	public static WebDriver driver;
	

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
		driver.manage().window().maximize();
		LoginProcess();
		OrderMedicineFrom_AcidReflux();	
		

	}
	public static void LoginProcess() throws InterruptedException {
		driver.get("https://stg.medznmore.com/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element1 = driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[1]"));
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		element1.sendKeys("3351291126");
		//WebElement element2 = new WebDriverWait(driver, Duration.ofSeconds(3))
			//	.until(ExpectedConditions.elementToBeClickable(By.xpath("/*[@id=\\\"root\\\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[2]/div[2]/button[1]")));
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"root\\\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[2]/div[2]/button[1]"))).click();
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[2]/div[2]/button[1]"));
		//element2.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", element2);
		WebElement element3 =  driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[2]"));
		element3.sendKeys("Azam1234567");
		//WebElement element4 = new WebDriverWait(driver, Duration.ofSeconds(3))
			//	.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"root\\\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[3]/div/button/span")));
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
	
	public static void OrderMedicineFrom_AcidReflux() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Actions actions = new Actions(driver);
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section[1]/div/div/div[1]/a"));
		jse.executeScript("arguments[0].click()", element1);  // click on the Order Medicine
		
		WebElement element2 = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div/div/div[1]/a/div/div[1]/img")));
		jse.executeScript("arguments[0].click()", element2);  // click on the Acid Reflux Category

		WebElement element3 = new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text() = 'Zoltar 40mg Injection 1.0 vial']")));
		jse.executeScript("arguments[0].click()", element3);   // click on the Zoltar 40mg Injection 1.0 vial
		
		WebElement element4 = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"1419\"]")));
		jse.executeScript("arguments[0].click()", element4);   // click on the Add to cart of Zoltar 40mg Injection 1.0 vial
		
		//WebElement element5a = new WebDriverWait(driver, Duration.ofSeconds(3))
			//	.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"root\\\"]/div[1]/div[2]/div/div/div/div/div/a[2]")));
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/div/a[2]"));
		jse.executeScript("arguments[0].click()", element5);   // click on the Medicine Category
		
		//WebElement element6a = new WebDriverWait(driver, Duration.ofSeconds(3))
		//		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"root\\\"]/div[1]/div[2]/div/section/div/div/div[2]/a/div")));
		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div/div/div[2]/a/div"));
		jse.executeScript("arguments[0].click()", element6);   // click on the Order Acne CArt
		

		//WebElement element7a = new WebDriverWait(driver, Duration.ofSeconds(3))
		//		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"root\\\"]/div[1]/div[2]/div/section/div/div/div[2]")));
		WebElement element7 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div/div/div[2]"));
		jse.executeScript("arguments[0].click()", element7);   // click on the Acne Category
		
		WebElement element8a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text() = 'Acdermin Gel 20.0 gm']")));
		//WebElement element8 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div/div/div[2]/div/div[2]/div[1]/div/a"));
		jse.executeScript("arguments[0].click()", element8a);   // click on the Acdermin Gel 20.0 gm
		
		WebElement element9a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"3695\"]")));
		//WebElement element9 = driver.findElement(By.xpath("//*[@id=\"1393\"]/span[2]"));
		jse.executeScript("arguments[0].click()", element9a);   // click on the Add to cart
		
		WebElement element10a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[2]/div[3]/div[2]/button[3]")));
		//WebElement element10 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[2]/div[3]/div[1]/button[2]"));
		jse.executeScript("arguments[0].click()", element10a);   // click on the Cart Icon
		
		WebElement element11a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div/span[2]")));
		//WebElement element11 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div/span[2]"));
		jse.executeScript("arguments[0].click()", element11a);   // click on the + sign to increment the quantity of  zolter injection
		
		WebElement element12a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/span[2]")));
		//WebElement element12 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/span[2]"));
		jse.executeScript("arguments[0].click()", element12a);   // click on the + sign to increment the quantity of Acdermin medicine
		
//		WebElement element13 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]"));
		//WebElement element13 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/label/span"));
		//*[@id="root"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/label/span
		
		WebElement element13 = driver.findElement(By.xpath("//*[@id=\"contained-button-file\"]"));
		element13.sendKeys("D:\\Walls\\821259.jpg");            //  Upload the preception
		WebElement element14a = new WebDriverWait(driver, Duration.ofSeconds(6))
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/div/div[7]/button")));
		//WebElement element14 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/div/div[7]/button"));
		jse.executeScript("arguments[0].click()", element14a);   // click on the Proceed to checkout
		
		WebElement element15a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/button")));
		//WebElement element15 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/button"));
		actions.moveToElement(element15a);
		actions.perform();
		jse.executeScript("arguments[0].click()", element15a);   // click on the add address button
		
		WebElement element16a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[3]/div/div[2]/p/div[2]/div/div[3]/div/fieldset/div/label[2]/span[1]/span[1]/input")));
		//WebElement element16 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/p/div[2]/div/div[3]/div/fieldset/div/label[2]/span[1]/span[1]/input"));
		jse.executeScript("arguments[0].click()", element16a);   // click on the other checkbox option
		
		WebElement element17a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"bootstrap-input-other\"]")));
		//WebElement element17 = driver.findElement(By.xpath("//*[@id=\"bootstrap-input-other\"]"));
		element17a.sendKeys("azam117");                          // write the location name
		
		WebElement element18a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[3]/div/div[2]/p/div[2]/div/div[5]/button")));
		//WebElement element18 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/p/div[2]/div/div[5]/button"));
		jse.executeScript("arguments[0].click()", element18a);   // click on the Add Address button
		
		WebElement element19a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[2]")));
		//WebElement element19 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]"));
		jse.executeScript("arguments[0].click()", element19a);   // click on the address block for select address
		
		WebElement element20a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[2]/div[2]/div/div/div/input")));
		//WebElement element20 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[2]/div[2]/div/div/div/input"));
		element20a.sendKeys("This is Automate Order ");
		
		WebElement element21a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/div[2]/div[7]/button")));
		//WebElement element21 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/div[2]/div[7]/button"));
		//WebElement element21 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/div[2]/div[6]/button"));
		//*[@id="root"]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/div[2]/div[7]/button
		actions.moveToElement(element21a);
		actions.perform();
		//Thread.sleep(1000);
		jse.executeScript("arguments[0].click()", element21a);   // click on the Place Order Button
		System.out.println("Ordered Successfully");
		//Thread.sleep(2500);
		WebElement element22a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[9]/div[3]/div/div[3]/button[2]")));
		//WebElement element22 = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[3]/button[2]"));
		jse.executeScript("arguments[0].click()", element22a);

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
