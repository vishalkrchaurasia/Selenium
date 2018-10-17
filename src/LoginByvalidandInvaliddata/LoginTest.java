package LoginByvalidandInvaliddata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginDemoPage login=new LoginDemoPage(driver);
		login.setUsername("abc");
		login.setPassword("xyz");
		login.clickLogin();
		
		Thread.sleep(2000);
		
		login.setUsername("admin");
		login.setPassword("manager");
		login.clickLogin();
	}
}
