package TestMySelf;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLoginPort {

//	@Test
//	public static void testGrid() throws Exception {
//	URL remoteAddress = new URL("http://localhost:4444/wd/hub");
//	DesiredCapabilities capabilities=new DesiredCapabilities();
//	capabilities.setBrowserName("chrome");
//	WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);
//	driver.close();
	
	@Parameters({"ip","browser"})
	@Test
	public static void testGrid(String ip,String browser) throws Exception {
//		String ip="192.168.43.136";
//		String ip="192.168.1.111";
//		String browser="chrome";
		URL remoteAddress = new URL("http://"+ip+":4444/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName(browser);
		WebDriver driver=new RemoteWebDriver(remoteAddress,capabilities);
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		for(int i=1;i<=50;i++)
		{
			WebElement un = driver.findElement(By.id("username"));
			un.sendKeys("admin");
			un.clear();
		}
		driver.close();
	}
}