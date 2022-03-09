package web_ui;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Jamal_Login {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stg.medznmore.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"bootstrap-input\"][1]"));
		element1.sendKeys("3121246912");
		//JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		//jse1.executeScript("arguments[0].click()", element1);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[2]/div[2]/button[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"bootstrap-input\"][2]")).sendKeys("HONDAkee7519");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div[3]/div/button/span")).click();

	}

}
