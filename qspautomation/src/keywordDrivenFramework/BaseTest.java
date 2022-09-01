package keywordDrivenFramework;



import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
		static WebDriver driver;
		public void openBrowser() throws IOException//to open the browser
, InterruptedException
		{
			Flib flib = new Flib();

			//read the browser value
			String browservalue = flib.ReadPropertyFile("./data/config.properties","browser");
			//read the url 
			String url = flib.ReadPropertyFile("./data/config.properties","url");
		
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//avoid IllegalStateException
			driver=new ChromeDriver();//open chrome browser
			driver.manage().window().maximize();//maximize the browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);
		}
		
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//avoid IllegalStateException
			driver=new FirefoxDriver();//open firefox browser
			driver.manage().window().maximize();//maximize the browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);
		}

	}

		//close all the browsers
		public void closeBrowser()
		{
			driver.quit();
		}
		
}