package StepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageFactory.page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class testcase {

	WebDriver driver = null;
	static String parent = null;
	page pg;
	
		
	
	@After
	public void embedScreenshotOnFail(Scenario scenario) {

		if (scenario.isFailed()) {

			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
			driver.close();
			driver.quit();

		}

	
	}
	
	@Before("@smoketest10")
	public void login_zomato_order_account() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIJAY\\git\\Pos-Complete\\Windows\\driver\\chromedriver.exe");
		ChromeOptions optionss = new ChromeOptions();
		optionss.setBinary("C:\\Users\\VIJAY\\AppData\\Local\\Programs\\posbytz\\POSBytz.exe");
		ChromeDriverService chromeservicesnew = new ChromeDriverService.Builder().build();
		driver = new ChromeDriver(chromeservicesnew, optionss);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		parent = driver.getWindowHandle();
		Set<String> childwindow01 = driver.getWindowHandles();
		for (String newWindows01 : childwindow01) {
			driver.switchTo().window(newWindows01);
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[1]/div/form/div[1]/fieldset/div/input"))
				.sendKeys("cloudasif");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[1]/div/form/div[2]/fieldset/div/div/input"))
				.sendKeys("qwert@123");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[1]/div/form/div[3]/fieldset/div/input"))
				.sendKeys("4158F3D6");
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div/div[1]/div/form/button")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div[2]/button")).click();
		Thread.sleep(25000);
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div/div[1]/div[2]/div[3]/div/p")).click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[1]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[2]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[3]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[1]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[2]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[3]/button"))
				.click();

		Set<String> opencashWin01 = driver.getWindowHandles();
		for (String cashdrawer01 : opencashWin01) {
			driver.switchTo().window(cashdrawer01);
		}
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/footer/button")).click();

		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/button")).click();
		Thread.sleep(5000);
		
		
	}
	
	
	 @Given("^Opening posbytz app login$")
	    public void opening_posbytz_app_login() throws Throwable {

		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\VIJAY\\git\\Pos-Complete\\Windows\\driver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Users\\VIJAY\\AppData\\Local\\Programs\\posbytz\\POSBytz.exe");
			ChromeDriverService chromeservices = new ChromeDriverService.Builder().build();
			driver = new ChromeDriver(chromeservices, options);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			parent = driver.getWindowHandle();
			Set<String> childwindow1 = driver.getWindowHandles();
			for (String newWindows1 : childwindow1) {
				driver.switchTo().window(newWindows1);
			}
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
			driver.switchTo().defaultContent();
			Thread.sleep(10000);
			driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[1]/div/form/div[1]/fieldset/div/input"))
					.sendKeys("automation");
			driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[1]/div/form/div[2]/fieldset/div/div/input"))
					.sendKeys("qwert@123");
			driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[1]/div/form/div[3]/fieldset/div/input"))
					.sendKeys("2884B551");
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div/div[1]/div/form/button")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div[2]/button")).click();
			Thread.sleep(25000);
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div/div[1]/div[2]/div[3]/div/p")).click();
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[1]/button"))
					.click();
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[2]/button"))
					.click();
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[3]/button"))
					.click();
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[1]/button"))
					.click();
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[2]/button"))
					.click();
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[3]/button"))
					.click();

			Set<String> opencashWin = driver.getWindowHandles();
			for (String cashdrawer : opencashWin) {
				driver.switchTo().window(cashdrawer);
			}
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/footer/button")).click();

			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/button")).click();
			Thread.sleep(5000);
			WebElement setting = driver
					.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div[1]/ul/li[8]/a/span"));
			js.executeScript("arguments[0].scrollIntoView();", setting);
			setting.click();
			WebElement gowaiter = driver.findElement(
					By.xpath("/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[13]/div/h5"));
			js.executeScript("arguments[0].scrollIntoView();", gowaiter);
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[13]/div/div/label/span"))
					.click();
			driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[1]/ul/a[3]")).click();
			WebElement sell = driver
					.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div[1]/ul/li[1]/a/span"));
			js.executeScript("arguments[0].scrollIntoView();", sell);
			sell.click();
			
	 
	 }

	 
	 
	@Given("^complete one order with cash sale$")
	public void complete_one_order_with_cash_sale() throws Throwable {
		pg = new page(driver);
		pg.click_item_name();
		pg.click_checkout_button();
		pg.click_Confirm_button();
		pg.click_ok_button();
		driver.close();

	}

	@Then("^complete one order with split sale$")
	public void complete_one_order_with_split_sale() throws Throwable {

		pg = new page(driver);
		pg.click_item_name();
		pg.click_checkout_button();
		pg.click_split_button();
		pg.click_selectpayment_button();
		pg.select_payment_mode();
		pg.click_Confirm_button();
		pg.click_ok_button();
		driver.close();

	}

	@And("^create customer with (.+) and (.+) and complete credit sale$")
	public void create_customer_with_and_and_complete_credit_sale(String customername, String phonenumber)
			throws Throwable {

		pg = new page(driver);
		pg.click_item_name();
		pg.click_checkout_button();
		pg.click_credit_button();
		pg.click_customer_add_button();
		pg.enter_customer_phonenumber(phonenumber);
		pg.enter_customer_name(customername);
		pg.enter_customer_credit();
		pg.enter_customer_save();
		pg.click_customer_success();
		pg.click_Confirm_button();
		pg.click_ok_button();
		Thread.sleep(5000);
		driver.close();

	}

	@Given("^Complete discounted order with modifier and tips$")
	public void add_items_in_cart_with_modifiers_scenario() throws Throwable {

		pg = new page(driver);
		pg.click_item_with_modifier();
		pg.add_tips();
		pg.add_discount();
		pg.click_checkout_button();
		pg.click_Confirm_button();
		pg.click_ok_button();
		driver.close();

	}

	@Given("^add one item to table$")
	public void add_one_item_to_table() throws Throwable {

		pg = new page(driver);
		pg.add_order_in_table();

	}

	@Then("^again add another item to the same table$")
	public void again_add_another_item_to_the_same_table() throws Throwable {

		pg = new page(driver);
		pg.add_another_order_in_table();

	}

	@And("^go to table edit the order by adding new item and complete order$")
	public void go_to_table_edit_the_order_by_adding_new_item_and_complete_order() throws Throwable {

		pg = new page(driver);
		pg.edit_table_order();
		driver.close();

	}

	@Given("^Open the waiter app in browser by using (.+) and place order with modifier$")
	public void open_the_waiter_app_in_browser_by_using_and_place_order_with_modifier(String ip) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIJAY\\git\\Pos-Complete\\Windows\\latest chrome driver\\chromedriver.exe");
		WebDriver drivernew = new ChromeDriver();
		drivernew.navigate().to(ip);
		drivernew.manage().window().maximize();
		drivernew.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(drivernew,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/ul/li")));
		WebElement employeelogin = drivernew.findElement(By.xpath("/html/body/div[1]/ul/li"));
		employeelogin.click();
		WebElement one = drivernew.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[1]/a"));
		one.click();
		WebElement two = drivernew.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/a"));
		two.click();
		WebElement three = drivernew.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[3]/a"));
		three.click();
		WebElement four = drivernew.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a"));
		four.click();
		WebElement five = drivernew.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/a"));
		five.click();
		WebElement six = drivernew.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/a"));
		six.click();
        Thread.sleep(5000);
		WebElement tableselect = drivernew.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div"));
		tableselect.click();
        Thread.sleep(5000);
		WebElement tablesubmit = drivernew.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/form/div[3]/button"));
		tablesubmit.click();
        Thread.sleep(5000);
		WebElement addorange = drivernew
				.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[1]"));
		addorange.click();
		WebElement clickmodifier = drivernew
				.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div/div[1]/div/input"));
		clickmodifier.click();
		WebElement addmodifier = drivernew.findElement(By.xpath("/html/body/div[7]/div/div/div[3]/button"));
		addmodifier.click();
		WebElement close1 = drivernew.findElement(By.xpath("/html/body/div[1]/div[3]/nav/button/small"));
		close1.click();
		WebElement submit1 = drivernew.findElement(By.xpath("/html/body/div[1]/div[2]/button[2]"));
		submit1.click();
		WebElement clickadditems = drivernew.findElement(By.xpath("/html/body/div[1]/div[7]/a"));
		clickadditems.click();
		WebElement addapple = drivernew
				.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[1]/div/div[2]/div/div[1]"));
		addapple.click();
		WebElement close2 = drivernew.findElement(By.xpath("/html/body/div[1]/div[3]/nav/button"));
		close2.click();
		WebElement submit2 = drivernew.findElement(By.xpath("/html/body/div[1]/div[2]/button[2]"));
		submit2.click();
		drivernew.close();
	}

	@And("^complete the waiter app order in table$")
	public void complete_the_waiter_app_order_in_table() throws Throwable {

		pg = new page(driver);
		pg.waiter_app_order_complete();
		driver.close();

	}

	@Given("^open (.+) app and place one selfpickup order$")
	public void open_app_and_place_one_selfpickup_order(String customerweb) throws Throwable {
    
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIJAY\\git\\Pos-Complete\\Windows\\latest chrome driver\\chromedriver.exe");
		WebDriver drivernew1 = new ChromeDriver();
		drivernew1.navigate().to(customerweb);
		drivernew1.manage().window().maximize();
		drivernew1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor je = (JavascriptExecutor) drivernew1;
		WebElement baselogin = drivernew1
				.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/nav[1]/ul[2]/li[2]/a[1]"));
		baselogin.click();
		WebElement username = drivernew1.findElement(By.xpath("//input[@id='mobile-number']"));
		username.sendKeys("9841205708");
		WebElement next = drivernew1.findElement(By.xpath("//button[contains(text(),'Next')]"));
		next.click();
		Thread.sleep(3000);

		WebElement password = drivernew1.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[2]/div[1]/div[1]/div[1]/input[1]"));
		password.sendKeys("qwert@123");
		WebElement login = drivernew1.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
		Thread.sleep(2000);
		WebElement startshopping = drivernew1.findElement(
				By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]"));
		startshopping.click();
		WebElement applejuice = drivernew1.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]"));
		applejuice.click();
		je.executeScript("window.scrollBy(0,1000)");
		WebElement orangejuice = drivernew1.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[4]/div[1]/div[3]/div[1]/button[1]"));
		orangejuice.click();
		WebElement addingmodifier = drivernew1.findElement(By.xpath("//p[contains(text(),'Chaco Juice')]"));
		addingmodifier.click();
		WebElement addingitem = drivernew1.findElement(By.xpath("//button[contains(text(),'Add Item')]"));
		addingitem.click();
		WebElement cart = drivernew1.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/nav[1]/ul[2]/li[1]/a[1]"));
		cart.click();
		WebElement checkout = drivernew1.findElement(By.xpath("//button[contains(text(),'CHECKOUT')]"));
		checkout.click();
		WebElement selfpickup = drivernew1.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/fieldset/div/div/div[2]/label/span"));
		je.executeScript("arguments[0].scrollIntoView();", selfpickup);
		selfpickup.click();
		Thread.sleep(5000);
		WebElement confirmandcheckout = drivernew1.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div[2]/div[1]/div/button/span"));
		confirmandcheckout.click();
		Thread.sleep(5000);
		drivernew1.close();

	}

	@Then("^complete the online order in pos$")
	public void complete_the_online_order_in_pos() throws Throwable {

		pg = new page(driver);
		pg.online_order_complete();
		driver.close();
	}
	
	
	  @Given("^Add item to cart and choose customer$")
	    public void add_item_to_cart_and_choose_customer() throws Throwable {
	        
		  pg = new page(driver);
		  pg.add_items_to_cart();
		  
		  
	    }
	  
	  @Then("^click check for loyalty then apply discount and complete the order$")
	    public void click_check_for_loyalty_then_apply_discount_and_complete_the_order() throws Throwable {
	       
		  pg = new page(driver);
		  pg.add_customer_add_loalty_order_complete();
		
	    }

	  @Given("^Add order with notes in cart move to table$")
	    public void add_order_with_notes_in_cart_move_to_table() throws Throwable {
        
		  pg = new page(driver);
		  
		  pg.add_items_to_cart_with_notes_move_to_table();
		  
	  }

	  @Then("^open (.+)take  and complete the order status$")
	    public void open_take_and_complete_the_order_status(String kitchendisplay) throws Throwable {

		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\VIJAY\\git\\Pos-Complete\\Windows\\latest chrome driver\\chromedriver.exe");
			WebDriver drivernew2 = new ChromeDriver();
			drivernew2.navigate().to(kitchendisplay);
			drivernew2.manage().window().maximize();
			drivernew2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(drivernew2,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'common kitchen')]")));
			WebElement commonkitchen = drivernew2.findElement(By.xpath("//a[contains(text(),'common kitchen')]"));
			commonkitchen.click();
			Thread.sleep(2000);
			WebElement accept = drivernew2.findElement(By.xpath("//div[contains(text(),'accept')]"));
			accept.click();
			Thread.sleep(3000);
			WebElement ready = drivernew2.findElement(By.xpath("//div[contains(text(),'ready')]"));
			ready.click();
			Thread.sleep(3000);
			WebElement dispatched = drivernew2.findElement(By.xpath("//div[contains(text(),'dispatched')]"));
			dispatched.click();
			Thread.sleep(3000);
			drivernew2.close();
	  
	  
	  }
	  
	  
	  @And("^back to poscomplete go to table and complete the order$")
	    public void back_to_poscomplete_go_to_table_and_complete_the_order() throws Throwable {

		  pg = new page(driver);
		  pg.waiter_app_order_complete();
		  driver.close();
	  
	  }
	  
	  @Given("^Open test satelite and place one order$")
	    public void open_test_satelite_and_place_one_order() throws Throwable {
       
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\VIJAY\\git\\Pos-Complete\\Windows\\latest chrome driver\\chromedriver.exe");
			WebDriver drivernew3 = new ChromeDriver();
			drivernew3.navigate().to("https://test-satellite.urbanpiper.com/login");
			drivernew3.manage().window().maximize();
			drivernew3.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			JavascriptExecutor jsnew = (JavascriptExecutor) drivernew3;
	        WebElement testusername = drivernew3.findElement(By.xpath("//input[@id='username']"));
	        testusername.sendKeys("pos+posbytz");   
	        WebElement testuserpassword = drivernew3.findElement(By.xpath("//input[@id='password']"));
	        testuserpassword.sendKeys("asvqmznkwk");
	        WebElement testlogin = drivernew3.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/form[1]/div[3]/input[1]"));
	        testlogin.click();
	        Thread.sleep(5000);
	        WebElement teststartorder = drivernew3.findElement(By.xpath("//span[contains(text(),'Start Order')]"));
	        teststartorder.click();
	        WebElement testphoneno = drivernew3.findElement(By.xpath("//body/div[@id='root']/div[@id='content']/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/input[1]"));
	        testphoneno.sendKeys("9841205708");
	        WebElement testlocationswitch = drivernew3.findElement(By.xpath("//body/div[@id='root']/div[@id='content']/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/img[1]"));
	        testlocationswitch.click();
	        WebElement testsearchstore = drivernew3.findElement(By.xpath("//body/div[@id='root']/div[@id='content']/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]"));
	        testsearchstore.click();
	        WebElement selectstore = drivernew3.findElement(By.xpath("//div[contains(text(),'VADAPALANI')]"));
	        selectstore.click();
	        WebElement startorder = drivernew3.findElement(By.xpath("//body/div[@id='root']/div[@id='content']/div[3]/div[1]/div[1]/div[3]/input[1]"));
	        startorder.click();
	        Thread.sleep(8000);
	        WebElement selectitem = drivernew3.findElement(By.xpath("//a[contains(text(),'Add')]"));
	        selectitem.click();
		
			WebElement itemcart = drivernew3.findElement(By.xpath("//body/div[@id='root']/div[@id='content']/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]"));
			itemcart.click();
			WebElement cartcheckout = drivernew3.findElement(By.xpath("//a[contains(text(),'checkout')]"));
			cartcheckout.click();
			Thread.sleep(2000);
			WebElement newaddresson = drivernew3.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/div[1]/div[3]/div[2]/div/div[1]/div[3]"));
			newaddresson.click();
			Thread.sleep(2000);
			WebElement enterlocatity = drivernew3.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/div[1]/div[3]/div[2]/div/div[2]/div/div/div/div[1]/input"));
			enterlocatity.sendKeys("Chennai, Tamil Nadu, India");
			WebElement selectaddress = drivernew3.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/div[1]/div[3]/div[2]/div/div[2]/div/div/div/div[2]/ul/li[1]/span"));
			selectaddress.click();
			Thread.sleep(2000);
			jsnew.executeScript("window.scrollBy(0,200)");
			WebElement enterpincode = drivernew3.findElement(By.xpath("//body/div[@id='root']/div[@id='content']/div[3]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/input[4]"));
			enterpincode.sendKeys("600028");
			WebElement entercity = drivernew3.findElement(By.xpath("//body/div[@id='root']/div[@id='content']/div[3]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/input[3]"));
			entercity.sendKeys("chennai");
			WebElement enteraddress = drivernew3.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/div[1]/div[3]/div[2]/div/div[2]/div/div/input[1]"));
			enteraddress.sendKeys("chennai");
			jsnew.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
			WebElement orderingchannel = drivernew3
					.findElement(By.xpath("//div[contains(text(),'Satellite')]"));
			orderingchannel.click();
			Thread.sleep(2000);
			WebElement zomato = drivernew3.findElement(By.xpath("//div[contains(text(),'Zomato')]"));
			zomato.click();
			WebElement orderid = drivernew3.findElement(By.xpath("//body/div[@id='root']/div[@id='content']/div[3]/div[1]/div[1]/div[1]/div[7]/div[2]/div[2]/input[1]"));
			orderid.sendKeys("111");
			WebElement placeorder = drivernew3.findElement(By.xpath("//a[contains(text(),'Place Order')]"));
			placeorder.click();
			Thread.sleep(3000);
			drivernew3.quit();
			
	  } 
	 
	  @Then("^Compelete zomato order$")
	    public void compelete_zomato_order() throws Throwable {
         
		  pg = new page(driver);
		  pg.zomato_online_order_complete();
		  driver.close();
	  
	  
	  }
	  
	  

}
