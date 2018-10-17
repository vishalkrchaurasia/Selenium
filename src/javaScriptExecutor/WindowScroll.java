package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowScroll {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/license-agreement");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		for(int i=0;i<10;i++)
		{
			j.executeScript("window.scrollBy(0,500)");
			Thread.sleep(500);
		}
		
		for(int i=0;i<10;i++)
		{
			j.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(500);
		}
}
}