package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class javaScriptExecut {

	public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			Object title = js.executeScript("return document.title;").toString();
			System.out.println(title);
			
			js.executeScript("window.scrollBy(0,9000);");
			
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(0,-5000);");
			
			Thread.sleep(3000);
			
			WebElement payments = driver.findElement(By.xpath("//a [contains(@aria-label,'Pay')]"));
			
			js.executeScript("arguments[0].scrollIntoView();" ,payments);
			
			//WebElement search = driver.findElement(By.xpath("//button [contains(@aria-label,'Search')]"));			
			
			//js.executeScript("arguments[0].click();", search);

	//		js.executeScript("window.location = 'https://yahoo.com'");  ---- Navigator
			js.executeScript("window.location = 'https://www.facebook.com/'"); 
			
//			string sText =  js.executeScript("return document.title;").toString(); 
			String title1 = js.executeScript("return document.title;").toString();
			
			String fulltext = js.executeScript("return document.documentElement.innerText;").toString();
			System.out.println(fulltext);
			
			System.out.println(title1);
			
			js.executeScript("history.go(0)");
			
			Object url = js.executeScript("return document.URL;");
			
			WebElement username = driver.findElement(By.xpath("//input[contains(@id,'ema')]"));
			
			String elementText = js.executeScript("return arguments[0].innerHTML", username).toString();
			System.out.println(elementText);
			
			Thread.sleep(2000);
			
		//	js.executeScript("document.getElementById('some id').value='someValue';"); Value pass
			js.executeScript("document.getElementById('email').value='8220687776';");
			
			WebElement pass = driver.findElement(By.xpath("//input[contains(@id,'pas')]"));
			js.executeScript("document.getElementById('pass').value='sye711';");
			
			Thread.sleep(4000);
			
			WebElement login = driver.findElement(By.xpath("//button[contains(@type,'sub')]"));
						
			//js.executeScript("arguments[0].click();", webelementname );
			js.executeScript("arguments[0].click();", login);
			
			Thread.sleep(10000);
		
			driver.quit();
	}

}
