package qSP;

import org.openqa.selenium.chrome.ChromeDriver;
//import jsp.C;

public class A {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		//int i=10;
		//System.out.println("Test Java "+i);	
		//B b1= new B();
		//C c1 =new C();
		//String key="webdriver.chrome.driver";
		//String value="./driver/chromedriver.exe";
		//System.setProperty(key, value);
		ChromeDriver driver= new ChromeDriver();
	
		driver.close();
	}

}
