package qSP;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintScreen {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.co.in/");

		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);

		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ESCAPE);

//		WebDriver driver1= new ChromeDriver();
//		driver1.get("https://www.google.co.in/");
//
//		Robot r1=new Robot();
//		r1.keyPress(KeyEvent.VK_CONTROL);
//		r1.keyPress(KeyEvent.VK_P);
//
//		r1.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(1000);
//		r1.keyPress(KeyEvent.VK_ESCAPE);
	}
}
