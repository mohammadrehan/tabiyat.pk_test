package web_ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

//import org.testng.annotations.Test;
public class FooterTest {
	public static String browser = "edge"; // external configuration -XLS,CSV
	public static WebDriver driver;

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
		driver.get("https://tabiyat.pk/");
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//		driver.findElement(By.cssSelector("#root > div:nth-child(1) > footer > div.MuiContainer-root.MuiContainer-maxWidthLg > div > div.MuiGrid-root.ep_quicklinks.ep-about-us.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-12.MuiGrid-grid-md-3 > p > a > font > font")).click();
//		String actualUrla = "https://tabiyat.pk/";
//		String expectedUrla = driver.getCurrentUrl();
//		Assert.assertEquals(actualUrla, expectedUrla);
//		System.out.println("Tabiyat.pk Icon validated");
//		driver.get("https://tabiyat.pk/");
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//		driver.findElement(By.cssSelector("#root > div:nth-child(1) > footer > div.MuiContainer-root.MuiContainer-maxWidthLg > div > div.MuiGrid-root.ep_quicklinks.ep-about-us.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-12.MuiGrid-grid-md-3 > p > a")).click();
//		String actualUrlb = "https://tabiyat.pk/about-us";
//		String expectedUrlb = driver.getCurrentUrl();
//		Assert.assertEquals(actualUrlb, expectedUrlb);
//		System.out.println("Read More link validated");
		//driver.get("https://stg.medznmore.com/");
		//driver.get("https://tabiyat.pk/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(
				"#root > div:nth-child(1) > footer > div.MuiContainer-root.MuiContainer-maxWidthLg > div > div:nth-child(3) > a:nth-child(2)"))
				.click();
		// driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div/div[8]/a[1]")).click();
		//String actualUrl1 = "https://stg.medznmore.com/about-us";
		String actualUrl1 = "https://tabiyat.pk/about-us";
		String expectedUrl1 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl1, expectedUrl1);
		System.out.println("About us link validated");

		//driver.get("https://stg.medznmore.com/");
		driver.get("https://tabiyat.pk/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(
				"#root > div:nth-child(1) > footer > div.MuiContainer-root.MuiContainer-maxWidthLg > div > div:nth-child(3) > a:nth-child(3)"))
				.click();
		//String actualUrl2 = "https://stg.medznmore.com/refund-policy";
		String actualUrl2 = "https://tabiyat.pk/refund-policy";
		String expectedUrl2 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl2, expectedUrl2);
		System.out.println("Refund Policy link validated");

		//driver.get("https://stg.medznmore.com/");
		driver.get("https://tabiyat.pk/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(
				"#root > div:nth-child(1) > footer > div.MuiContainer-root.MuiContainer-maxWidthLg > div > div:nth-child(3) > a:nth-child(4)"))
				.click();
		//String actualUrl3 = "https://stg.medznmore.com/faqs/general-questions";
		String actualUrl3 = "https://tabiyat.pk/faqs/general-questions";
		String expectedUrl3 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl3, expectedUrl3);
		System.out.println("FAQs link validated");

		//driver.get("https://stg.medznmore.com/");
		driver.get("https://tabiyat.pk/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(
				"#root > div:nth-child(1) > footer > div.MuiContainer-root.MuiContainer-maxWidthLg > div > div:nth-child(3) > a:nth-child(5)"))
				.click();
		//String actualUrl4 = "https://stg.medznmore.com/how-to-quick-order";
		String actualUrl4 = "https://tabiyat.pk/how-to-quick-order";
		String expectedUrl4 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl4, expectedUrl4);
		System.out.println("How to create a quick order link validated");

		//driver.get("https://stg.medznmore.com/");
		driver.get("https://tabiyat.pk/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(
				"#root > div:nth-child(1) > footer > div.MuiContainer-root.MuiContainer-maxWidthLg > div > div:nth-child(3) > a:nth-child(6)"))
				.click();
		//String actualUrl5 = "https://stg.medznmore.com/term-and-conditions";
		String actualUrl5 = "https://tabiyat.pk/term-and-conditions";
		String expectedUrl5 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl5, expectedUrl5);
		System.out.println("Terms and Condition link validated");

		//driver.get("https://stg.medznmore.com/");
		driver.get("https://tabiyat.pk/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(
				"#root > div:nth-child(1) > footer > div.MuiContainer-root.MuiContainer-maxWidthLg > div > div:nth-child(3) > a:nth-child(7)"))
				.click();
		//String actualUrl6 = "https://stg.medznmore.com/privacy-policy";
		String actualUrl6 = "https://tabiyat.pk/privacy-policy";
		String expectedUrl6 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl6, expectedUrl6);
		System.out.println("Privacy Policy link validated");

		//driver.get("https://stg.medznmore.com/");
		driver.get("https://tabiyat.pk/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(
				"#root > div:nth-child(1) > footer > div.MuiContainer-root.MuiContainer-maxWidthLg > div > div:nth-child(3) > a:nth-child(8)"))
				.click();
		String actualUrl7 = "https://medznmore.zohorecruit.com/jobs/Careers";
		String expectedUrl7 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl7, expectedUrl7);
		System.out.println("Careers link validated");
		driver.quit();

		//driver.get("https://stg.medznmore.com/");
		driver.get("https://tabiyat.pk/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(
				"#root > div:nth-child(1) > footer > div.MuiContainer-root.MuiContainer-maxWidthLg > div > div:nth-child(4) > a"))
				.click();
		//String actualUrl8 = "https://stg.medznmore.com/quick-order/Upload";
		String actualUrl8 = "https://tabiyat.pk/quick-order/Upload";
		String expectedUrl8 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl8, expectedUrl8);
		System.out.println("Quick Order link validated");
		
		//driver.get("https://stg.medznmore.com/");
		driver.get("https://tabiyat.pk/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#root > div:nth-child(1) > footer > div.MuiContainer-root.MuiContainer-maxWidthLg > div > div:nth-child(5) > a:nth-child(2) > font > font")).click();
		driver.quit();
		
		driver.findElement(By.cssSelector("#root > div:nth-child(1) > footer > div.MuiContainer-root.MuiContainer-maxWidthLg > div > div.MuiGrid-root.ep_quicklinks.ep_follow_us_quicklink.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-true.MuiGrid-grid-md-true > div > a:nth-child(1) > img.pp-hover-icon")).click();
		String actualUrl9 = "https://www.facebook.com/TabiyatPk";
		String expectedUrl9 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl9, expectedUrl9);
		System.out.println("Facebook Icon validated");
		driver.quit();
		
		driver.findElement(By.cssSelector("#root > div:nth-child(1) > footer > div.MuiContainer-root.MuiContainer-maxWidthLg > div > div.MuiGrid-root.ep_quicklinks.ep_follow_us_quicklink.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-true.MuiGrid-grid-md-true > div > a:nth-child(2) > img:nth-child(2)")).click();
		String actualUrl10 = "https://twitter.com/tabiyatpk";
		String expectedUrl10 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl10, expectedUrl10);
		System.out.println("Twitter Icon validated");
		driver.quit();
		
		driver.findElement(By.cssSelector("#root > div:nth-child(1) > footer > div.MuiContainer-root.MuiContainer-maxWidthLg > div > div.MuiGrid-root.ep_quicklinks.ep_follow_us_quicklink.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-true.MuiGrid-grid-md-true > div > a:nth-child(3) > img:nth-child(2)")).click();
		String actualUrl11 = "https://www.linkedin.com/company/medznmore";
		String expectedUrl11 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl11, expectedUrl11);
		System.out.println("Linkedin Icon validated");
		driver.quit();
		
		driver.findElement(By.cssSelector("#root > div:nth-child(1) > footer > div.MuiContainer-root.MuiContainer-maxWidthLg > div > div.MuiGrid-root.ep_quicklinks.ep_follow_us_quicklink.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-true.MuiGrid-grid-md-true > div > a:nth-child(4) > img:nth-child(2)")).click();
		String actualUrl12 = "https://www.instagram.com/tabiyatpk/";
		String expectedUrl12 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl12, expectedUrl12);
		System.out.println("Instagram Icon validated");
		driver.quit();

//		@Test(description="Validation of About page ");
//		@Test(priority=1);    // take priority of test cases number vise
//		@Test(dependsOnMethod=”Login”);  // dependent method if you see the profile you should to execute th login test case
//		@Test(enabled=’true’);  // Setting it to true execute it and setting it to false will skip the test from the execution cycle
//		@Test(groups=”Smoke Suite”);   //
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/footer/div[1]/div/div[8]/a[2]")).click();
//		String actualUrl ="https://tabiyat.pk/refund-policy";
//		String expectedUrl= driver.getCurrentUrl();
//		Assert.assertEquals(actualUrl, expectedUrl);

	}

}
