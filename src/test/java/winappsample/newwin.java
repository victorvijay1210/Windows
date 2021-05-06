package winappsample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class newwin {
	static WebDriver driver;
//	static String parentWindow = null;

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJAY\\eclipse-workspace\\winappsample\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	
		options.setBinary("C:\\Users\\VIJAY\\AppData\\Local\\Programs\\posbytz\\POSBytz.exe");
		ChromeDriverService chromeservices = new ChromeDriverService.Builder().build();
		driver = new ChromeDriver(chromeservices, options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     	String parent = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		for (String newWindows : childwindow) {
			driver.switchTo().window(newWindows);
		}
		 Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
		  driver.switchTo().defaultContent();
		  driver.findElement(By.xpath("//*[@id=\"__BVID__16\"]")).sendKeys("dunzonew");
		  driver.findElement(By.xpath("//*[@id=\"__BVID__19\"]")).sendKeys("qwert@123");
		  driver.findElement(By.xpath("//*[@id=\"__BVID__22\"]")).sendKeys("EA1ED908");
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div/div[1]/div/form/button")).click();
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div[2]/button")).click();
		  Thread.sleep(25000);
		  
		  Set<String> allWindows = driver.getWindowHandles();
		  for (String newwin : allWindows) {
			driver.switchTo().window(newwin);
			}
		  driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
		  driver.switchTo().defaultContent();
		  driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[1]/div[2]/div[3]/div")).click();
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[1]/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[2]/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[3]/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[1]/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[2]/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[3]/button")).click();
		  Thread.sleep(3000);
		  
		  Set<String> lastWin = driver.getWindowHandles();
		  for (String las : lastWin) {
			  driver.switchTo().window(las);
		}
		  


		  driver.findElement(By.xpath("//*[@id=\"__BVID__53___BV_modal_footer_\"]/button")).click();
		  driver.switchTo().defaultContent();
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"items-block\"]/div[8]/div/div")).click();
		  driver.findElement(By.xpath("//*[@id=\"pay\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/button")).click();
		 driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[1]/div[2]/div/div[2]/a")).click();
		 
		 Set<String> clockout = driver.getWindowHandles();
		  for (String las1 : clockout) {
			  driver.switchTo().window(las1);
		}
		  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/footer/button[2]")).click();
		  driver.switchTo().defaultContent();
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[1]/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[2]/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[3]/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[1]/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[2]/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[3]/button")).click();
		  
		  
		  }


	

		
	

}
