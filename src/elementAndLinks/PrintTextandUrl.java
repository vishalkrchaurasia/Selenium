package elementAndLinks;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTextandUrl {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/VISHAL/Desktop/demo.html");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count = allLinks.size();
		for(int i=0;i<count;i++)
		{
			WebElement link = allLinks.get(i);
			String text=link.getText();
			String url = link.getAttribute("href");
			System.out.println(text+"-->"+url); 
		}
		//using foreach loop
		for(WebElement link:allLinks)
		{
			String text=link.getText();
			String url = link.getAttribute("href");
			System.out.println(text+"-->"+url); 
		}
	}
}