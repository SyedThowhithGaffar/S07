package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();

		// tagName[contains(@attributeName,'Partial attributeValue')]
		//xpath with contains
		WebElement Searchbar = driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));

		Searchbar.sendKeys("Dining table");
		
		//XPath with text 
		WebElement but = driver.findElement(By.xpath("//span [text()='Search']"));
		but.click();

		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
		
		Thread.sleep(3000);

		driver.navigate().to("https://www.facebook.com/");

		String title1 = driver.getTitle();
		System.out.println(title1);
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		
		Thread.sleep(3000);
		
		//XPath with text 
		WebElement un = driver.findElement(By.xpath("//input[@type='text']"));
		un.sendKeys("8220687776");
		
		//xpath with contains
		WebElement ps = driver.findElement(By.xpath("//input[contains(@aria-label,'word')]"));
		ps.sendKeys("syedthowhith");
		
		WebElement lb = driver.findElement(By.xpath("//button[contains(@data-testid,'royal')]"));
		lb.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}
}
