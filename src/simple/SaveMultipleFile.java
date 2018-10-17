package simple;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaveMultipleFile {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		Date d=new Date();
		String v=d.toString();

		System.out.println(v);
		String v2=v.replaceAll(":", "-");//replace all : by -
		System.out.println(v2);
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.actitime.com");
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile=t.getScreenshotAs(OutputType.FILE);
		String path="./photo/"+v2+".png";
		System.out.println(path);
		File destFile=new File(path);
		FileUtils.copyFile(srcFile, destFile);
		driver.close();
		//png->Portable Network Graphics
	}
}