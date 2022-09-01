package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.browser.Browser.GetWindowForTargetResponse;

public class MobileSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone 12");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("(//div[@class='_2kHMtA'])[1]")).click();
		
		String Parenthandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		for (String tab:allHandles)
			
		if (!Parenthandle.equals(tab))
		{
			driver.switchTo().window(tab);
		}
		
		driver.findElement(By.xpath("//li[@id='swatch-2-color']")).click();
		driver.findElement(By.xpath("//a[.='256 GB']")).click();
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("411019");
		driver.findElement(By.xpath("//span[.='Check']")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='_3dsJAO' and text()='Remove']")).click();
		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ' and text()='Remove']")).click();
		

	}

}
