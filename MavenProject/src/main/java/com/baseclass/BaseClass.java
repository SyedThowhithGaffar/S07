package com.baseclass;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public abstract class BaseClass {

	public static WebDriver driver;

	public static ExtentReports extentReports;

	public static File file;

	protected static WebDriver launchBrowser(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("Chrome")) {

				driver = new ChromeDriver();

			} else if (browserName.equalsIgnoreCase("Edge")) {

				driver = new EdgeDriver();

			} else if (browserName.equalsIgnoreCase("firefox")) {

				driver = new FirefoxDriver();
			}
		} catch (Exception e) {

			Assert.fail(" ERROR : OCCURRED DURING BROWSER LAUNCH");

		}

		driver.manage().window().maximize();

		return driver;

	}

	protected static void clickElement(WebElement element) {
		try {
			element.click();

		} catch (Exception e) {

			Assert.fail(" ERROR : OCCURRED DURING CLICKING ELEMENT");
		}

	}

	protected static void navigateTo(String navigateUrl) {
		try {

			driver.navigate().to(navigateUrl);

		} catch (Exception e) {

			Assert.fail("ERROR : OCCURRED DURING NAVIGATION TO NEXT PAGE");
		}

	}

	protected static void navigateForward(String navihgateUrl) {
		try {

			driver.navigate().forward();

		} catch (Exception e) {

			Assert.fail(" ERROR : OCCURRED DURING NAVIGATION TO THE NEXT PAGE");
		}
	}

	protected static void navigateBack() {

		try {

			driver.navigate().back();

		} catch (Exception e) {

			Assert.fail("ERROR : OCCURRED DURING NAVIGATING TO PRVIOUS PAGE");
		}
	}

	protected static void closeTab() {

		try {

			driver.close();

		} catch (Exception e) {

			Assert.fail("ERROR : OCCURRED DURING CLOSING THE TAB ");
		}
	}

	protected static void terminateBrowser() {

		try {

			driver.quit();

		} catch (Exception e) {
		}
	}

	protected static WebDriver launchUrl(String url) {

		try {
			driver.get(url);

		} catch (Exception e) {

			Assert.fail("ERROR : OCCURRED DURING LAUNCHING URL");
		}
		return driver;
	}

	protected static void passInput(WebElement element, String value) {
		try {
			element.sendKeys(value);

		} catch (Exception e) {

			Assert.fail("ERROR : OCCURRED DURING PASSING INPUT");

		}
	}

	protected static void passDate(WebElement element, String value) {
		try {
			element.clear();
			element.sendKeys(value);

		} catch (Exception e) {

			Assert.fail("ERROR : OCCURRED DURING PASSING INPUT");

		}
	}

	protected static void navigateRefresh() {

		try {

			driver.navigate().refresh();

		} catch (Exception e) {

			Assert.fail("ERROR : OCCURRED DURING REFRESHING TAB");

		}
	}

	protected static Select dropDownObject(WebElement element) {

		Select select = new Select(element);

		return select;
	}

	protected static void selectByVisibleText(WebElement element, String visibleText) {
		try {

			dropDownObject(element).selectByVisibleText(visibleText);

		} catch (Exception e) {

			Assert.fail("ERROR : OCCURRED DURING SELECTING USING VALUE VISIBLE TEXT IN DROPDOWN");
		}
	}

	protected static void selectByValue(WebElement element, String value) {
		try {

			dropDownObject(element).selectByValue(value);

		} catch (Exception e) {

			Assert.fail("ERROR : OCCURRED DURING SELECTING USING VALUE IN DROPDOWN");
		}
	}

	protected static void selectByIndex(WebElement element, int index) {
		try {

			dropDownObject(element).selectByIndex(index);

		} catch (Exception e) {

			Assert.fail("ERROR : OCCURRED DURING SELECTING USING INDEX IN DROPDOWN");
		}
	}

	protected static Actions actionsObject() {

		Actions actions = new Actions(driver);

		return actions;

	}

	protected static void leftclick(WebElement element) {

		try {
			actionsObject().click(element);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURRED DURING LEFT CLICK");

		}
	}

	protected static void doubleClick(WebElement element) {

		try {

			actionsObject().doubleClick().perform();
		} catch (Exception e) {

			Assert.fail("ERROR : OCCURRED DURING DOUBLE CLICK");

		}
	}

	protected static void rightClick(WebElement element) {

		try {
			actionsObject().contextClick().perform();
		} catch (Exception e) {

			Assert.fail("ERROR : OCCURRED DURING RIGHT CLICK");

		}
	}

	protected static void hoverTheElement(WebElement element) {

		try {
			actionsObject().moveToElement(element).perform();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURRED DURING MOVING TO ELEMENT");
		}
	}

	protected static void dragAndDrop(WebElement a, WebElement b) {
		try {
			actionsObject().dragAndDrop(a, b);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURRED DURING DRAG AND DROP");

		}
	}

	protected static boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}

	protected static boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	protected static boolean isSelected(WebElement element) {
		return element.isSelected();
	}

	protected static void elementClear(WebElement element) {
		element.clear();
	}

	protected static void moveToTheElementAndClick(WebElement element) {
		try {
			actionsObject().moveToElement(element).click().build().perform();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURRED DURING MOVING TO THE ELEMENT AND CLICKING IT");

		}
	}

	protected static void takesScreenshot(String filePath) throws IOException {
		try {
			TakesScreenshot screenShot = (TakesScreenshot) driver;
			File source = screenShot.getScreenshotAs(OutputType.FILE);
			File destination = new File(filePath);
			FileHandler.copy(source, destination);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURRED DURING taking screenshot");
		}
	}

	protected static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");

	}

	protected static void explicitWait(WebElement element, int seconds) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.invisibilityOf(element));
		} catch (Exception e) {
			Assert.fail("ERROR : PAGE IS NOT LOADING IN A GIVEN SECONDS");
		}
	}

	protected static void explicitWaitCLicable(WebElement element, int seconds) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			Assert.fail("ERROR : PAGE IS NOT LOADING IN A GIVEN SECONDS");
		}

	}

	protected static void implicitWait(int seconds) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		} catch (Exception e) {
			Assert.fail("ERROR : PAGE IS NOT LOADING IN A GIVEN SECONDS");
		}

	}

	protected static void validation(String actual, String expected) {
		try {
			Assert.assertEquals(actual, expected);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("ERROR : OCCURRED DURING VALIDATION");
		}
	}

	public static void extentReportStart(String location) {
		try {
			extentReports = new ExtentReports();
			file = new File(location);
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
			extentReports.attachReporter(sparkReporter);
			extentReports.setSystemInfo("OS", System.getProperty("os.name"));
			extentReports.setSystemInfo("Java version", System.getProperty("java.version"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void extentReportTearDown(String location) throws IOException {
		try {
			extentReports.flush();
			file = new File(location);
			Desktop.getDesktop().browse((file).toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String takesScreenshot() throws IOException {
		try {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
			File destfile = new File("Screenshot\\.png" + "_" + timeStamp + ".png");
			FileUtils.copyFile(scrfile, destfile);
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}


