package br.ce.ip.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ce.ip.core.BasePage;
import br.ce.ip.core.DriverFactory;

public class MenuUserPage extends BasePage {

	
	public void UserMenuAccess () throws InterruptedException{
		//WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 500);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='__BVID__37__BV_toggle_']\"")));
		//DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait (DriverFactory.getDriver(), 90);
		
		
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='__BVID__23__BV_toggle_']")));
//		click1("//a[@id='__BVID__23__BV_toggle_']");
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//nav[contains(concat(' ', @class, ' '), ' navbar ')]/ul[contains(concat(' ', @class, ' '), ' navbar-nav ')]/li[contains(concat(' ', @class, ' '), ' nav-item ')]/a[contains(concat(' ', @class, ' '), ' dropdown-toggle ')]")));
		clickXpath("//nav[contains(concat(' ', @class, ' '), ' navbar ')]/ul[contains(concat(' ', @class, ' '), ' navbar-nav ')]/li[contains(concat(' ', @class, ' '), ' nav-item ')]/a[contains(concat(' ', @class, ' '), ' dropdown-toggle ')]");
//		ChromeDriver driver = (ChromeDriver) DriverFactory.getDriver();
				
//		WebElement element = driver.findElement(By.xpath("//nav[contains(concat(' ', @class, ' '), ' navbar ')]/ul[contains(concat(' ', @class, ' '), ' navbar-nav ')]/li[contains(concat(' ', @class, ' '), ' nav-item ')]/a[contains(concat(' ', @class, ' '), ' dropdown-toggle ')]"));
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click();", element);
		
		clickXpath("//nav[contains(concat(' ', @class, ' '), ' navbar ')]/ul[contains(concat(' ', @class, ' '), ' navbar-nav ')]/li[contains(concat(' ', @class, ' '), ' nav-item ')]/ul/li/a[@href='/userSessions']");
	
	
	  // clickXpath("//nav[contains(concat(' ', @class, ' '), ' navbar ')]/ul[contains(concat(' ', @class, ' '), ' navbar-nav ')]/li[contains(concat(' ', @class, ' '), ' nav-item ')]/ul/li/a[@href='/changePassword']");

	}
}
