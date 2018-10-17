package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerticalAndHorizontalScroll {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/license-agreement");
		String xp="//h2[text()='15. Miscellaneous']";
		WebElement e = driver.findElement(By.xpath(xp));
		int y = e.getLocation().getY();
		System.out.println(y);
		int x = e.getLocation().getX();
		System.out.println(x);
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
//		j.executeScript("window.scrollBy(350,5955)");
		j.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(500);;
}
}