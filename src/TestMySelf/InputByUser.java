package TestMySelf;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputByUser {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter");
		String text=sc.next();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys(text);
		String xp="//div[contains(text(),'+text+')]";
		
		List<WebElement> allAs = driver.findElements(By.xpath(xp));
		System.out.println(allAs.size());
		for(WebElement e:allAs)
		{
			System.out.println(e.getText());
		}
		allAs.get(0).click();
		
//		List<WebElement> size = driver.findElements(By.xpath(xp));
//		int count=size.size();
//		System.out.println(count);
//		for(WebElement p:size)
//		{
//			String texts=p.getText();
//			System.out.println(texts);
//		}
//		opt.get(3).click();
	}
}
