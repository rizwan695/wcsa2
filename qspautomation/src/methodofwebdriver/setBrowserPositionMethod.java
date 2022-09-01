package methodofwebdriver;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setBrowserPositionMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//open the chrome browser
		Point targetPosition = new Point(100,600);//dimensions are in pixels (x axis, y axis)
		driver.manage().window().setPosition(targetPosition);//this method is used to set the size of the browser
		driver.get("https://www.google.com");

	}

}
