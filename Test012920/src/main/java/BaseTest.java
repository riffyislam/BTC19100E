import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	static WebDriver driver;
	
	
	public void OpenBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Riffy/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("kids");
		driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
		
		int s = driver.findElements(By.cssSelector("#search")).size();
		
	}

}
