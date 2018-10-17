package jsp;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		String parent=driver.getWindowHandle();
		Set<String> v = driver.getWindowHandles();
		v.remove(parent);
		for(String allwhs:v)
		/*{
			driver.switchTo().window(allwhs );
			System.out.println(driver.getTitle());
			driver.close();
			//System.out.println(allwhs);
		}
		System.out.println(v.size());*/
		{
			driver.switchTo().window(allwhs).close();
		}
	}
}