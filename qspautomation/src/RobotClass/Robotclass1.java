package RobotClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclass1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[.='✕']")).click();
Thread.sleep(4000);
WebElement target = driver.findElement(By.xpath("//div[.='Electronics' and @class='xtXmba']]"));
Actions act = new Actions(driver);
act.contextClick(target).perform();

	}

}
