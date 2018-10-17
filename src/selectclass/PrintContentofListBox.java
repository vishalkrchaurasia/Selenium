package selectclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintContentofListBox {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement listbox = driver.findElement(By.id("month"));
		Select select=new Select(listbox);
		//List<WebElement> allOptions = select.getOptions();
		System.out.println(select.getOptions().isEmpty());
		List<WebElement> allOptions = select.getOptions();
		for(int i=0;i<allOptions.size();i++)
		{
			WebElement option = allOptions.get(i);
			String text = option.getText();
			System.out.println(text);
		}
		
		/*for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
		}*/
		
//		ArrayList<String> allText = new ArrayList<String>();
//		for(WebElement option:allOptions)
//		{
//			allText.add(option.getText());
//		}
//		Collections.sort(allText);
//		for(String text:allText)
//		{
//			System.out.println(text);
//		}
}
}