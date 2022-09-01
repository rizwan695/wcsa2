package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramLogin {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	
	//to login instagram
	driver.findElement(By.name("username")).sendKeys("rizwan");
	driver.findElement(By.name("password")).sendKeys("WrongPassword");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("button[class*='L3NKy']")).click();
	}
}