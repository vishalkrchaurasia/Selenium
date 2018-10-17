package fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FbLoginTest {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		FbLogin login=new FbLogin(driver);
		login.setUsername("pankajkrchsia@gmail.com");
		login.setPassword("Rajat@0758");
		login.clickLogin();
		
		FbHome home=new FbHome(driver);
		home.clickBtn();
		
		FbLogout logout=new FbLogout(driver);
		logout.clickLogout();
	}
}
