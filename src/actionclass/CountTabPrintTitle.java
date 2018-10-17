package actionclass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CountTabPrintTitle {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/");
		//find the menu
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		//ctrl+click (it is an example for composite action) multiple action at a time
		Actions action=new Actions(driver);
		action.sendKeys(Keys.CONTROL).click(link).perform();
		//in this example getwindowhandles return windowhandle of all the tabs
		Set<String> allWhs = driver.getWindowHandles();
		System.out.println(allWhs.size());//to count the tabs
		for(String wh:allWhs)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
		}
		driver.close();
		driver.quit();
	}
}