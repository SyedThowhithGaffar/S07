package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class takesScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		WebDriver driver =new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement pro = driver.findElement(By.xpath("//img[contains(@alt,'Flight')]"));
		
		TakesScreenshot sy = (TakesScreenshot) driver;
		
		File source = sy.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\syedt\\eclipse-workspace\\selenium4pm\\screenshots\\flipkart .png");

		FileHandler.copy(source, destination);
		
		Thread.sleep(3000);
		
		driver.quit();
		
	
		

	}

}
