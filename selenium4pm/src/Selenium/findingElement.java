package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		String e=driver.getTitle();
		System.out.println(e);
		
		WebElement th = driver.findElement(By.id("email"));
		th.sendKeys("8220687776");
		
		WebElement sh = driver.findElement(By.name("pass"));
		sh.sendKeys("1234");
		
		WebElement ed = driver.findElement(By.name("login"));
		ed.click();
		
		String d = driver.getCurrentUrl();
		System.out.println(d);
		
		driver.navigate().back();
		
		WebElement de= driver.findElement(By.partialLinkText("Sign up"));
		System.out.println(de);
		
		String se = driver.getTitle();
		System.out.println(se);
		
		
		driver.quit();
		
	}

}
