package desktop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disable {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/VISHAL/Desktop/disable.html");
		//driver.findElement(By.id("t1")).sendKeys("abc");
		String code="document.getElementById('t1').value='abc'";
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript(code);
}
}