package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		String Parenthandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		for (String tab:allHandles)
			
		if (!Parenthandle.equals(tab))
		{
			driver.switchTo().window(tab);
			driver.close();
		}
		
		driver.switchTo().window(Parenthandle);
		driver.close();
	}

}
