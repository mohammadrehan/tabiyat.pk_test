package admin_pannel.PurchaseOrder;
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
import org.w3c.dom.Element;

public class PurchaseOrders {
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
		PurchaseOrdersProcess();
		POAssigmentProcess();
		POReceivingProcess();

	}
	
	public static void LoginProcess() throws InterruptedException {
		driver.get("https://stageadmin.medznmore.com/login");
		//driver.get("http://localhost:8080/login");
		//Thread.sleep(1000);
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/form/div[1]/div/input"));
		element1.sendKeys("azamtest@gmail.com");
		//Thread.sleep(800);
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/form/div[2]/div/input"));
		element2.sendKeys("1234567");
		//Thread.sleep(800);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/form/button"));
		jse.executeScript("arguments[0].click()", element3);
		
	}
	// Login Process Complete 
	
	public static void PurchaseOrdersProcess() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		new WebDriverWait(driver, Duration.ofSeconds(10));
		

		//Thread.sleep(2000);
		//Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement element1a = new WebDriverWait(driver, Duration.ofSeconds(6))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text() = 'Purchase Orders']")));
		//WebElement element1 = driver.findElement(By.xpath("//span[text() = 'Purchase Orders']"));
															// Click on the Purchase orders option
		Actions actions = new Actions(driver);
		actions.moveToElement(element1a);
		actions.perform();
		//Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("//span[text() = 'PO Management']"));
		jse.executeScript("arguments[0].click()", element2);   // Click on the PO Management
		//Thread.sleep(2000);
		WebElement element3a = new WebDriverWait(driver, Duration.ofSeconds(4))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/a")));
		//WebElement element3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/a"));
		jse.executeScript("arguments[0].click()", element3a);   // Click on the CREATE
		//Thread.sleep(2000);
		WebElement element4a = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"store-dropdown\"]")));
		//WebElement element4 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div/div/div/button[2]"));
		jse.executeScript("arguments[0].click()", element4a);   // Click on the Store Dropdown
		//Thread.sleep(200);
		element4a.sendKeys("Pechs");
		//Thread.sleep(300);
		
		element4a.sendKeys(Keys.ARROW_DOWN);
		//Thread.sleep(300);
		element4a.sendKeys(Keys.ARROW_DOWN);
		//Thread.sleep(300);
		//element4a.sendKeys(Keys.ARROW_DOWN);
		//Thread.sleep(300);
		//element4a.sendKeys(Keys.ARROW_DOWN);
		//Thread.sleep(300);
		element4a.sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
		//WebElement element5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/button[2]"));
		WebElement element5a = driver.findElement(By.xpath("//*[@id=\"distributor-dropdown\"]"));
		//jse.executeScript("arguments[0].click()", element5);   // Click on the Distributer dropdown
		//Thread.sleep(1000);
		element5a.sendKeys("Real");
		//Thread.sleep(1000);
		element5a.sendKeys(Keys.ARROW_DOWN);
		//Thread.sleep(300);
		element5a.sendKeys(Keys.ARROW_DOWN);
		//Thread.sleep(300);
