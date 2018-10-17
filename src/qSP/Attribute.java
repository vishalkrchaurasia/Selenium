package qSP;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		//driver.manage().deleteAllCookies();
		
		//driver.manage().window().maximize();
		//driver.get("http://www.naukri.com");
		//driver.get("http://www.google.com");
		//driver.navigate().to("http://www.gmail.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		//driver.get("http://demo.actitime.com");
		
		//WebElement e = driver.switchTo().activeElement();
		//e.sendKeys("vishal");
		//System.out.println(driver);
		driver.get("http://www.naukri.com");
		
		//String wh = driver.getWindowHandle();
		//String wh = driver.getWindowHandle();System.out.println(wh);
		//Set<String> v=driver.getWindowHandles();
		//System.out.println(v.size());
		//System.out.println(v);
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile=t.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./photo/a.png");
		FileUtils.copyFile(srcFile, destFile);
		driver.close();
		//png->Portable Network Graphics
	}
}