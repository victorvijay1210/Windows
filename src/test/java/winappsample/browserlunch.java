package winappsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
public class browserlunch {
	
	String parentWindow = null;
	WebDriver driver;
	@BeforeTest
	public void launch() throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJAY\\eclipse-workspace\\winappsample\\Driver");
		ChromeOptions options = new ChromeOptions();
	
		options.setBinary("C:\\Users\\VIJAY\\AppData\\Local\\Programs\\posbytz\\POSBytz.exe");
		ChromeDriverService chromeservices = new ChromeDriverService.Builder().build();
		driver = new ChromeDriver(chromeservices, options);
     	parentWindow = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void test() throws InterruptedException {
		
		Set<String> childwindow = driver.getWindowHandles();
	
		for (String newWindows : childwindow) {
			driver.switchTo().window(newWindows);
		}
		
		 Thread.sleep(5000);
		  driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
		  driver.switchTo().defaultContent();
		  driver.findElement(By.xpath("//*[@id=\"__BVID__16\"]")).sendKeys("dunzo");
		  driver.findElement(By.xpath("//*[@id=\"__BVID__19\"]")).sendKeys("qwert@123");
		  driver.findElement(By.xpath("//*[@id=\"__BVID__22\"]")).sendKeys("CC855F77");
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div/div[1]/div/form/button")).click();
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div[2]/button")).click();
		  Thread.sleep(25000);
		 Set<String> allWindows = driver.getWindowHandles();
			  for (String newwin : allWindows) {
				driver.switchTo().window(newwin);
				}
			  driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
			  driver.switchTo().defaultContent();
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div/div[1]/div[2]/div[3]/div/p")).click();
			 
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[1]/button")).click();
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[2]/button")).click();
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[3]/button")).click();
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[1]/button")).click();
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[2]/button")).click();
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[3]/button")).click();
			 
			  Set<String> lastWin = driver.getWindowHandles();
			  for (String las : lastWin) {
				  driver.switchTo().window(las);
			}
			  driver.findElement(By.xpath("//*[@id=\"__BVID__53___BV_modal_footer_\"]/button")).click();
			  driver.switchTo().defaultContent();
			  driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/button")).click();
			 
	//SELL
			 
			  driver.findElement(By.xpath("//*[@id=\"items-block\"]/div[8]/div/div")).click();
			  driver.findElement(By.xpath("//*[@id=\"pay\"]")).click();
			  driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
			  driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/button")).click();
			 
			  }} 






	