//		element5.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(300);
//		element5.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(300);
		element5a.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//WebElement element6 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div/button[2]"));
		WebElement element6a = driver.findElement(By.xpath("//*[@id=\"store-product-dropdown\"]"));
		//jse.executeScript("arguments[0].click()", element6);   // Click on the Products dropdown
		Thread.sleep(1000);
		element6a.sendKeys("Augmentin bd");
		Thread.sleep(3000);
		element6a.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(300);
		element6a.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(300);
		element6a.sendKeys(Keys.ENTER);
		Thread.sleep(800);
		WebElement element7 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/table/tbody/tr/td[5]/div/div/input"));
		element7.sendKeys("00");
		Thread.sleep(800);
		WebElement element8 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[4]/button"));
		jse.executeScript("arguments[0].click()", element8);   // Click on the CREATE PO 
		Thread.sleep(1000);
		WebElement element9 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/button[1]"));
		jse.executeScript("arguments[0].click()", element9);   // Click on the CREATE PO Conformation
		Thread.sleep(4000);
		//WebElement element10 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr[1]/td[9]/button[1]"));
		WebElement element10 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr[1]/td[10]/button[1]"));
		
		jse.executeScript("arguments[0].click()", element10);   // Click on the PO Conform icon
		Thread.sleep(1000);
		WebElement element11 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/button[1]"));
		jse.executeScript("arguments[0].click()", element11);   // Click on the PO Conformtion button
		Thread.sleep(500);
		System.out.println("PO created and confirmed");
		
	}
	// PO created and confirmed
	
	public static void POAssigmentProcess() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement element1 = driver.findElement(By.xpath("//span[text() = 'Purchase Orders']"));
															// Move to the Purchase orders option
		Actions actions = new Actions(driver);
		actions.moveToElement(element1);
		actions.perform();
		Thread.sleep(1000);
		WebElement element2 = driver.findElement(By.xpath("//span[text() = 'PO Assignment']"));
		jse.executeScript("arguments[0].click()", element2);   // Click on the PO Assignment.
		Thread.sleep(4000);
		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr[1]/td[12]/button[2]"));
		//WebElement element3 = driver.findElement(By.cssSelector("#root > div > div.main-section > div.route-root > div > div > div.MuiPaper-root.MuiTableContainer-root.MuiPaper-outlined.MuiPaper-rounded > table > tbody > tr:nth-child(1) > td:nth-child(11) > button.MuiButtonBase-root.MuiIconButton-root.ml-2.MuiIconButton-sizeSmall"));
		jse.executeScript("arguments[0].click()", element3);   // Click on the Assignment icon
		Thread.sleep(1000);
		WebElement element4 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div/div/div/button[2]"));
		jse.executeScript("arguments[0].click()", element4);   // Click on the Assignment dropdown
		Thread.sleep(800);
		element4.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(300);
		element4.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(300);
		element4.sendKeys(Keys.ENTER);
		Thread.sleep(800);
		WebElement element5 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[3]/button[1]"));
		jse.executeScript("arguments[0].click()", element5);   // Click on the PO Assign button.
		Thread.sleep(500);
		System.out.println("Purchase Order Assigned");
	}
	// Purchase order Assigned
	
	public static void POReceivingProcess() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement element1 = driver.findElement(By.xpath("//span[text() = 'Purchase Orders']"));
															// Move to the Purchase orders option
		Actions actions = new Actions(driver);
		actions.moveToElement(element1);
		actions.perform();
		Thread.sleep(1000);
		WebElement element2 = driver.findElement(By.xpath("//span[text() = 'PO Receiving']"));
		jse.executeScript("arguments[0].click()", element2);   // Click on the PO Receiving.
		Thread.sleep(4000);
		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr[1]/td[14]/button"));
		//WebElement element3 = driver.findElement(By.cssSelector("#root > div > div.main-section > div.route-root > div > div > div.MuiPaper-root.MuiTableContainer-root.MuiPaper-outlined.MuiPaper-rounded > table > tbody > tr:nth-child(1) > td:nth-child(13) > button"));
		jse.executeScript("arguments[0].click()", element3);   // Click on the Action Icon.
		Thread.sleep(3000);
		WebElement element4 = driver.findElement(By.cssSelector("#root > div > div.main-section > div.route-root > div > div.customers-root > div > div:nth-child(5) > div.MuiPaper-root.MuiTableContainer-root.MuiPaper-outlined.MuiPaper-rounded > table > tbody > tr > td:nth-child(8) > button"));
		jse.executeScript("arguments[0].click()", element4);   // Click on the Action Icon on the selected PO.
		Thread.sleep(1000);
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"batch-number\"]"));
		
	//-------------------ENTER THE BATCH NUMBER-----------------------//	
		element5.sendKeys("1088");			// Enter Batch Number
	//-------------------ENTER THE BATCH NUMBER-----------------------//	
				
		Thread.sleep(500);
		WebElement element6 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[3]/div[2]/div/button"));
		jse.executeScript("arguments[0].click()", element6);   // Click on the Check Batch.
		Thread.sleep(1000);
