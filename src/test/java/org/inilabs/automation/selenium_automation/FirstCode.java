package org.inilabs.automation.selenium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstCode {
	public static void main(String[] args) {

//		// 1. Set path to chromedriver
//		 System.setProperty("webdriver.chrome.driver",
//		 "C:\Users\Tahamidul\Downloads\chromedriver.exe");

		  WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

		driver.quit();
	}
}
