package br.ce.ip.pages;


import org.openqa.selenium.By;

import br.ce.ip.core.BasePage;
import br.ce.ip.core.DriverFactory;

public class SignIn extends BasePage{
	
	
	public void accessHomeScreen() {
		System.setProperty("webdriver.chrome.driver", "/home/ivanilde/Desktop/Automation/chromedriver/chromedriver");
		DriverFactory.getDriver().get("http://138.197.154.122/");
	}
		
	public void setSignin(String signin) {
		clickButton(By.xpath("//a[contains(text(),'Sign In')]"));
	}
	
	public void setEmail(String email) {
		write("username", email);
	}
	
	public void setPassword(String password) {
		write("password", password);
	}
	
	public void Login(){
		clickButton(By.xpath("//button[@type='submit']"));
	}
	
	public void login (String email, String password) {
		setEmail(email);
		setPassword(password);
		Login();
	}

}
