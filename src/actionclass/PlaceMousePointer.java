package actionclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PlaceMousePointer {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		//open the Browser		
		WebDriver driver=new ChromeDriver();
		//enter the url		
		driver.get("https://www.actitime.com/");
		//find the menu		
		WebElement menu = driver.findElement(By.linkText("Features"));
		//mouse hover on the menu		
		Actions action=new Actions(driver);
		action.moveToElement(menu).perform();
		//select 1st submenu		
		driver.findElement(By.linkText("Simple Time Tracking")).click();
	}
}