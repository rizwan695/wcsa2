package methodofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setBrowserSizemethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//to browse the chrome
		 Dimension targetSize = new Dimension(200,100);//dimensions are in pixels (width,height)
		driver.manage().window().setSize(targetSize);//to set size of browser we use this method
		driver.get("https://www.google.com");

	}

}
