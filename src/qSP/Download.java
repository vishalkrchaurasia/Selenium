package qSP;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Download {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a")).click();

		//		WebDriver driver1= new FirefoxDriver();
		//		driver1.get("https://www.seleniumhq.org/download/");
		//		driver1.findElement(By.xpath("//td[text()='Java']/../td[4]/a")).click();
		//		
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);

		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
	}
}