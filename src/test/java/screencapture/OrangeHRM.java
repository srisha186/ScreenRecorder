package screencapture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import util.MyScreenRecorder;

public class OrangeHRM {
WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C://Driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void doLogin() throws Exception {
		MyScreenRecorder.startRecording("doLogin");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		WebElement button = driver.findElement(By.name("Submit"));
		button.click();
		MyScreenRecorder.stopRecording();
	}
	
	@AfterTest()
		public void tearDown() {
			driver.close();
		}
	}

