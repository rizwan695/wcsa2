
		package WebBasedPopup;

		import java.time.Duration;

		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class confirmationAlertPopupAccept {

			public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/wcsa2htmldoc/confirmation.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Thread.sleep(5000);
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		 String r1 = al.getText();
		 System.out.println(r1);
		Thread.sleep(3000);
		al.accept();
			}

		

	}


