package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive","./drivrs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 
	}

}
