package web_ui;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import static org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignupTest {
	public static String browser = "chrome"; // external configuration -XLS,CSV
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		driver.get("https://stg.medznmore.com/signup");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		

		driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[1]")).sendKeys("Test",Keys.TAB);
		driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[2]")).sendKeys("test18@gmail.com",Keys.TAB);
		driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[3]")).sendKeys("3880000036",Keys.TAB);
		driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[4]")).sendKeys("Abdulazam19",Keys.TAB);
		driver.findElement(By.xpath("(//*[@id=\"bootstrap-input\"])[5]")).sendKeys("Abdulazam19",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[3]/div/button")).click();
		//driver.findElement(By.cssSelector("(#root > div:nth-child(1) > div.ep-parent-column.ep-top-space > div > div:nth-child(1) > div > div > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-12.MuiGrid-grid-md-7.MuiGrid-grid-lg-6 > div > div.ep-foot > div > button)[1]")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#root > div:nth-child(1) > div.ep-parent-column.ep-top-space > div > div:nth-child(1) > div > div > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-12.MuiGrid-grid-md-7.MuiGrid-grid-lg-6 > div > div.ep-user-form.ep-verification-form > div.MuiFormControl-root.ep-form-control > div:nth-child(1) > input")).sendKeys("1");
		driver.findElement(By.cssSelector("#root > div:nth-child(1) > div.ep-parent-column.ep-top-space > div > div:nth-child(1) > div > div > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-12.MuiGrid-grid-md-7.MuiGrid-grid-lg-6 > div > div.ep-user-form.ep-verification-form > div.MuiFormControl-root.ep-form-control > div:nth-child(2) > input")).sendKeys("2");
		driver.findElement(By.cssSelector("#root > div:nth-child(1) > div.ep-parent-column.ep-top-space > div > div:nth-child(1) > div > div > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-12.MuiGrid-grid-md-7.MuiGrid-grid-lg-6 > div > div.ep-user-form.ep-verification-form > div.MuiFormControl-root.ep-form-control > div:nth-child(3) > input")).sendKeys("3");
		driver.findElement(By.cssSelector("#root > div:nth-child(1) > div.ep-parent-column.ep-top-space > div > div:nth-child(1) > div > div > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-12.MuiGrid-grid-md-7.MuiGrid-grid-lg-6 > div > div.ep-user-form.ep-verification-form > div.MuiFormControl-root.ep-form-control > div:nth-child(4) > input")).sendKeys("4");
		driver.findElement(By.cssSelector("#root > div:nth-child(1) > div.ep-parent-column.ep-top-space > div > div:nth-child(1) > div > div > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-12.MuiGrid-grid-md-7.MuiGrid-grid-lg-6 > div > div.ep-user-form.ep-verification-form > div.MuiFormControl-root.ep-form-control > div:nth-child(5) > input")).sendKeys("5");
		driver.findElement(By.cssSelector("#root > div:nth-child(1) > div.ep-parent-column.ep-top-space > div > div:nth-child(1) > div > div > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-12.MuiGrid-grid-md-7.MuiGrid-grid-lg-6 > div > div.ep-user-form.ep-verification-form > div.MuiFormControl-root.ep-form-control > div:nth-child(6) > input")).sendKeys("6");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[3]/div/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[3]/div/button")).click();
		//driver.findElement(By.cssSelector("(#root > div:nth-child(1) > div.ep-parent-column.ep-top-space > div > div:nth-child(1) > div > div > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-12.MuiGrid-grid-md-7.MuiGrid-grid-lg-6 > div > div.ep-foot > div > button)[2]")).click();

	}

}
