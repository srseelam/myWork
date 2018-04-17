package com.qa.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CommonMethods {

	// public void mouseoverTo(WebElement element) {
	// WebDriver driver = new WebDriver();
	// Actions action = new Actions(driver);
	// action.moveToElement(element).build().perform();
	// }

	public String getScreenShot(WebDriver driver, String screenShotName) throws IOException {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhmmss");
		Date currDate = new Date();
		String dateName = format.format(currDate);
		System.out.println("Date Name " + dateName);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/failedScreenShots/" + screenShotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;

	}
}
