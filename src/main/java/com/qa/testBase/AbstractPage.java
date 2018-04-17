package com.qa.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.qa.pages.CartPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductDetailsPage;
import com.qa.pages.ProductListPage;
import com.qa.utility.CommonMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AbstractPage {

	public static WebDriver driver;
	public static Properties prop;
//	public ExtentReports extent;
//	public ExtentTest extentTest;

	public static HomePage homePage;
	public static ProductListPage productListPage;
	public static LoginPage loginPage;
	public static CartPage cartPage;
	public static ProductDetailsPage productDetailsPage;

	CommonMethods utility = new CommonMethods();

	public AbstractPage() {
		try {
			File file = new File(
					System.getProperty("user.dir") + "/src/main/java/com/qa/configuration/Config.properties");
			prop = new Properties();
			FileInputStream ip = new FileInputStream(file);
			prop.load(ip);
		} catch (Exception e) {
			System.out.println("unable to read the property file");
			e.printStackTrace();
		}
	}

	public static void initialize() {
		DriverFactory driverFactory = new DriverFactory();
		driver = driverFactory.openBrowser(driver, prop);
	}
	
	@BeforeSuite
	public void clearData() throws IOException {
		System.out.println("@BeforeSuite");
		File index = new File(System.getProperty("user.dir") + "/failedScreenShots");

		if (index.exists()) {
			FileUtils.deleteDirectory(index);
			System.out.println("folder with screenshots is deleted");
		}
	}
	
	@BeforeTest
	public void startExtendReport() {
		System.out.println("@BeforeTest");
		System.out.println(("user.dir") + "/test-output/AdvanceReport.html");
	//	extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/TestReport.html", true);
	}
	
	@BeforeMethod
	public void setup() {
		System.out.println("@BeforeMethod");
		initialize();
		homePage = new HomePage();
		productListPage = new ProductListPage();
		productListPage = new ProductListPage();
		loginPage = new LoginPage();
		cartPage = new CartPage();
		productDetailsPage = new ProductDetailsPage();
	}

	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
//		if (result.getStatus() == ITestResult.FAILURE) {
//			extentTest.log(LogStatus.FAIL, "Failed Test Case: " + result.getName());
//			extentTest.log(LogStatus.FAIL, "Log info" + result.getThrowable());
//			String imagePath = utility.getScreenShot(driver, result.getName());
//			extentTest.log(LogStatus.FAIL, "Screenshot" + extentTest.addScreenCapture(imagePath));
//		} else if (result.getStatus() == ITestResult.SKIP) {
//			extentTest.log(LogStatus.SKIP, "Skipped Test Case: " + result.getName());
//		} else if (result.getStatus() == ITestResult.SUCCESS) {
//			extentTest.log(LogStatus.PASS, "Success Test Case: " + result.getName());
//		} else {
//			System.out.println("Unknown exception");
//		}
//		extent.endTest(extentTest);

		driver.close();
		driver.quit();
	}

	

	@AfterTest
	public void endExtentReport() {
//		extent.flush();
//		extent.close();
	}



	public void mouseoverTo(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public void switchToNewTab() {
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}
}
