package autoSuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SearchFlightPrintprice {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//enter url
		driver.get("https://www.cleartrip.com/");
		//enter bang in from field
		driver.findElement(By.id("FromTag")).sendKeys("Bang");
		//select bangalore from autosuggestion
		driver.findElement(By.xpath("//a[contains(text(),'Kempegowda')]")).click();
		//enter goa into field
		driver.findElement(By.id("ToTag")).sendKeys("Goa");
		//select goa from autosuggestion
		driver.findElement(By.xpath("//a[contains(text(),'Dabolim')]")).click();
		//select today's date in calander
		driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();
		//click search button
		driver.findElement(By.id("SearchBtn")).click();
		//Get all prices
		List<WebElement> allPrices = driver.findElements(By.xpath("//th[@class='price']"));

		//		for(WebElement prices:allPrices)
		//		{
		//			String text = prices.getText();
		//			System.out.println("original: "+text);
		//			String formatedText = text.substring(1).replaceAll(",", "");
		//			System.out.println("formated : "+formatedText);
		//			int v=Integer.parseInt(formatedText);
		//			System.out.println("Int : "+v);
		//		}

		//sort all price
		for(int i=1;i<allPrices.size();i++)
		{
			String p1=allPrices.get(i-1).getText().substring(1).replaceAll(",", "");
			String p2=allPrices.get(i).getText().substring(1).replaceAll(",", "");
			int v1=Integer.parseInt(p1);
			int v2=Integer.parseInt(p2);
			System.out.println("Comparing"+v1+" with "+v2);
			if(v1<=v2){
				System.out.println("pass..");
			}
			else
			{
				System.out.println("fail...");
			}
		}
		driver.close();
	}
}