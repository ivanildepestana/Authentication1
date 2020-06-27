package br.ce.ip.core;

import static br.ce.ip.core.DriverFactory.getDriver;
import static br.ce.ip.core.DriverFactory.killDriver;


	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.junit.After;
	import org.junit.Before;
	import org.junit.Rule;
	import org.junit.rules.TestName;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;

	import br.ce.ip.pages.SignIn;

	public class BaseTest  {
		private SignIn page = new SignIn();
			
		@Rule
		public TestName testName = new TestName();
		
		@Before
		public void initialize() {
			page.accessHomeScreen();
				
			
			page.setSignin("signin");
			page.setEmail("teste23@teste.com.br");
			page.setPassword("234@Ai");
			page.Login();
		}
		
		@After
		public void ends () throws IOException{
			System.setProperty("webdriver.chrome.driver", "/home/ivanilde/Desktop/Automation/chromedriver/chromedriver");
			DriverFactory.getDriver();
			TakesScreenshot ss = (TakesScreenshot) getDriver();
			File file = ss.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("target" + File.separator + "screenshot" +
					File.separator + testName.getMethodName() + ".jpg"));
			
			if(Properties.FECHAR_BROWSER) {
				killDriver();
			}
		}

}
