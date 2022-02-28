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

public class OrderSearchedMedicine {
	public static String browser = "chrome"; // external configuration -XLS,CSV
	public static WebDriver driver;
	String Orderid; // orderId

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
		OrderSearchedMedicine osm = new OrderSearchedMedicine();
		osm.LoginProcess();
		osm.OrderSearchedMedicineProcess();
		osm.AdminLoginProcess(); 
		osm.OrderConformation();

	}
	public void LoginProcess() throws InterruptedException {
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
		element3.sendKeys("Azam1234567");
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
	public void OrderSearchedMedicineProcess() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Actions actions = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[1]/div[1]/div/div/div/input"));
		jse.executeScript("arguments[0].click()", element1);
		Thread.sleep(1000);
		element1.sendKeys("risak");
		Thread.sleep(3000);
		//element1.sendKeys(Keys.TAB);
		//Thread.sleep(1000);
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"ep-result-item\"]/li[1]/div/div/div/div[2]/div[2]/div[2]/button"));
		jse.executeScript("arguments[0].click()", element2);    // click on the add to cart button of searched product
		//sendKeys(Keys.TAB);
		//Thread.sleep(1000);
		//element1.sendKeys(Keys.ENTER);  // select the first tablet of searched medicine
		Thread.sleep(2000);
		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[2]/div[3]/div[1]/button[2]"));
		jse.executeScript("arguments[0].click()", element3);    // click on the Cart icon
		Thread.sleep(1000);
		WebElement element4 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div/span[2]"));
		jse.executeScript("arguments[0].click()", element4);   // click on the + sign to increment the quantity of medicine 
		Thread.sleep(1500);
		//WebElement element5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/div/div[7]/button"));
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/div/div[6]/button"));
		jse.executeScript("arguments[0].click()", element5);   // click on the place to checkout button
		Thread.sleep(800);
		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/button"));
		actions.moveToElement(element6);
		actions.perform();
		jse.executeScript("arguments[0].click()", element6);   // click on the add address button
		Thread.sleep(800);
		WebElement element7 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/p/div[2]/div/div[3]/div/fieldset/div/label[2]/span[1]/span[1]/input"));
		jse.executeScript("arguments[0].click()", element7);   // click on the other checkbox option
		Thread.sleep(800);
		WebElement element8 = driver.findElement(By.xpath("//*[@id=\"bootstrap-input-other\"]"));
		element8.sendKeys("azam17");                          // write the location name
		Thread.sleep(800);
		WebElement element9 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/p/div[2]/div/div[5]/button"));
		jse.executeScript("arguments[0].click()", element9);   // click on the Add Address button
		Thread.sleep(800);
		//WebElement element10 = driver.findElement(By.id("<div class=\"ep-title\">azam123456</div>"));
		WebElement element10 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]"));
		//WebElement element10 = driver.findElement(By.linkText("azam1234567"));
		//*[@id="root"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[2]
		jse.executeScript("arguments[0].click()", element10);   // click on the address block for select address
		Thread.sleep(800);
		WebElement element11 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[1]/div/div[2]/div[2]/div/div/div/input"));
		element11.sendKeys("This is Automate Order ");
		Thread.sleep(800);
		//WebElement element12 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/div[2]/div[7]/button"));
		WebElement element12 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/section/div[2]/div/div[2]/div/div/div[2]/div[6]/button"));
		actions.moveToElement(element12);
		actions.perform();
		jse.executeScript("arguments[0].click()", element12);   // click on the Place Order Button
		System.out.println("Ordered Successfully");
		Thread.sleep(1500);
		Orderid = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/p/p[1]/span")).getText();
		//WebElement element13 = driver.findElement(By.xpath("body > div.MuiDialog-root.ep-modal.ep-cart-modal.ep-order-tracking-modal > div.MuiDialog-container.MuiDialog-scrollPaper > div > div.MuiDialogContent-root.ep-body > p > p:nth-child(2) > span"));
		///html/body/div[7]/div[3]/div/div[2]/p/p[1]/span
		System.out.println("Order id is : "+ Orderid);
		//Orderid.getText();
		//jse.executeScript("arguments[0],click()", element13);
		Thread.sleep(1500);
		WebElement element14 = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[3]/button[2]"));
		jse.executeScript("arguments[0].click()", element14);
		Thread.sleep(500);
		//OrderConformation(Orderid);
		
		
		
		
	}
	public void AdminLoginProcess() throws InterruptedException {
		Thread.sleep(1000);
		driver.get("https://stg-admin.medznmore.com/login");
		Thread.sleep(1000);
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/form/div[1]/div/input"));
		element1.sendKeys("azamtest@gmail.com");
		Thread.sleep(800);
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/form/div[2]/div/input"));
		element2.sendKeys("1234567");
		Thread.sleep(800);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/form/button"));
		jse.executeScript("arguments[0].click()", element3);
		
		
	}
	public void OrderConformation() throws InterruptedException {
		//driver.get("https://stg.medznmore.com/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement element1 = driver.findElement(By.xpath("//span[text() = 'B2C Orders']"));
															// Click on the B2C Orders option
		Actions actions = new Actions(driver);
		actions.moveToElement(element1);
		actions.perform();
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("//span[text() = 'All Orders']"));
		jse.executeScript("arguments[0].click()", element2);   // Click on the All Orders
		Thread.sleep(2000);
		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/div[2]/div[1]/div/div/input"));
		//OrderSearchedMedicine os = new  OrderSearchedMedicine();
		//os.OrderSearchedMedicineProcess();
		element3.sendKeys(Orderid);
		Thread.sleep(2000);
		WebElement element4 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr"));
		jse.executeScript("arguments[0].click()", element4);   // Click on the Searched Product
		Thread.sleep(2000);
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[4]/button[2]"));
		jse.executeScript("arguments[0].click()", element5);   // Click on the Mark Order Button
		Thread.sleep(1000);
		WebElement element6 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/ul/div[1]"));
		jse.executeScript("arguments[0].click()", element6);   // Click on the Confirm Option
		Thread.sleep(1000);
		WebElement element7 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/button[1]"));
		jse.executeScript("arguments[0].click()", element7);   // Click on the confirmation Button
		Thread.sleep(2000);
		WebElement element8 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[4]/button[2]"));
		jse.executeScript("arguments[0].click()", element8);   // Click on the Mark Order Button
		Thread.sleep(1000);
		WebElement element9 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/ul/div[2]"));
		jse.executeScript("arguments[0].click()", element9);   // Click on the Ready to Ship
		Thread.sleep(1000);
		WebElement element10 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/button[1]"));
		jse.executeScript("arguments[0].click()", element10);   // Click on the confirmation Button
		Thread.sleep(1000);
		WebElement element11 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div/div/a"));
		jse.executeScript("arguments[0].click()", element11);   // Click on the Order Button
		Thread.sleep(1000);
		WebElement element12 = driver.findElement(By.xpath("//span[text() ='Bulk Order Assignment']"));
		jse.executeScript("arguments[0].click()", element12);   // Click on the Bulk Order Assignment Button
		Thread.sleep(2000);
		WebElement element13 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/div[2]/div[1]/div/div/div/input"));
		//os.OrderSearchedMedicineProcess();
		element13.sendKeys(Orderid);
		Thread.sleep(2000);
		WebElement element14 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/table/tbody/tr/td[1]/span/span[1]/input"));
		jse.executeScript("arguments[0].click()", element14);   // Click on the Checkbox
		Thread.sleep(1000);
		WebElement element15 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[2]/button"));
		jse.executeScript("arguments[0].click()", element15);   // Click on the Assigned to tirp button
		Thread.sleep(1000);
		WebElement element16 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/ul/div[1]"));
		jse.executeScript("arguments[0].click()", element16);   // Click on the New Trip Option
		Thread.sleep(1000);
		WebElement element17 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[4]/button"));
		jse.executeScript("arguments[0].click()", element17);   // Click on the New Create Trip button
		Thread.sleep(1000);
		WebElement element18 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div/div[2]/div/button[1]"));
		jse.executeScript("arguments[0].click()", element18);   // Click on the New Trip View
		Thread.sleep(1000);
		WebElement element19 = driver.findElement(By.xpath("//span [text() ='Trips']"));
		jse.executeScript("arguments[0].click()", element19);   // Click on the New Trips
		Thread.sleep(1000);
		WebElement element20 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[8]/div/button"));
		jse.executeScript("arguments[0].click()", element20);   // Click on the Assign to rider
		Thread.sleep(2000);
		WebElement element21 = driver.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div/div/div[2]/div/table/tbody/tr[1]/td[2]"));
		jse.executeScript("arguments[0].click()", element21);   // Click on the rider fiftheeen
		Thread.sleep(2000);
		WebElement element22 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/button"));
		jse.executeScript("arguments[0].click()", element22);   // Click on the rider Confirm button
		Thread.sleep(2000);
		
		
		//OrderSearchedMedicineProcess()element13;
		
	}

}