//		WebElement element7 = driver.findElement(By.xpath("//div[text() = 'Batch found. Check previous values of batch below.']"));
//		if(element7.getText() == "Batch found. Check previous values of batch below.") {
//			element5.sendKeys("1231");
//			Thread.sleep(500);
//		}
//		else {
//			Thread.sleep(500);
//			jse.executeScript("arguments[0].click()", element6);   // Click on the Check Batch.
//			System.out.println("Batch not found");
//		}
		WebElement element8 = driver.findElement(By.xpath("//*[@id=\"batchExpiry\"]"));
		element8.sendKeys("3-10-002022");    // Enter Batch Expiry Date
		Thread.sleep(500);
		WebElement element9 = driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
		element9.sendKeys("100");           // Enter Quantity
		Thread.sleep(500);
		WebElement element10 = driver.findElement(By.xpath("//*[@id=\"foc\"]"));
		element10.sendKeys("0");           // Enter FOC
		Thread.sleep(500);
		WebElement element11 = driver.findElement(By.xpath("//*[@id=\"tradePrice\"]"));
		element11.sendKeys("100");         // Enter Trade Price
		Thread.sleep(500);
		WebElement element12 = driver.findElement(By.xpath("//*[@id=\"retailPrice\"]"));
		element12.sendKeys("120");         // Enter Retial Price
		Thread.sleep(500);
		WebElement element13 = driver.findElement(By.xpath("//*[@id=\"discountRate\"]"));
		element13.sendKeys("17");           // Enter DiscountRate
		Thread.sleep(500);
		WebElement element14 = driver.findElement(By.xpath("//*[@id=\"discountType\"]"));
		Thread.sleep(500);
		//jse.executeScript("arguments[0].click()", element14);   // Click on the Add Batch.
		element14.sendKeys(Keys.ARROW_DOWN);
		
//		Thread.sleep(500);
//		element14.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(500);
		Thread.sleep(1000);
		WebElement element14a = driver.findElement(By.xpath("//*[@id=\"menu-discountType\"]/div[3]/ul/li[1]"));
		element14a.sendKeys(Keys.ENTER);    // Select the Discount type in percetage
		Thread.sleep(4000);
		//element14a.clear();
		WebElement element14b = driver.findElement(By.xpath("//*[@id=\"discountType\"]"));
		element14b.sendKeys(Keys.TAB);
		Thread.sleep(500);
		//element14.sendKeys(Keys.ENTER);    // Select the Discount type in percetage
		WebElement element15 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[8]/div/button"));
		jse.executeScript("arguments[0].click()", element15);   // Click on the Add Batch.
		Thread.sleep(1000);
		WebElement element16 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[8]/button[2]"));
		jse.executeScript("arguments[0].click()", element16);   // Click on the SAVE.
		Thread.sleep(2000);
		WebElement element17 = driver.findElement(By.xpath("//*[@id=\"invoiceNumber\"]"));
		
		//-------------------ENTER THE PO INVOICE NUMBER-----------------------//
		element17.sendKeys("14");			// Enter the PO Invoice Number
		//-------------------ENTER THE PO INVOICE NUMBER-----------------------//
		
		WebElement element18 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[5]/button"));
		jse.executeScript("arguments[0].click()", element18);   // Click on the PO RECEIVED.
		Thread.sleep(800);
		WebElement element19 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/button[1]"));
		jse.executeScript("arguments[0].click()", element19);   // Click on the PO RECEIVED Conformation button.
		System.out.println("PO Received");
	}
	// PO Received
	//*[@id="distributor-dropdown"]
	//*[@id="root"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div

}
