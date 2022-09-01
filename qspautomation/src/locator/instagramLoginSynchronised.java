package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramLoginSynchronised {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		
		//to login instagram
		driver.findElement(By.name("username")).sendKeys("rizwan");
		driver.findElement(By.name("password")).sendKeys("WrongPassword");
		driver.findElement(By.cssSelector("button[class*='L3NKy']")).click();
	}

}
