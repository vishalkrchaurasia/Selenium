package qSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pankaj/Desktop/demo.html");
		//WebElement e = driver.findElement(By.tagName("a"));
		//e.click();
		//WebElement e = 
		/*	driver.findElement(By.tagName("a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.id("a1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.name("n1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.className("c1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		*/
//		driver.findElement(By.linkText("Google"));
//		//Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Goo")).click();
		//Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		//driver.findElement(By.cssSelector("a[id='a1']"));
	}

}