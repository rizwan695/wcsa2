package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchinstagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();//open firefox browser
		driver.manage().window().maximize();//to maximize the browser page
		driver.get("https://www.instagram.com");//for open the web page
	Thread.sleep(5000);//delay of 5 seconds
	driver.close();//close the browser

	}

}
