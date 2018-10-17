package assignSelen;

import java.util.LinkedHashMap;

public class OptionsListBoxOccurence {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String,String>();
		map.put("city", "Bangalore");
		map.put("name", "vishal");
		map.put("Eid", "A1");
		map.put("Name", "Prakash");
		System.out.println(map.get("Name"));
		System.out.println(map.get("name"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.containsKey("Name"));
		System.out.println(map.containsKey("Area"));
}
}