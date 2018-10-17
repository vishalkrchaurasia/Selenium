package jsp;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YatraDisableNotification {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(options);
		//driver.manage().deleteAllCookies();
		driver.get("https://www.yatra.com/");
		
//		WebDriver driver1= new FirefoxDriver();
//		driver1.get("https://www.yatra.com/");
//		
//		Robot r=new Robot();
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_ESCAPE);
	}
}