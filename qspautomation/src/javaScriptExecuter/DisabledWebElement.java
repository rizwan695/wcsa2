package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledWebElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.drive","./drivrs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/wcsa2htmldoc/disabledTextBox.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("document.getElementById('i1').value='admin'");

	}

}
