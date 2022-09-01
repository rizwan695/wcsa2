package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//to login instagram
		driver.findElement(By.name("email")).sendKeys("rizwan");
		driver.findElement(By.name("pass")).sendKeys("WrongPassword");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
	}

}
