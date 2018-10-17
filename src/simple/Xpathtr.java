package simple;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtr {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		//driver.get("file:///C:/Users/Pankaj/Desktop/Demotr.html");
		driver.get("https://drive.google.com");
		//driver.findElement(By.xpath("//td[2]/.."));
		driver.findElement(By.xpath("(//a[text()='Go to Google Drive'])[2]"));
		String r=driver.getCurrentUrl();
		System.out.println(r);
		driver.close();
	}

}
