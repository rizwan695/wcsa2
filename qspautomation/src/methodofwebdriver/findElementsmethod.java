package methodofwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("bike");
		Thread.sleep(3000);
		
		  List<WebElement> suggOfWebElements = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		 //* for(int i=1;i<suggOfWebElements.size();i++)
		//  {
		//	  WebElement sugg = suggOfWebElements.get(i);
		  //	  String textOfSugg = sugg.getText();
		  //	  Thread.sleep(2000);
		  //	  System.out.println(textOfSugg);
		  //  }
		  
		  
		  for (WebElement sugg : suggOfWebElements)
		  {
			  String TextOfWebElement = sugg.getText();
			  Thread.sleep(2000);
			  System.out.println(TextOfWebElement);
		  }
	}

}
//