package elementAndLinks;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IphoneXLowestHighestPriceTreeset {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//enter the url
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone x");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='iphone x']/..")).click();
		String xp="//div[starts-with(text(),'Apple iPhone')]/../../div[2]/div[1]/div[1]/div[1]";
		List<WebElement> allP = driver.findElements(By.xpath(xp));
//		for(WebElement p:allP)
//		{
//			System.out.println(p.getText());
//		}
		
//		TreeSet<Integer> t=new TreeSet<Integer>();
//		for(WebElement p:allP)
//		{
//			int v=Integer.parseInt(p.getText().substring(1).replaceAll(",", ""));
//			t.add(v);
//		}
//		System.out.println(t.first());
//		System.out.println(t.last());
		
		TreeSet<Integer> t=new TreeSet<Integer>();
		System.out.println("---All Prices---");
		for(WebElement p:allP)
		{
			String strprice=p.getText().substring(1).replaceAll(",", "");
			System.out.println(strprice);
			int v=Integer.parseInt(strprice);
			t.add(v);
		}
		System.out.println("---low and high prices---");
		System.out.println(t.first());
		System.out.println(t.last());
		
		driver.close();
}
}