package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//		driver.get("file:///C:/Users/VISHAL/Desktop/page1.html");
//		
//		//using index
//		driver.switchTo().frame(0);
//		driver.findElement(By.id("t2")).sendKeys("A");
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("t1")).sendKeys("A");
//		
//		//using id
//		driver.switchTo().frame("f1");
//		driver.findElement(By.id("t2")).sendKeys("B");
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("t1")).sendKeys("B");
//		
//		//using address
//		WebElement e = driver.findElement(By.tagName("iframe"));
//		driver.switchTo().frame(e);
//		driver.findElement(By.id("t2")).sendKeys("C");
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("t1")).sendKeys("C");
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement to = driver.findElement(By.id("draggable"));
		WebElement from = driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(to,from).build().perform();
}
}