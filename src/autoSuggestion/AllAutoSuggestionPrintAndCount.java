package autoSuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAutoSuggestionPrintAndCount {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		String xp="//div[contains(text(),'java')]";
		//String xp1="//div[@class='sbqs_c']";
		List<WebElement> allAs = driver.findElements(By.xpath(xp));
		System.out.println(allAs.size());
		for(WebElement e:allAs)
		{
			System.out.println(e.getText());
		}
		allAs.get(1).click();
}
}