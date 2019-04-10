package com.sopho.pruebasseleniumgeelbe.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CapturaDeEvindecia {
	private static int pant = 1;

	public static void capturaPatallaso(WebDriver driver) {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {

			FileUtils.copyFile(src, new File("C:\\Selenium\\Captura\\" + pant + ".png"));
			pant++;
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
