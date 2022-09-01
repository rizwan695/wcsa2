package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestValidActitime extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		
		//read the data from property file
		String username = flib.ReadPropertyFile("./data/config.properties", "username");
		String password = flib.ReadPropertyFile("./data/config.properties", "password");

		
		//valid login
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(4000);
		
		bt.closeBrowser();
		
		
		

	}

}
