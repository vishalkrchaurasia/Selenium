package jsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Starhealth {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.starhealth.in/renewal");
		driver.findElement(By.id("nqame2")).sendKeys("p123");
		driver.findElement(By.id("dtDOB")).click();
		driver.findElement(By.cssSelector("li.currentdate>a")).click();
		//driver.findElement(By.linkText("15")).click();
		driver.findElement(By.id("proceed")).click();	
	}
}