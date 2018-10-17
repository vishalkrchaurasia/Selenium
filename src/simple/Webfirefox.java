package simple;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Webfirefox {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d;
		SearchContext c;
		JavascriptExecutor j;
		RemoteWebDriver r;
		TakesScreenshot t;
		WebElement e;
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.close();
	}
}
