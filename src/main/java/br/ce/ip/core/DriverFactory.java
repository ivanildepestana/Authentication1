package br.ce.ip.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	private static WebDriver driver;
	
	
	public DriverFactory() {}
	
	public static WebDriver getDriver(){
		
		if(driver == null) {
				switch (Properties.browser) {
						
						case CHROME: driver = new ChromeDriver(); break;
						case FIREFOX: driver = new FirefoxDriver(); break;
			}
			
		
		}
		return driver;
	}
	
	
	public static void killDriver(){
			if(driver != null) {
					driver.quit();
					driver = null;
		}
	}
}