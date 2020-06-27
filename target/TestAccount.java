package br.ce.ip.test;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.ce.imp.core.DSL;
import br.ce.imp.test.SignUpPage;
import br.ce.ip.core.BasePage;
import br.ce.ip.core.BaseTest;
import br.ce.ip.pages.LoginPage;

public class TestAccount extends BaseTest{

			
		
	 @Test
	 public void test() throws IOException {
			Properties envProperties = new Properties();
			InputStream in = this.getClass().getResourceAsStream("env.properties");
			envProperties.load(in);
			in.close();
			
			System.setProperty("webdriver.gecko.driver","/home/ivanilde/Desktop/Automation/geckodriver/geckodriver");
			WebDriver DriverFactory = new FirefoxDriver();
			DriverFactory.get(envProperties.getProperty("host"));
			new BasePage(DriverFactory);
			new LoginPage(DriverFactory);	
		}
	 
}

