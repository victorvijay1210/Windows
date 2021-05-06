package winappsample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class waiter {
	static WebDriver driver;
	static WebDriver driver1;
	//static WebDriver driver1;
	public static void main(String[] args) throws Exception {
		
		//App lunch 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJAY\\eclipse-workspace\\winappsample\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\VIJAY\\eclipse-workspace\\winappsample\\drivers\\msedgedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\VIJAY\\AppData\\Local\\Programs\\posbytz\\POSBytz.exe");
		ChromeDriverService chromeservices = new ChromeDriverService.Builder().build();
		driver = new ChromeDriver(chromeservices, options);
		driver1= new  EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
     
		
		
		
		
	
        
        
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
          driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div[1]/ul/li[1]/a/span")).click();
          WebElement set = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div[1]/ul/li[8]/a/span"));
          js.executeScript("arguments[0].scrollIntoView();", set);
          set.click();
          WebElement gowaiter = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[13]/div/h5"));
          js.executeScript("arguments[0].scrollIntoView();", gowaiter);
          driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[13]/div/div/label/span")).click();
          driver1.navigate().to("http://localhost:3344/"); 
          driver1.findElement(By.xpath("/html/body/div[1]/ul/li[1]")).click();
          driver1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[1]/a")).click();
          driver1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/a")).click();
          driver1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[3]/a")).click();
          driver1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a")).click();
          driver1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/a")).click();
          driver1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/a")).click();
          Thread.sleep(2000);
          driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div")).click();
          driver1.findElement(By.id("js_add-order-submit")).click();
          Thread.sleep(2000);
          driver1.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div/div[1]")).click();
          driver1.findElement(By.xpath("/html/body/div[1]/div[3]/nav/button/small")).click();
	      driver1.findElement(By.xpath("/html/body/div[1]/div[2]/button[2]")).click();
	      Thread.sleep(2000);
	      driver1.close();
	  WebElement tab = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div[1]/ul/li[2]/a/span"));
	  js.executeScript("arguments[0].scrollIntoView();", tab);
	  tab.click();
	  driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[3]/div[2]/div[3]/div[3]/button")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[2]/div[3]/div/button[2]")).click();
	
	}

	
	
}
