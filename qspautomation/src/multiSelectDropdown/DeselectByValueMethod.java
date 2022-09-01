package multiSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValueMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Lenovo\\Desktop\\wcsa2htmldoc\\multiselectdropdown.html");
		WebElement multiselected = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselected);
		
		sel.selectByValue("v3");
		Thread.sleep(2000);
		sel.deselectByValue("v3");
	}

}