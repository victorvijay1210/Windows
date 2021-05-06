package winappsample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class wintest {
	
	public static WindowsDriver driver = null;
	
	
	@BeforeClass
	public void setup() throws Throwable {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("app", "C:\\Users\\VIJAY\\AppData\\Local\\Programs\\posbytz\\POSBytz.exe");
		cap.setCapability("platformName", "Windows");
		cap.setCapability("deviceName", "WindowsPC");
		

		
		try {
			driver= new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	

		Thread.sleep(50000);
				
	}
	
	
	
	@Test
	public void close() throws Exception {
			
		
WebElement ele = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/footer/button"));
		System.out.println(ele.getText());
               
        }
		

		
	
}
	
	
	
	
	
	
	


