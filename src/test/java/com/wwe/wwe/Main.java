package com.wwe.wwe;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main {
	
	
	@Test
	public void getURL() {
		
		System.setProperty("webdriver.driver.chrome", "'/Users/admin/Desktop/My Learning/Selenium/chromedriver'");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://wwe.com");
		
	}

}
