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
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element1 = driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[1]"));
		Thread.sleep(800);
		element1.sendKeys("3351291126");
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"root\\\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[2]/div[2]/button[1]"))).click();
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[2]/div[2]/button[1]"));
		//element2.click();
		Thread.sleep(800);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", element2);
		WebElement element3 =  driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[2]"));
		element3.sendKeys("Abdulazam19");
		Thread.sleep(800);
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
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section[1]/div/div/div[1]/a"));
		jse.executeScript("arguments[0].click()", element1);  // click on the Order Medicine 
		Thread.sleep(1000);
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div/div/div[1]/a/div"));
		jse.executeScript("arguments[0].click()", element2);  // click on the Acid Reflux Category
		Thread.sleep(1000);
		//WebElement element3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div/div/div[2]/div/div[2]/div[1]"));
		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/section/div/div/div[2]/div/div[2]/div[1]/div/a/div"));
//		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div/div/div[2]/div/div[2]/div[1]/div/div/a/div[1]"));
		//WebElement element3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div/div/div[2]/div/div[2]/div[1]/div/a"));
		element3.click();
//		jse.executeScript("arguments[0].click()", element3);   // click on the Nexum 40mg Capsule 7.0 'S
		Thread.sleep(1000);
//		WebElement element4 = driver.findElement(By.xpath("//*[@id=\"6237\"]"));
		WebElement element4 = driver.findElement(By.xpath("//*[@id=\"6237\"]/span[2]"));
		//WebElement element4 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/section/div/div/div[2]/div[1]/div/div/div[2]/div/div[6]"));
		jse.executeScript("arguments[0].click()", element4);   // click on the Add to cart
		Thread.sleep(1000);
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/div/a[2]"));
		jse.executeScript("arguments[0].click()", element5);   // click on the Add to cart
		Thread.sleep(1000);
		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div/div/div[2]/a/div"));
		jse.executeScript("arguments[0].click()", element6);   // click on the Order Medicine Category
		Thread.sleep(1000);
		WebElement element7 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div/div/div[2]"));
		jse.executeScript("arguments[0].click()", element7);   // click on the Acne Category
		Thread.sleep(1000);
		//WebElement element8 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div/div/div[2]/div/div[2]/div[1]"));
		WebElement element8 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div/div/div[2]/div/div[2]/div[1]/div/a"));
		jse.executeScript("arguments[0].click()", element8);   // click on the Zetro 250mg Capsule 10.0 'S
		Thread.sleep(1000);
		WebElement element9 = driver.findElement(By.xpath("//*[@id=\"1393\"]/span[2]"));
		jse.executeScript("arguments[0].click()", element9);   // click on the Add to cart
		Thread.sleep(1000);
		WebElement element10 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[2]/div[3]/div[1]/button[2]"));
		jse.executeScript("arguments[0].click()", element10);   // click on the Cart Icon
		Thread.sleep(1000);
		WebElement element11 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div/span[2]"));
		jse.executeScript("arguments[0].click()", element11);   // click on the + sign to increment the quantity of  zetro medicine
		Thread.sleep(1000);
		WebElement element12 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/span[2]"));
		jse.executeScript("arguments[0].click()", element12);   // click on the + sign to increment the quantity of nexum medicine
		Thread.sleep(1000);
//		WebElement element13 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]"));
		//WebElement element13 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/label/span"));
		//*[@id="root"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/label/span
		WebElement element13 = driver.findElement(By.xpath("//*[@id=\"contained-button-file\"]"));
		element13.sendKeys("D:\\Walls\\821259.jpg");            //  Upload the preception
		Thread.sleep(3000);
		WebElement element14 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/div/div[7]/button"));
		jse.executeScript("arguments[0].click()", element14);   // click on the Proceed to checkout
		Thread.sleep(1000);
		WebElement element15 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/button"));
		actions.moveToElement(element15);
		actions.perform();
		jse.executeScript("arguments[0].click()", element15);   // click on the add address button
		Thread.sleep(1000);
		WebElement element16 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/p/div[2]/div/div[3]/div/fieldset/div/label[2]/span[1]/span[1]/input"));
		jse.executeScript("arguments[0].click()", element16);   // click on the other checkbox option
		Thread.sleep(1000);
		WebElement element17 = driver.findElement(By.xpath("//*[@id=\"bootstrap-input-other\"]"));
		element17.sendKeys("azam109");                          // write the location name
		Thread.sleep(1000);
		WebElement element18 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/p/div[2]/div/div[5]/button"));
		jse.executeScript("arguments[0].click()", element18);   // click on the Add Address button
		Thread.sleep(1000);
		//WebElement element10 = driver.findElement(By.id("<div class=\"ep-title\">azam123456</div>"));
		WebElement element19 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]"));
		//WebElement element10 = driver.findElement(By.linkText("azam1234567"));
		//*[@id="root"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[2]
		jse.executeScript("arguments[0].click()", element19);   // click on the address block for select address
		Thread.sleep(1000);
		WebElement element20 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[2]/div[2]/div/div/div/input"));
		element20.sendKeys("This is Automate Order ");
		Thread.sleep(1000);
		WebElement element21 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/div[2]/div[7]/button"));
		//WebElement element21 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/div[2]/div[6]/button"));
		//*[@id="root"]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/div[2]/div[7]/button
		actions.moveToElement(element21);
		actions.perform();
		Thread.sleep(1000);
		jse.executeScript("arguments[0].click()", element21);   // click on the Place Order Button
		System.out.println("Ordered Successfully");
		Thread.sleep(2500);
		WebElement element22 = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[3]/button[2]"));
		jse.executeScript("arguments[0].click()", element22);

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
