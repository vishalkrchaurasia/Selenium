package simple;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPagesource {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {

		//print html code(source code) of a web page
				WebDriver driver=new ChromeDriver();
				driver.get("http://www.google.com");
				String src=driver.getPageSource();
				System.out.println(src);
				//get the url present in the address bar
				String url=driver.getCurrentUrl();
				System.out.println(url);
				driver.quit();
	}

}
