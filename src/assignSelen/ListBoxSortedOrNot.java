package assignSelen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListBoxSortedOrNot {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("E");
		a.add("D");
		System.out.println(a);
		
		List<String> b = new ArrayList<String>();
		b.addAll(a);
		Collections.sort(b);
		System.out.println(b);
		System.out.println(a.equals(b));
		if(a.equals(b))
		{
			System.out.println("a list is sorted");
		}
		else
		{
			System.out.println("a list is not sorted");
		}
}
}