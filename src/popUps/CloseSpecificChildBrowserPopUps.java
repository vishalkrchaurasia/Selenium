package popUps;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificChildBrowserPopUps {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.naukri.com");
	
	Set<String> allWHS = driver.getWindowHandles();
	for(String wh:allWHS)
	{
		driver.switchTo().window(wh);
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Amazon")){
			driver.close();
		}
	}
	}

}
