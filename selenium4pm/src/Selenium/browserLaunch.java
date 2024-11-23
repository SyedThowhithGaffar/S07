package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserLaunch {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.primevideo.com/movie");
		
		driver.manage().window().maximize();

		String T = driver.getTitle();
		System.out.println(T);
		
		String h = driver.getCurrentUrl();
		System.out.println(h);

		driver.navigate().to("https://www.netflix.com/browse");
		
		String w = driver.getTitle();
		System.out.println(w);
		
		String s = driver.getCurrentUrl();
		System.out.println(s);
		
		driver.navigate().to("https://www.sonyliv.com/");
		
		String y = driver.getTitle();
		System.out.println(y);
		
		driver.navigate().refresh();
		
		String q = driver.getCurrentUrl();
		System.out.println(q);
		
		driver.navigate().back();
		
		String x = driver.getTitle();
		System.out.println(x);
		
		String a = driver.getCurrentUrl();
		System.out.println(a);
		
		Thread.sleep(5000);
		
//		driver.navigate().back();
//		
//		String p = driver.getTitle();
//		System.out.println(p);
//		
//		String b = driver.getCurrentUrl();
//		System.out.println(b);
//		
//		driver.quit();

	}

}
