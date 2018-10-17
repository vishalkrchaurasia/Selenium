package popUps;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPopUpsCvNaukri {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");
		
		driver.findElement(By.xpath("//span[text()='Later']")).click();
		//driver.findElement(By.id("input_resumeParser")).sendKeys("E:/CV_VISHAL.docx");
		File f=new File("./cv/CV_VISHAL.docx");
		
		String path=f.getAbsolutePath();
		System.out.println(path);
		driver.findElement(By.id("input_resumeParser")).sendKeys(path);
		
		//hidden division popup
		String msg=driver.findElement(By.className("success")).getText();
		System.out.println(msg);
		
	}

}
